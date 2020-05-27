package com.dsa;

import com.dsa.linkedlist.ssl.impl.SingleLinkedList;

import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Main {

  public static void main(String[] args) {

    String txt = "{[]{()}}";

    char[] ch = txt.toCharArray();
    Stack<Character> s = new Stack<>();
    for(char c : ch){
      if(s.isEmpty()){
        s.push(c);
        continue;
      }
      if(s.peek() - c == -1 || s.peek() - c == -2){
        s.pop();
        continue;
      }
      s.push(c);
    }
    if(s.isEmpty()){
      System.out.println("Balanced");
    }else{
      System.out.println("Unbalanced");
    }
  }

  //only positive number


  static int findSubarraySum(int arr[]) {
    HashMap<Integer, Integer> prevSum = new HashMap<>();
    int res = 0;
    int currsum = 0;
    for (int i = 0; i < arr.length; i++) {
      currsum += arr[i];
      if (currsum == 0)
        res++;
      if (prevSum.containsKey(currsum - 0))
        res += prevSum.get(currsum - 0);
      Integer count = prevSum.get(currsum);
      if (count == null)
        prevSum.put(currsum, 1);
      else
        prevSum.put(currsum, count + 1);
    }
    return res;
  }

  static String[] solution(int N, int K) {
    if (N == 0) {
      return new String[] {""};
    }
    ArrayList<String> result = new ArrayList<String>();
    for (String p : solution(N - 1, K)) {
      for (char l : new char[] {'a', 'b', 'c'}) {
        int pLen = p.length();
        if (pLen == 0 || p.charAt(pLen - 1) != l) {
          result.add(p + l);
        }
      }
    }
    int prefSize = Math.min(result.size(), K);
    return result.subList(0, prefSize).toArray(new String[prefSize]);
  }

  public static String findLongestPalindrome(String s) {
    if (s == null || s.length() == 0)
      return "";

    char[] s2 = addBoundaries(s.toCharArray());
    int[] p = new int[s2.length];
    int c = 0, r = 0; // Here the first element in s2 has been processed.
    int m = 0, n = 0; // The walking indices to compare if two elements are the same.
    for (int i = 1; i < s2.length; i++) {
      if (i > r) {
        p[i] = 0;
        m = i - 1;
        n = i + 1;
      } else {
        int i2 = c * 2 - i;
        if (p[i2] < (r - i - 1)) {
          p[i] = p[i2];
          m = -1; // This signals bypassing the while loop below.
        } else {
          p[i] = r - i;
          n = r + 1;
          m = i * 2 - n;
        }
      }
      while (m >= 0 && n < s2.length && s2[m] == s2[n]) {
        p[i]++;
        m--;
        n++;
      }
      if ((i + p[i]) > r) {
        c = i;
        r = i + p[i];
      }
    }
    int len = 0;
    c = 0;
    for (int i = 1; i < s2.length; i++) {
      if (len < p[i]) {
        len = p[i];
        c = i;
      }
    }
    char[] ss = Arrays.copyOfRange(s2, c - len, c + len + 1);
    return String.valueOf(removeBoundaries(ss));
  }

  private static char[] addBoundaries(char[] cs) {
    if (cs == null || cs.length == 0)
      return "||".toCharArray();

    char[] cs2 = new char[cs.length * 2 + 1];
    for (int i = 0; i < (cs2.length - 1); i = i + 2) {
      cs2[i] = '|';
      cs2[i + 1] = cs[i / 2];
    }
    cs2[cs2.length - 1] = '|';
    return cs2;
  }

  private static char[] removeBoundaries(char[] cs) {
    if (cs == null || cs.length < 3)
      return "".toCharArray();

    char[] cs2 = new char[(cs.length - 1) / 2];
    for (int i = 0; i < cs2.length; i++) {
      cs2[i] = cs[i * 2 + 1];
    }
    return cs2;
  }

  public static String longestPalindrome(String s) {
      /*if(s.substring(s.length()/2).equals(s.substring(0,s.length()/2-1))){
          return s;
      }
        if(s.matches("^(.)\\1*$")){
            return s;
        }*/

    int start = 0;
    int end = 0;

    for (int i = 0; i < s.length(); i++) {
      int len1 = expandCenter(s, i, i);
      int len2 = expandCenter(s, i, i + 1);

      int len = Math.max(len1, len2);
      if (len > end - start + 1) {
        start = i - (len - 1) / 2;
        end = i + len / 2;
      }
    }

    return s.substring(start, end + 1);
  }

  static boolean allCharactersSame(String s) {
    int n = s.length();
    for (int i = 1; i < n; i++)
      if (s.charAt(i) != s.charAt(0))
        return false;

    return true;
  }

  public static int expandCenter(String s, int left, int right) {
    while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
      left--;
      right++;
    }

    return right - left - 1;
  }

  static int longestPalSubstr(String str) {
    int n = str.length();
    boolean table[][] = new boolean[n][n];
    int maxLength = 1;
    for (int i = 0; i < n; ++i)
      table[i][i] = true;

    int start = 0;
    for (int i = 0; i < n - 1; ++i) {
      if (str.charAt(i) == str.charAt(i + 1)) {
        table[i][i + 1] = true;
        start = i;
        maxLength = 2;
      }
    }
    for (int k = 3; k <= n; ++k) {
      for (int i = 0; i < n - k + 1; ++i) {
        int j = i + k - 1;
        if (table[i + 1][j - 1] && str.charAt(i) ==
          str.charAt(j)) {
          table[i][j] = true;
          if (k > maxLength) {
            start = i;
            maxLength = k;
          }
        }
      }
    }
    System.out.print("Longest palindrome substring is; ");
    printSubStr(str, start, start + maxLength - 1);

    return maxLength;
  }

  static void printSubStr(String str, int low, int high) {
    System.out.println(str.substring(low, high + 1));
  }

  public static boolean ispalindrome(int x) {
    int ans = 0;
    int temp = x;
    while (temp > 0) {
      ans = 10 * ans + temp % 10;
      temp = temp / 10;
    }
    return ans == x;
  }

  // Function to return required
  // count of palindromes
  public static int SuperPalindromes(int L,
    int R) {
    // Range [L, R]

    // Upper limit
    int LIMIT = 100000;

    int ans = 0;

    // count odd length palindromes
    for (int i = 0; i < LIMIT; i++) {

      // if s = '1234'
      String s = Integer.toString(i);

      StringBuilder rs = new StringBuilder();
      rs.append(s.substring(0,
        Math.max(1, s.length() - 1)));
      String srs = rs.reverse().toString();

      // then, t = '1234321'
      String p = s + srs;
      int p_sq = (int) (Math.pow(
        Integer.parseInt(p), 2));
      if (p_sq > R) {
        break;
      }
      if (p_sq >= L && ispalindrome(p_sq)) {
        ans = ans + 1;
      }
    }

    // count even length palindromes
    for (int i = 0; i < LIMIT; i++) {

      // if s = '1234'
      String s = Integer.toString(i);

      StringBuilder rs = new StringBuilder();
      rs.append(s);
      rs = rs.reverse();

      String p = s + rs; // then, t = '12344321'
      int p_sq = (int) (Math.pow(
        Integer.parseInt(p), 2));
      if (p_sq > R) {
        break;
      }
      if (p_sq >= L && ispalindrome(p_sq)) {
        ans = ans + 1;
      }
    }

    // Return count of super-palindromes
    return ans;
  }

}

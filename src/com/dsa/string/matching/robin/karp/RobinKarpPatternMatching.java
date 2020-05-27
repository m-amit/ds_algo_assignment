package com.dsa.string.matching.robin.karp;

public class RobinKarpPatternMatching {

    public static void main(String[] args) {
        String text = "All students who solve assignments go to Heaven, and who don't you know where.";
        String pattern = "assignments";
        robinKarpStringMatching(text, pattern);
        //normalPatternMatching(text, pattern);
    }


    //in this method we are using in built hashCode function
    //need to write my own hashing function and recalculating func
    private static void robinKarpStringMatching(String txt, String pattern) {
        int hashOfPattern = pattern.hashCode();
        int patternLength = pattern.length();
        for (int i = 0; i < txt.length(); i++) {
            int hashOfSub = 0;
            if(i==0){
                hashOfSub = txt.substring(i, i + patternLength).hashCode();
            }else{
                hashOfSub = txt.substring(i, i+ patternLength).hashCode();
            }

            if(hashOfSub == hashOfPattern){
                System.out.println("match found");
            }
        }
    }


    private static void normalPatternMatching(String text, String pattern) {
        String[] txtArr = text.split(" ");
        for (String str : txtArr) {
            if (str.equals(pattern)) {
                System.out.println("Yes pattern is present");
            }
        }
    }
}

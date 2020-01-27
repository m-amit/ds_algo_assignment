package com.dsa.stack.tower.of.hanoi;

import java.util.Stack;

public class TowerOfHanoi {

  public static void main(String[] args) {
    Stack<Integer> source = getSourceStack();
    Stack<Integer> auxStack = new Stack<>();
    Stack<Integer> target = new Stack<>();

    //playTowerOfHanoi(source.size(), source, auxStack, target);
    System.out.println(2 % 3);
    //towerOfHanoi(4,'A','B','C');
  }

  private static void playTowerOfHanoi(Integer n, Stack<Integer> a, Stack<Integer> b, Stack<Integer> c) {
    n = (int) Math.pow(2,n)-1;
    for(int i=1;i<=n;i++){
      while (i<4){
        moveNumber(a,c);
        i++;
        moveNumber(a,b);
        i++;
        moveNumber(c,b);
        i++;
      }
      while (i>3 && i <7){
        moveNumber(a,c);
        i++;
        moveNumber(b,a);
        i++;
        moveNumber(b,c);
        i++;
      }
      while(i>6 && i<8){
        moveNumber(a,c);
        i++;
      }
    }

    /*if(n ==1){
      Integer disk = a.pop();
      System.out.println("Moving Disk "+disk+" From source to target");
      c.push(disk);
      return;
    }
    playTowerOfHanoi(n - 1, a, b, c);
    Integer disk = a.pop();
    c.push(disk);
    System.out.println("Move disk " + n + " from stack " + a + " to stack " + c);
    playTowerOfHanoi(n - 1, c, a, b);*/
  }

  static void moveNumber(Stack<Integer> source, Stack<Integer> targer){
    targer.push(source.pop());
  }

  static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
    if (n == 1) {
      System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
      return;
    }
    towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
    System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
    towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
  }

  static Stack<Integer> getSourceStack() {
    Stack<Integer> source = new Stack<>();
    source.add(3);
    source.add(2);
    source.add(1);
    return source;
  }
}

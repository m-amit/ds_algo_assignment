package com.dsa.linkedlist.ssl.problems;

import com.dsa.linkedlist.Node;
import com.dsa.linkedlist.ssl.impl.SingleLinkedList;

public class PrintMiddleNodeWithoutUsingSize {

  public static void main(String[] args) {
    SingleLinkedList<String> sll = new SingleLinkedList<>();
    sll.add("1234");
    sll.add("4567");
    sll.add("7689");
    sll.add("xbxb");
    sll.add("ghgh");
    sll.add("klkl");
    sll.add("qprs");

    printMiddleNode(sll);
  }

  static void printMiddleNode(SingleLinkedList<String> sll){
    Node slowNode = sll.getHead();
    Node fastNode = slowNode;

    while (null != fastNode && fastNode.getNextNode() != null){
      slowNode = slowNode.getNextNode();
      fastNode = fastNode.getNextNode().getNextNode();
    }
    System.out.println(slowNode.getData());
  }
}

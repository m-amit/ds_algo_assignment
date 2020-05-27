package com.dsa.tree.binary.linkedlist;

public class BinaryTreeTest {

  public static void main(String[] args) {
    BinaryTree<Integer> binaryTree = new BinaryTree<>();

    binaryTree.insert(20);
    binaryTree.insert(100);
    binaryTree.insert(3);
    binaryTree.insert(50);
    binaryTree.insert(15);
    binaryTree.insert(151);
    binaryTree.insert(152);
    binaryTree.insert(153);
    binaryTree.insert(154);
    binaryTree.insert(155);
    binaryTree.insert(156);
    binaryTree.insert(157);
    binaryTree.insert(158);
    binaryTree.insert(159);
    binaryTree.insert(150);

    System.out.println("pre order traversal");
    binaryTree.preOrderTraversal(binaryTree.getRootNode());

    System.out.println();
    System.out.println("In order traversal");
    binaryTree.inOrderTraversal(binaryTree.getRootNode());

    System.out.println();
    System.out.println("post order traversal");
    binaryTree.postOrderTraversal(binaryTree.getRootNode());

    System.out.println();
    System.out.println("level order traversal");
    binaryTree.levelOrderTraversal(binaryTree.getRootNode());

  }
}

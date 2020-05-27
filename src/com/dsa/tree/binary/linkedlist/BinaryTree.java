package com.dsa.tree.binary.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<E> {

  private TreeNode<E> rootNode;

  public BinaryTree() {
    this.rootNode = null;
  }

  public BinaryTree(E data) {
    this.rootNode = new TreeNode<>(data, null, null);
  }

  public void insert(E data) {
    if (rootNode == null) {
      this.rootNode = new TreeNode<>(data);
    } else {
      TreeNode<E> treeNode = null;
      Queue<TreeNode> queue = new LinkedList();
      queue.add(rootNode);
      while (!queue.isEmpty()) {
        treeNode = queue.remove();

        if (null == treeNode.getLeftNode()) {
          TreeNode<E> newNode = new TreeNode<>(data);
          treeNode.setLeftNode(newNode);
          break;
        }
        if (null == treeNode.getRightNode()) {
          TreeNode<E> newNode = new TreeNode<>(data);
          treeNode.setRightNode(newNode);
          break;
        }
        queue.add(treeNode.getLeftNode());
        queue.add(treeNode.getRightNode());
      }
    }
  }

  public void preOrderTraversal(TreeNode<E> node) {
    if(null == node){
      return;
    }
    System.out.print(node.getData() +" ");
    preOrderTraversal(node.getLeftNode());
    preOrderTraversal(node.getRightNode());
  }

  public void inOrderTraversal(TreeNode<E> node) {
    if(null == node){
      return;
    }
    preOrderTraversal(node.getLeftNode());
    System.out.print(node.getData() +" ");
    preOrderTraversal(node.getRightNode());
  }

  public void postOrderTraversal(TreeNode<E> node) {
    if(null == node){
      return;
    }
    preOrderTraversal(node.getLeftNode());
    preOrderTraversal(node.getRightNode());
    System.out.print(node.getData() +" ");
  }

  public void levelOrderTraversal(TreeNode<E> node){
    Queue<TreeNode> queue = new LinkedList();
    queue.add(node);
    while(!queue.isEmpty()){
      TreeNode rootNode = queue.remove();
      if(null != rootNode.getLeftNode()){
        queue.add(rootNode.getLeftNode());
      }
      if(null != rootNode.getRightNode()){
        queue.add(rootNode.getRightNode());
      }
      System.out.print(rootNode.getData() +" ");
    }
  }

  public TreeNode<E> getRootNode() {
    return this.rootNode;
  }

}

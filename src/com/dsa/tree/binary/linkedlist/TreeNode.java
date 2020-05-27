package com.dsa.tree.binary.linkedlist;

public class TreeNode<E> {

  private E data;
  private TreeNode<E> leftNode;
  private TreeNode<E> rightNode;

  public TreeNode( E data, TreeNode<E> leftNode, TreeNode<E> rightNode){
    this.data = data;
    this.leftNode = leftNode;
    this.rightNode = rightNode;
  }

  public TreeNode(E data){
    this.data = data;
  }

  public E getData() {
    return data;
  }

  public void setData(E data) {
    this.data = data;
  }

  public TreeNode<E> getLeftNode() {
    return leftNode;
  }

  public void setLeftNode(TreeNode<E> leftNode) {
    this.leftNode = leftNode;
  }

  public TreeNode<E> getRightNode() {
    return rightNode;
  }

  public void setRightNode(TreeNode<E> rightNode) {
    this.rightNode = rightNode;
  }
}

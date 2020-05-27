package com.dsa.tree.bst;

import com.dsa.tree.binary.linkedlist.BinaryTree;
import com.dsa.tree.binary.linkedlist.TreeNode;

public class BST extends BinaryTree<Integer> {

  private TreeNode<Integer> rootNode;

  public BST(){
    this.rootNode = null;
  }

  public BST(Integer data){
    this.rootNode = new TreeNode<>(data);
  }

  public void add(Integer val){
    if(null == rootNode){
      this.rootNode = new TreeNode<>(val);
      return;
    }
    addNode(rootNode, val);
  }

  private void addNode(TreeNode<Integer> node, Integer val) {
    if (null == node.getLeftNode() && null == node.getRightNode()) {
      if (val.equals(node.getData())) {
        System.out.println("Duplicates are not allowed in Binary Search Tree");
        return;
      }
      if (val < node.getData()) {
        node.setLeftNode(new TreeNode<>(val));
        return;
      }
      if (val > node.getData()) {
        node.setRightNode(new TreeNode<>(val));
        return;
      }
    }
    if (val < node.getData() && null != node.getLeftNode()) {
      addNode(node.getLeftNode(), val);
    } else {
      node.setLeftNode(new TreeNode<>(val));
      return;
    }
    if(val > node.getData() && null != node.getRightNode()){
      addNode(node.getRightNode(), val);
    }else{
      node.setRightNode(new TreeNode<>(val));
      return;
    }
  }

}

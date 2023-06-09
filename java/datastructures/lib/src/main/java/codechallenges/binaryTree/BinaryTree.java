package codechallenges.binaryTree;

import java.util.ArrayList;

public class BinaryTree {

  // methods

  public <T> void preOrder(Node<T> node){
    ArrayList<T> arr = new ArrayList<T>();
    // data logic
arr.add(node.value);
    // left
preOrder(node.left);
    // right
preOrder(node.right);
  }

  public <T> void inOrder(Node<T> node){
    ArrayList<T> arr = new ArrayList<T>();
    //left
    inOrder(node.left);
    // data logic
    arr.add(node.value);
    //right
    inOrder(node.right);

  }

  public <T> void postOrder(Node<T> node){
    ArrayList<T> arr = new ArrayList<T>();
    postOrder(node.left);
    postOrder(node.right);
    arr.add(node.value);

  }

}

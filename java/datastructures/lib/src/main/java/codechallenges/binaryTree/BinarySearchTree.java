
//package codechallenges.binaryTree;
//
//public class BinarySearchTree extends BinaryTree {
//
//
//public void add(Integer value, Node node){
//
//  Node topNode = new Node<>(10);
//  if(node.left!=null) {
//    postOrder(node, node.left);
//  }
//}
//
//}
package codechallenges.binaryTree;

public class BinarySearchTree extends BinaryTree {

Node root;
public void add(Integer value){
Node newNode = new Node(value);
if(root == null){
  root = newNode;
}
Node currentNode = root;
while(currentNode != null){
  if (value<currentNode.value){
    if(currentNode.left == null){
      currentNode.left = newNode;
      return;
    }
currentNode = currentNode.left;
  } else if (value>currentNode.value) {
    if(currentNode.right == null){
      currentNode.right = newNode;
      return;
    }
    currentNode=currentNode.right;
  }else {
    return;
  }
}
}

public static class Node{
  int value;
  Node left;
  Node right;
  public Node(int value){
    this.value = value;
  }
}
}


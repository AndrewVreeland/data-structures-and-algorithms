package codechallenges.hashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TreeIntersection {

  // this will be our node for our tree
  public static class TreeNode {
    int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val){
      this.val = val;
      this.left = null;
      this.right = null;
    }

  }

 public List<Integer> treeIntersection(TreeNode tree1, TreeNode tree2){
    List<Integer> values1 = getTreeValues(tree1);
    List<Integer> values2 = getTreeValues(tree2);
    List<Integer> intersection = new ArrayList<>();

   HashMap<Integer, Boolean> hashmap = new HashMap<>();
   for(int val : values1){
     hashmap.put(val, true);
   }

   for(int val : values2){
     if(hashmap.containsKey(val)){
       intersection.add(val);
     }
   }
   return intersection;
 }

 private List<Integer> getTreeValues(TreeNode root){
    List<Integer> values = new ArrayList<>();
    if(root == null){
      return values;
    }

    inorderTraversal(root, values);
    return values;
 }
 private void inorderTraversal(TreeNode root, List<Integer> values){
    if(root != null){
      inorderTraversal(root.left, values);
      values.add(root.val);
      inorderTraversal(root.right, values);
    }
 }


}

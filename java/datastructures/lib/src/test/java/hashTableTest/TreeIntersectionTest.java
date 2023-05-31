package hashTableTest;

import codechallenges.hashTable.TreeIntersection.TreeNode;
import org.junit.Test;
import codechallenges.hashTable.TreeIntersection;


import java.util.List;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;


public class TreeIntersectionTest {


  @Test
  public void testTreeIntersection() {
    // Create tree 1
    TreeNode tree1 = new TreeNode(1);
    tree1.left = new TreeNode(2);
    tree1.right = new TreeNode(3);
    tree1.left.left = new TreeNode(4);
    tree1.left.right = new TreeNode(5);

    // Create tree 2
    TreeNode tree2 = new TreeNode(1);
    tree2.left = new TreeNode(2);
    tree2.right = new TreeNode(3);
    tree2.right.left = new TreeNode(6);
    tree2.right.right = new TreeNode(5);

    // Create TreeIntersection object and call treeIntersection method
    TreeIntersection treeIntersection = new TreeIntersection();
    List<Integer> intersection = treeIntersection.treeIntersection(tree1, tree2);

    // Assert that the intersection contains the expected values
    assertEquals(3, intersection.size());
    assertTrue(intersection.contains(1));
    assertTrue(intersection.contains(2));
    assertTrue(intersection.contains(5));
  }

  @Test
  public void testTreeIntersection_EmptyTrees() {
    // Create empty trees
    TreeNode tree1 = null;
    TreeNode tree2 = null;

    // Create TreeIntersection object and call treeIntersection method
    TreeIntersection treeIntersection = new TreeIntersection();
    List<Integer> intersection = treeIntersection.treeIntersection(tree1, tree2);

    // Assert that the intersection is empty
    assertEquals(0, intersection.size());
  }

  @Test
  public void testTreeIntersection_NoIntersection() {
    // Create tree 1
    TreeNode tree1 = new TreeNode(1);
    tree1.left = new TreeNode(2);
    tree1.right = new TreeNode(3);

    // Create tree 2
    TreeNode tree2 = new TreeNode(4);
    tree2.left = new TreeNode(5);
    tree2.right = new TreeNode(6);

    // Create TreeIntersection object and call treeIntersection method
    TreeIntersection treeIntersection = new TreeIntersection();
    List<Integer> intersection = treeIntersection.treeIntersection(tree1, tree2);

    // Assert that the intersection is empty
    assertEquals(0, intersection.size());
  }
}


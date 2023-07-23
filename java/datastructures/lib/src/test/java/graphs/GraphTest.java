package graphs;




import codechallenges.graph.Edge;
import codechallenges.graph.Graph;
import codechallenges.graph.Vertex;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class GraphTest {

  private Graph<Integer> graph;

  @Before
  public void setup() {
    graph = new Graph<>(10); // Initialize the graph with a maximum of 10 vertices
  }

  @Test
  public void testAddVertex() {
    Vertex<Integer> vertex = graph.addVertex(5);

    Assert.assertEquals(1, graph.size());
    Assert.assertTrue(graph.getVertices().contains(vertex));
  }

  @Test
  public void testAddEdge() {
    Vertex<Integer> vertex1 = graph.addVertex(5);
    Vertex<Integer> vertex2 = graph.addVertex(10);

    graph.addEdge(vertex1, vertex2);
    LinkedList<Edge<Integer>> neighbors = graph.getNeighbors(vertex1);

    Assert.assertEquals(1, neighbors.size());
    Assert.assertTrue(neighbors.contains(vertex2));

  }

  @Test
  public void testGetVertices() {
    Vertex<Integer> vertex1 = graph.addVertex(5);
    Vertex<Integer> vertex2 = graph.addVertex(10);
    Vertex<Integer> vertex3 = graph.addVertex(15);

    LinkedList<Vertex<Integer>> vertices = graph.getVertices();

    Assert.assertEquals(3, vertices.size());
    Assert.assertTrue(vertices.contains(vertex1));
    Assert.assertTrue(vertices.contains(vertex2));
    Assert.assertTrue(vertices.contains(vertex3));
  }

  @Test
  public void testGetNeighbors() {
    Vertex<Integer> vertex1 = graph.addVertex(5);
    Vertex<Integer> vertex2 = graph.addVertex(10);
    Vertex<Integer> vertex3 = graph.addVertex(15);

    graph.addEdge(vertex1, vertex2);
    graph.addEdge(vertex1, vertex3);

    LinkedList<Edge<Integer>> neighbors = graph.getNeighbors(vertex1);

    LinkedList<Vertex<Integer>> allVertices = graph.getVertices();
    allVertices.remove(vertex1); // Exclude the source vertex from the list

    Assert.assertEquals(allVertices.size(), neighbors.size());
    Assert.assertTrue(allVertices.containsAll(neighbors));
  }
  @Test
  public void testSize() {
    Assert.assertEquals(0, graph.size());

    graph.addVertex(5);
    graph.addVertex(10);
    graph.addVertex(15);

    Assert.assertEquals(3, graph.size());
  }
}


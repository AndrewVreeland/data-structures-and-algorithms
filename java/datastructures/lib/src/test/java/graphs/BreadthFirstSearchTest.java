package graphs;

import codechallenges.graph.BreadthFirstSearch;
import codechallenges.graph.Graph;
import codechallenges.graph.Vertex;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BreadthFirstSearchTest {
  @Test
  public void testBreadthFirstSearch() {
    Graph<Integer> graph = new Graph<>(10);
    Vertex<Integer> vertex1 = graph.addVertex(1);
    Vertex<Integer> vertex2 = graph.addVertex(2);
    Vertex<Integer> vertex3 = graph.addVertex(3);
    Vertex<Integer> vertex4 = graph.addVertex(4);
    Vertex<Integer> vertex5 = graph.addVertex(5);

    graph.addEdge(vertex1, vertex2);
    graph.addEdge(vertex1, vertex3);
    graph.addEdge(vertex2, vertex4);
    graph.addEdge(vertex3, vertex4);
    graph.addEdge(vertex4, vertex5);

    BreadthFirstSearch<Integer> bfs = new BreadthFirstSearch<>();
    List<Vertex<Integer>> visitedVertices = bfs.breadthFirst(graph, vertex1);

    List<Integer> expectedOrder = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> actualOrder = visitedVertices.stream()
      .map(vertex -> vertex.value)
      .collect(Collectors.toList());

    Assert.assertEquals(expectedOrder, actualOrder);
  }
}

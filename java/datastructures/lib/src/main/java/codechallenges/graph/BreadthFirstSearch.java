package codechallenges.graph;
import org.w3c.dom.Node;

import java.util.*;



public class BreadthFirstSearch<T extends Comparable<? super T>> {
  public List<Vertex<T>> breadthFirst(Graph<T> graph, Vertex<T> startVertex) {
    List<Vertex<T>> visited = new ArrayList<>(); // To store visited vertices
    Queue<Vertex<T>> queue = new LinkedList<>(); // To store vertices to visit

    Set<Vertex<T>> visitedSet = new HashSet<>(); // To keep track of visited vertices

    visitedSet.add(startVertex); // Mark the starting vertex as visited
    queue.add(startVertex);

    while (!queue.isEmpty()) {
      Vertex<T> currentVertex = queue.poll();
      visited.add(currentVertex);

      LinkedList<Edge<T>> neighbors = graph.getNeighbors(currentVertex); // Get the neighbors of the current vertex
      for (Edge<T> edge : neighbors) {
        Vertex<T> neighbor = edge.destination;
        if (!visitedSet.contains(neighbor)) {
          visitedSet.add(neighbor);
          queue.add(neighbor);
        }
      }
    }

    return visited;
  }
}

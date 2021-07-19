import java.util.HashMap;
import java.util.Map;

class Vertex {
	HashMap<String, Integer> neighbours = new HashMap<>();
}

class Graph {
	HashMap<String, Vertex> vertices = new HashMap<String, Vertex>();
	
	public void addVertex(String vertexName) {
		Vertex vertex = new Vertex();
		vertices.put(vertexName, vertex);
	}
	
	public boolean isEdgeExist(String firstVertexName, String secondVertexName) {
		Vertex first = vertices.get(firstVertexName);
		Vertex second = vertices.get(secondVertexName);
		if(first == null || second == null || !first.neighbours.containsKey(secondVertexName)) {
			return false;
		}
		return true;
	}
	
	public void addEdge(String firstVertexName, String secondVertexName, int weight) {
		if(isEdgeExist(firstVertexName, secondVertexName)) {
			System.out.println("Edge already present Between :: " + firstVertexName + " " + secondVertexName);
		}
		else {
			Vertex first = vertices.get(firstVertexName);
			Vertex second = vertices.get(secondVertexName);
			first.neighbours.put(secondVertexName, weight);
			second.neighbours.put(firstVertexName, weight);
		}
	}
	
	public void print() {
		for(Map.Entry<String, Vertex> currentVertex : vertices.entrySet()) {
			System.out.println("VName : " + currentVertex.getKey() + " Neighbour " + currentVertex.getValue().neighbours);
		}
	}
	
	public void removeEdge(String firstVertexName, String secondVertexName) {
		if(isEdgeExist(firstVertexName, secondVertexName)) {
			Vertex first = vertices.get(firstVertexName);
			Vertex second = vertices.get(secondVertexName);
			first.neighbours.remove(secondVertexName);
			second.neighbours.remove(firstVertexName);
			System.out.println("Removed Edge...");
		}
		else {
			System.out.println("No Edge Exist...");
		}
	}
	
//	public void removeVertex(String vertexName) {
//		
//	}
	
}

public class GraphUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		
		graph.addEdge("A", "B", 2);
		graph.addEdge("B", "C", 4);
		graph.addEdge("C", "D", 2);
		graph.addEdge("A", "D", 5);
		
		graph.print();
	}

}

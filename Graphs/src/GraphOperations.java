import java.util.ArrayList;
import java.util.LinkedList;

public class GraphOperations {
	
	static void addEdge(ArrayList<ArrayList<Integer>> list, int u, int v) {
		list.get(u).add(v);
		list.get(v).add(u);
	}
	
	static void bfsDisconnected(ArrayList<ArrayList<Integer>> list, boolean marked[], int source) {
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		marked[source] = true;
		queue.add(source);
		
		while(queue.size() != 0) {
			source = queue.poll();
			System.out.print(source + " ");
			for(int i = 0; i < list.get(source).size(); i++) {
				// adjacent node
				int newNode = list.get(source).get(i);
				if(marked[newNode] == false) {
					marked[newNode] = true;
					queue.add(newNode);
				}
			}
		}
	}
	
	static void bfsCall(ArrayList<ArrayList<Integer>> list, int v) {
		boolean marked[] = new boolean[v+1];
		int count = 0;
		for(int i = 1; i <= v; i++) {
			marked[i] = false;
		}
		for(int i = 1; i < v; i++) {
			if(marked[i] == false) {
				bfsDisconnected(list, marked, i);
				count++;
			}
		}
		System.out.println();
		System.out.println("Connected Components / Island : " + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vertices = 9;
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(vertices+1);
		for(int i = 0; i < vertices+1; i++) {
			list.add(new ArrayList<Integer>());
		}
		addEdge(list, 1, 2);
		addEdge(list, 1, 3);
		addEdge(list, 2, 4);
		addEdge(list, 2, 5);
		addEdge(list, 3, 5);
		addEdge(list, 4, 5);
		addEdge(list, 4, 6);
		addEdge(list, 5, 6);
		
		addEdge(list, 7, 8);
		addEdge(list, 7, 9);
		addEdge(list, 9, 8);
		
//		bfs(list, vertices);
		bfsCall(list,vertices);
	}

}

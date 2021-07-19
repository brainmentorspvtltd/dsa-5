import java.util.ArrayList;

public class GraphDemo {
	
	static void addEdge(ArrayList<ArrayList<Integer>> list, int u, int v) {
		list.get(u).add(v);
		list.get(v).add(u);
	}
	
	static void print(ArrayList<ArrayList<Integer>> list) {
		for(int i = 0; i < list.size(); i++) {
			for(int j = 0; j < list.get(i).size(); j++) {
				System.out.print(list.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vertices = 4;
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(vertices);
		for(int i = 0; i < vertices; i++) {
			list.add(new ArrayList<Integer>());
		}
		addEdge(list, 0, 1);
		addEdge(list, 0, 2);
		addEdge(list, 1, 2);
		addEdge(list, 2, 3);
		
		print(list);
	}

}

import java.util.ArrayList;

public class CycleInUndirected {
	
	static void addEdge(ArrayList<ArrayList<Integer>> list, int u, int v) {
		list.get(u).add(v);
		list.get(v).add(u);
	}
	
	static boolean detectCycle(ArrayList<ArrayList<Integer>> list, int source, boolean marked[], int parent) {
		marked[source] = true;
		for(int item : list.get(source)) {
			if(marked[item] == false) {
				boolean result = detectCycle(list, item, marked, source);
				if(result) {
					return true;
				}
			}
		}
		return false;
	}
	
	static void caller(ArrayList<ArrayList<Integer>> list, int v, int source) {
		boolean marked[] = new boolean[v + 1];
		for(int i = 1; i < v; i++) {
			marked[i] = false;
		}
		for(int i = 0; i < v; i++) {
			if(marked[i] == false) {
				if(detectCycle(list, i, marked, -1) == true) {
					System.out.println("Cycle Detected...");
					return;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

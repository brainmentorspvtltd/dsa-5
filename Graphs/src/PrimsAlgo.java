import java.util.Arrays;

public class PrimsAlgo {
	static final int v = 4;
	static int prims(int graph[][]) {
		int keys[] = new int[v];
		int result = 0;
		boolean set[] = new boolean[v];
		Arrays.fill(keys, Integer.MAX_VALUE);
		keys[0] = 0;
		
		for(int i = 0; i < v; i++) {
			int source = -1;
			for(int j = 0; j < v; j++) {
				if(!set[j] && (source == -1 || keys[j] < keys[source])) {
					source = j;
				}
			}
			set[source] = true;
			result += keys[source];
			
			for(int vertex = 0; vertex < v; vertex++) {
				if(graph[source][vertex] != 0 && set[vertex] == false) {
					keys[vertex] = Math.min(keys[vertex], graph[source][vertex]);
				}
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int graph[][] = {
				{0,5,8,0},
				{5,0,10,15},
				{8,10,0,20},
				{0,15,20,0}
		};
		int result = prims(graph);
		System.out.println(result);
	}

}

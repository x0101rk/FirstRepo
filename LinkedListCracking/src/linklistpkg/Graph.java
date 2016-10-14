package linklistpkg;

import java.util.LinkedList;

public class Graph {

	private int V;
	// Array of LinkedList which gives us the adj list
	private LinkedList<Integer> adj[];
	
	@SuppressWarnings("unchecked")
	/*BFS(int v){
		this.V = v;
		adj = new LinkedList[v];
		for(int i = 0; i< v ; i++){
			adj[i] = new LinkedList<Integer>();
		}
	}*/
	
	void addEdge(int v, int w){
		adj[v].add(w);
	}
	
}

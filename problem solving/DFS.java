
import java.util.*;
public class DFS {
    final static int N = 10000;
    static  boolean[] visited = new boolean[N];  
    static void dfsTravers(List<Integer>[] adjList, int src){
        visited[src] = true;
        System.out.print("--> "+src);
        for(int child: adjList[src]){
            if(!visited[child]){
                dfsTravers(adjList, child);
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("In Graph-->");        
        System.out.print("Number of vertices: ");
        int a = in.nextInt(); 
        System.out.print("Number of edges: ");
        int b = in.nextInt();
        
        List<Integer>[] adjList = new ArrayList[N];
        for(int i=1; i<=a; i++)
            adjList[i] = new ArrayList<>();
        System.out.println("Input edges as u <-> v format: ");
        for(int i=0; i<b; i++){
            int u = in.nextInt();
            int v = in.nextInt();
            adjList[u].add(v);            
            adjList[v].add(u);
        }
        System.out.print("Input source node: ");
        int src = in.nextInt(); 
        System.out.print("DFS travers: ");
        dfsTravers(adjList, src);
        System.out.println("");
    }
}
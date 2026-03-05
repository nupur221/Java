import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Beginers_Zelda{
    static Scanner in = new Scanner(System.in);
    static final int N = 100001;
    static boolean[] visited = new boolean[N];
    static List<Integer>[] adjList = new ArrayList[N];

    static int dfs(int node, int c){
        visited[node] = true;
        for(int child: adjList[node]){
            if(!visited[child]){
                c = dfs(child, c);
            }
        }
        if(adjList[node].size()==1)  c++;
        return c;
    }

    static void dark_chocolate(){
        int n = in.nextInt();
        for (int i = 0; i <= n; i++) {
            visited[i]=false;
            adjList[i]=new ArrayList<>();
        }

        for(int i = 1;i<n;i++){
            int u = in.nextInt();            
            int v = in.nextInt();
            adjList[u].add(v);                       
            adjList[v].add(u);
        }
        int source=0;
        for(int i = 1;i<=n;i++){
            if(adjList[i].size()==1){
                source = i;
                break;
            }
        }
        System.out.println(""+(dfs(source, 0)+1)/2);
        
        for (int i = 0; i <= n; i++) {
            visited[i]=false;
            adjList[i].clear();
        }
    }
    public static void main(String[] args) {
        int t = 1, T = 1;
        T = in.nextInt();
        while(t<=T){
            dark_chocolate();
            t++;
        }
    }
}
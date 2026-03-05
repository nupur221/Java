import java.util.*;

public class BFS {
    
    static final int N = 100000;
    static Queue<Integer> q = new LinkedList<>();
    static boolean[] visited = new boolean[N];
    static void bfs(List<Integer>[] adjList , int node , int sNode)
    {
        q.add(sNode);
        visited[sNode] = true;

        while(!q.isEmpty())
        {
            int parentNode = q.poll();
            System.out.println(" ->  " +parentNode);
            for(int child : adjList[parentNode])
            {
                if(!visited[child])
                q.add(child);
                visited[child] = true;
            }
        }
    }
public static void main(String[] args)
{
    
    Scanner input = new Scanner(System.in);
    System.out.println("In Graph");
    System.out.print("Number of node: ");
    int a = input.nextInt();
    System.out.print("Number of edge : ");
    int b = input.nextInt();
    
    int [] arr = new int[a];
    List<Integer>[] adjList = new ArrayList[N];

    for(int i = 1; i<=a ; i++)
    adjList[i] = new ArrayList<>();

    System.out.println("Input edges as u -> v format: ");
    for(int i = 1 ; i<=b ;i++)
    {
        int x = input.nextInt() ;
        int y = input.nextInt();
        adjList[x].add(y);
        adjList[y].add(x);
    }

    System.out.println("Input Source node : ");
    int sNode = input.nextInt();

    System.out.println("BFS trsvers : ");
    bfs(adjList,a,sNode);

}
}


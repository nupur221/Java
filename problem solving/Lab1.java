import java.util.*;
 public class Lab1 {

 int[] visited = new int[1000];
 List<Integer>[] adjList = new ArrayList[1000];
 Queue<Integer> q = new LinkedList<>();
int flag =0;

 void traversal(int source){
 q.add(source);
 visited[source]=0;
 while(!q.isEmpty()){
 int parent = q.poll();
 System.out.print(parent + " ");
 for(int child : adjList[parent]){

 if( visited[child]==0){
 flag=1;
 }
 if(visited[child]==-1){
 q.add(child);
 visited[child]=0;
   }
 }
 visited[parent]=1; }
 }
public static void main(String[] args) {
 Lab1 BFS = new Lab1();
 Scanner input = new Scanner(System.in);

 int numberOfNodes = input.nextInt();
 int numberOfEdges = input.nextInt();

 for(int i = 1;i<=numberOfNodes;i++){
 BFS.adjList[i] = new ArrayList<>();
 }
for(int i = 0;i<numberOfEdges;i++){
 int startOfEdge = input.nextInt();
 int endOfEdge = input.nextInt();
  BFS.adjList[startOfEdge].add(endOfEdge);
 BFS.adjList[endOfEdge].add(startOfEdge);}
   System.out.print("BFS Traversal: ");
 for(int i=1;i<=numberOfNodes;i++){
 BFS.visited[i]=-1;}
 BFS.traversal(1);
 System.out.println("");
 if(BFS.flag==1) System.out.println("This graph has a cycle.");
 else System.out.println("This graph has no cycle"); }
}

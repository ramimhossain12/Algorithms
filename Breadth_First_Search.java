import java.util.Iterator;
import java.util.LinkedList;

public class Breadth_First_Search {

    static class  Graph{
        private  int V;
        private LinkedList<Integer> adj[];//Adjacency Lists
        //constructor


        Graph(int v)
        {
            V = v;
            adj = new LinkedList[v];
            for (int i=0; i<v; ++i)
                adj[i] = new LinkedList();
        }
        //Function to add an edge into the graph
        void  addEdge(int v,int w){
            adj[v].add(w);
        }

        // prints BFS traversal from a given source s
        void  BFS(int s){
            boolean visited[] = new boolean[V];
            // Create a queue for BFS
            LinkedList<Integer> queue = new LinkedList<Integer>();
            // Mark the current node as visited and enqueue it
            visited[s]=true;
            queue.add(s);

            while (queue.size()!=0){
                s=queue.poll();
                System.out.print(s+" ");
                Iterator<Integer> i = adj[s].listIterator();

                while (i.hasNext())
                {
                    int n = i.next();
                    if (!visited[n])
                    {
                        visited[n] = true;
                        queue.add(n);
                    }
                }

            }
        }
    }

    public static  void main(String[] args) {
         Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);
        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        graph.BFS(2);

    }
}

import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int V = numCourses;
        List<Integer>[] adj = new ArrayList[V];
        Queue<Integer> q = new ArrayDeque<>();
        for(int i=0;i<V;i++)
        {
            adj[i] = new ArrayList<>();
        }

        var indegree = new int[V];

        for(int[] pre: prerequisites)
        {
            int u = pre[0], v = pre[1];
            adj[v].add(u);
            indegree[u]++;
        }
        int c = 0;
        for(int i=0;i<V;i++)
        {
            if(indegree[i]==0)
            {
                q.offer(i);
            }
        }
        while(!q.isEmpty())
        {
            int node = q.poll();
            c++;
            for(Integer n: adj[node])
            {
                if(--indegree[n]==0)
                    q.offer(n);
            }
        }
        return c == V;
    }
}

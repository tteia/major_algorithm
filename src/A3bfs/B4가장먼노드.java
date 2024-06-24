package A3bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class B4가장먼노드 {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    static int[] distance;

    public static void main(String[] args) {
        int n = 6;
        int[][] edge = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
        System.out.println(solution(n, edge));
    }

    public static int solution(int n, int[][] vertex) {
        adjList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : vertex) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        visited = new boolean[n + 1];
        distance = new int[n + 1];
        bfs(1);

        int maxDistance = 0;
        for (int dist : distance) {
            if (dist > maxDistance) {
                maxDistance = dist;
            }
        }

        int farthestNodesCount = 0;
        for (int dist : distance) {
            if (dist == maxDistance) {
                farthestNodesCount++;
            }
        }

        return farthestNodesCount;
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        distance[start] = 0;

        while (!queue.isEmpty()) {
            int temp = queue.poll();
            for (int neighbor : adjList.get(temp)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                    distance[neighbor] = distance[temp] + 1;
                }
            }
        }
    }
}

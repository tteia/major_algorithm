package A3bfs;

import java.util.*;

public class B3Basic3 {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    static int[] distance;

    public static void main(String[] args) {
        int[][] arr = {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 4}};
        adjList = new ArrayList<>();
        visited = new boolean[arr.length];
        distance = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] a : arr) {
            adjList.get(a[0]).add(a[1]);
        }

        int start = 0;
        int end = 3;
        int minDistance = bfs(start, end);
        System.out.println(minDistance);

    }

    static int bfs(int start,int end){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()){
            int temp = queue.poll();
            for(int target : adjList.get(temp)){
                if(!visited[target]){
                    queue.add(target);
                    distance[target] = distance[temp]+1;
                    visited[target] = true;
                    if(target == end){
                        return distance[target];
                    }
                }
            }
        }
        return -1; // 없어용
    }
}

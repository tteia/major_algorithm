package A3bfs;

import java.util.*;

// 배열을 한나 만들어서, 이 배열이 start node에서 얼마나 떨어져있는지 숫자값 담기
public class B2Basic2 {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    static int[] distance;
    public static void main(String[] args) {
        int[][] arr = {{0,1}, {0,2},{1,3},{2,3},{2,4}};
        adjList = new ArrayList<>();
        visited = new boolean[arr.length];
        distance = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] a : arr){
            adjList.get(a[0]).add(a[1]);
        }

//        int[] relation = new int[arr.length];
//        bfs(0, relation);
//        System.out.println(Arrays.toString(relation));

        bfs(0);
        System.out.println(Arrays.toString(distance));

    }


    static void bfs(int start){
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
                }
            }
        }
    }


}

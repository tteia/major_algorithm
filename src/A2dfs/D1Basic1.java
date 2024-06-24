package A2dfs;

import java.util.ArrayList;
import java.util.List;

public class D1Basic1 {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    public static void main(String[] args) {
        // 방문할 수 있는 정점이 여러개인 경우 정점번호가 작은 것을 먼저 방문하는
        // dfs알고리즘 형식의 방문순서를 출력하라
        // 0, 1, 3, 2, 4

        int[][] arr ={{0,1},{0,2},{1,3},{2,3},{2,4}};
        adjList = new ArrayList<>();
        for(int i=0;i<5;i++){  // 노드의 개수
            adjList.add(new ArrayList<>());
        }
        for(int[] a : arr){
            adjList.get(a[0]).add(a[1]);
            // 양방향일 경우
            // adjList.get(a[1]).add(a[0]);
        }
        visited = new boolean[5]; // 노드의 개수
        dfs(0);
    }
    static void dfs(int start){
        System.out.println(start);
        visited[start] = true;
        for(int target : adjList.get(start)){
            if(!visited[target]){
                dfs(target);
            }
        }
    }
}


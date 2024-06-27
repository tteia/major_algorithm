package A2dfs;

import java.util.*;

public class D5네트워크 {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int m = 0;
        boolean[] visited = new boolean[n];

        // 간선의 개수를 세기
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(computers[i][j] == 1){
                    m++;
                }
            }
        }

        // 네트워크의 수 계산
        for(int i = 0; i < n; i++){
            if (!visited[i]) {
                dfs(computers, visited, i);
                answer++;
            }
        }

        // 모든 컴퓨터가 하나의 네트워크로 연결된 경우
        if(m >= (n - 1)) {
            return 1;
        }

        return answer;
    }

    static void dfs(int[][] computers, boolean[] visited, int i) {
        visited[i] = true;

        for (int j = 0; j < computers.length; j++) {
            if (computers[i][j] == 1 && !visited[j]) {
                dfs(computers, visited, j);
            }
        }
    }
}

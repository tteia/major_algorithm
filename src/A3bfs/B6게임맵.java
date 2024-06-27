package A3bfs;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

// visited 안 쓰고 maps 값을 -1 로 바꿔도 OK

public class B6게임맵 {
    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        int answer = -1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0,1});
        int[] goY = {0,0,1,-1};
        int[] goX = {1, -1, 0, 0};
        boolean[][] visited = new boolean[maps.length][maps.length];
        visited[0][0] = true;
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            for(int i = 0; i < 4; i++){
                int nx = current[0] + goX[i];
                int ny = current[1] + goY[i];
                if(nx >= 0 && nx < maps[0].length && ny >= 0 && ny < maps.length && !visited[ny][nx]){ // maps.length 가 y(두번째 인덱스)를 가리킴.
                    if(maps[ny][nx] == 1){
                        queue.add(new int[]{nx, ny, current[2]+1});
                        visited[ny][nx] = true;
                        if(nx == maps[0].length-1 && ny == maps.length-1){
                            answer = current[2] + 1;
                            break;
                        }

                    }
                }
            }
        }
        System.out.println(answer);
    }

}

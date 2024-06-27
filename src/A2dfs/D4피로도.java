package A2dfs;

public class D4피로도 {
    static boolean[] visited;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};
        visited = new boolean[dungeons.length];
        dfs(dungeons, k, 0);
    }

    // 전형적인 dfs 코드. 외워두는 것이 좋다. (max 부분 제외)
    static void dfs(int[][] dungeons, int k, int cnt){
        if(cnt > max){
            max = cnt;
        }
        for(int i = 0; i < dungeons.length; i++){
            if(!visited[i] && k >= dungeons[i][0]){
                dfs(dungeons, k-dungeons[i][1], cnt+1);
            }
        }
    }
}

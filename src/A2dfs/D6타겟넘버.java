package A2dfs;

public class D6타겟넘버 {
    static int node = 0;
    static int[] numbers = {1,1,1,1,1};
    static int target = 3;
    static int answer = 0;
    static boolean[] visited = new boolean[numbers.length];

    public static void main(String[] args) {
        if(node != target){
            dfs(numbers, node);
        }
        answer++;
        System.out.println(answer);
    }

    public static void dfs(int[] numbers, int node) {
        if (!visited[node]) {
            return; // 이미 방문한 노드는 스킵
        }
        visited[node] = true;
        for (int nextNode : numbers) {
            node += nextNode;
            dfs(numbers, nextNode);
        }

    }
}

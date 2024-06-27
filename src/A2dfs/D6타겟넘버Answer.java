package A2dfs;

import java.util.*;

public class D6타겟넘버Answer {
    static int answer = 0;
    private static int target;

    public static void main(String[] args) {
        int target = 3;
        int[] numbers = {1,1,1,1,1};
    }

    // 모든 값이 다 들어가야하니까 length 사용
    static void dfs(int[] numbers, int target, int length, int total){
        if(length == numbers.length && total == target){
            answer ++;
        }
        dfs(numbers, target, length, total); // + 냐 - 냐 !
    }
}

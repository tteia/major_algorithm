package A5dp;

import java.util.Arrays;

public class D5등굣길 {
    public static void main(String[] args) {
        int m = 4;
        int n = 3;

        int answer;
        int[][] puddles = {{2,2}};
        int[][] arr = new int[m+1][n+1];
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(arr[i], 0);
        }
        arr[1][1] = 1;
        for (int[] puddle : puddles) {
            arr[puddle[0]][puddle[1]] = -1;
        }
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(i == j && i == 1){
                    continue;
                }
                if(arr[i][j] < 0){
                    continue;
                }
                if(arr[i-1][j] < 0){
                    arr[i-1][j] = 0;
                }
                else if(arr[i][j-1] < 0){
                    arr[i][j-1] = 0;
                }
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }
        answer = arr[m][n];
        System.out.println(answer);
    }
}

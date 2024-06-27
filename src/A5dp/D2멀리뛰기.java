package A5dp;

import java.util.Arrays;

public class D2멀리뛰기 {
    public static void main(String[] args) {
        long answer = 0;
        int n = 4;

        // 식 : f(n) = f(n-1) + f(n-2)
        int[] arr = new int[n+1]; // 인덱스와 값을 맞춰주기 위해 +1
        arr[1] = 1; // 한 칸 뛰어오르기
        arr[2] = 2; // 두 칸 뛰어오르기
        for(int i = 3; i <= n; i++){
            arr[i] = arr[i-1] % 1234567 + arr[i-2] % 1234567; // 마지막 결과값에만 나눠주면 안됨. 중간중간 모든 연산에 % 1234567 넣어주기
        }
        System.out.println(Arrays.toString(arr));
    }
}

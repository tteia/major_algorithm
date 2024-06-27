package A5dp;

public class D1DpBasic {
    public static void main(String[] args) {
        // 1, 4, 5 로 13을 만들 수 있는 조합 중 가장 작은 조합의 개수
        // 가장 큰 수와 나머지 수들이 배수 관계가 아니기 때문에 가장 큰 수부터 고를 수 없다.
        // Min(f(n-1), f(n-2)...)+1
        int target = 13;
        int[] arr = new int[target+1];
        int[] numbers = {1, 4, 5};
        arr[1] = 1;
        for(int i = 2; i <= target; i++){
            int min = Integer.MAX_VALUE;
            for (int n : numbers) {
                if(min > arr[i-n]){
                    min = arr[i-n];
                }
            }
        }
        System.out.println(arr[target]);

    }
}

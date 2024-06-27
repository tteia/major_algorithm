package A6투포인터;

public class T4슬라이딩윈도우 {
    public static void main(String[] args) {
//        정수 배열 nums와 정수 k가 주어졌을때
//        길이가 k 인 연속된 부분 배열의 최대합을 구하기
        int[] nums = {1, 4, 2, 10, 23, 1, 0, 28};
        int k = 4;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i <= nums.length - k; i++){
            int sum = 0;
            for(int j = i; j < i + k; j++){
                sum += nums[j];
            }
            if(sum > max){
                max = sum;
            }
        }
        System.out.println(max);

    }
}

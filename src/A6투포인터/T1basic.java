package A6투포인터;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T1basic {
    public static void main(String[] args) {
//        nums 배열에서 target 이 될 수 있는 두 수의 조합의 값을 모두 찾아라.
        int[] nums = {7,8,9,2,4,5,1,3,6};
        int target = 10;
        List<int[]> list = new ArrayList<>();
//        첫 번째 방법 ) 이중 for 문 구현 : n^2
//        ========================================
//        for(int i = 0; i < nums.length; i++){
//            for(int j = i+1; j < nums.length; j++){
//                if(nums[i] + nums[j] == target){
//                    list.add(new int[]{nums[i], nums[j]});
//                }
//            }
//        }
//        for(int[] a : list){
//            System.out.println(Arrays.toString(a));
//        }

//        두 번째 방법 ) 투포인터
//        ========================================
//        1) 정렬 시키기.
//        2) start / end 를 설정해서 값이 작으면 start 를 늘리고, 크면 end 를 줄인다 !
//        Arrays.sort(nums);
//        int start = 0;
//        int end = nums.length-1;
//        while (start < end) {
//            int sum = nums[start] + nums[end];
//            if (sum == target) {
//                list.add(new int[]{nums[start], nums[end]});
//                start++;
//            } else if (sum < target) {
//                start++;
//            } else {
//                end--;
//            }
//        }
//        for(int[] a : list){
//            System.out.println(Arrays.toString(a));
//        }

//        세 번째 방법 ) 이진탐색
//        ========================================
//        1) 같은 자리에서 start 두 개로 시작(start 와 end 가 0번 인덱스에서) > start 하나만 점점 뒤로 보낸다.
//        2) end 는 start 보다 작아질 수 없고, end 가 끝까지 가면 start 가 한 칸 옮겨진다.
        int start = 0;
        int end = 1;
        while (start < nums.length - 1) {
            if (end >= nums.length) {
                start++;
                end = start + 1;
            }

            int sum = nums[start] + nums[end];
            if (sum == target) {
                list.add(new int[]{nums[start], nums[end]});
            }
            end++;
        }

        for(int[] a : list){
            System.out.println(Arrays.toString(a));
        }
    }
}

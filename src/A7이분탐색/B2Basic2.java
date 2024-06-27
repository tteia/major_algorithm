package A7이분탐색;

import java.util.Arrays;

public class B2Basic2 {
    public static void main(String[] args) {
//        target 을 찾되, target 이 없으면 target 보다 큰 값 중 첫 번째 값을 찾아라.
        int[] arr = {1, 3, 4, 5, 7, 8, 9};
        int target = 6;
        int start = 0;
        int end = arr.length-1;
        int index = -1;

        while(start <= end){
            int mid = (start + end) / 2;
            if(target <= arr[mid]){
                index = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        System.out.println(index);

//        가까운 값 찾기
        int[] arr2 = {10,20,30};
        System.out.println(Arrays.binarySearch(arr2, 35)); // -4 (절댓값 -1) 의 값이 가장 근접한 인덱스.
        System.out.println(Arrays.binarySearch(arr2, 25)); // -3
        System.out.println(Arrays.binarySearch(arr2, 9)); // -1

//        위 문제 풀이를 바이너리 서치 활용
        int index2 = Arrays.binarySearch(arr, target);
        if(index2 < 0){
            System.out.println(Math.abs(index2)-1);
        }
        else{
            System.out.println(index2);
        }
    }
}

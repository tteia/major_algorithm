package A7이분탐색;

import java.util.Arrays;

public class B1Basic1 {
    public static void main(String[] args) {
//        이분탐색은 사전에 오름차순 정렬이 되어 있어야 가능한 알고리즘
//        인덱스 절반 값에 접근 > 찾는 수보다 크면 뒤로 이동. 작으면 앞으로 이동.

//        17을 찾는다면? 인덱스 절반인 9에 먼저 접근 > 17이 더 크니까 뒤로 이동
//        1. (9+0) / 2 >> 2.(9+5) / 2 >> 3.(8+9) / 2
//        종료조건은 start 가 end 보다 작거나 같을 때까지.
        int[] arr = {1,3,5,7,9,11,13,15,17,19};
        int target = 17;
        int start = 0;
        int end = arr.length-1;
        int index = -1;
        Arrays.sort(arr); // 이분탐색 활용 위해서.
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                index = mid;
                break;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        System.out.println(index);






//        int now = 0;
//        int start = (arr.length - 1) / 2;
//        while(true){
//            if(arr[start] < target){
//                start++;
//            }
//            else if(arr[start] > target){
//                start--;
//            }
//            else{
//                now = start;
//                break;
//            }
//        }
//        System.out.println(now);
    }
}

package A7이분탐색;

public class B3입국심사 {
    public static void main(String[] args) {
        int n = 6;
        int[] times = {7, 10};
        Solution solution = new Solution();
        System.out.println(solution.solution(n, times));
    }
    static class Solution{
        public long solution(int m ,int[] times){
            long answer = 0;
            long start = 0;
            long end = (long) times[times.length - 1] * m;
            while (start <= end){
                long mid = (start + end) / 2;
                long usablePeople = 0;
                for (int time : times) {
                    usablePeople += mid / time; // mid시간동안 가각 처리할수있는 수
                }
                System.out.println("start : " + start + "| END : " + end + "| MID : " + mid + "| 가능한사람 : " + usablePeople );
                if(usablePeople >= m){
                    end = mid - 1;
                    answer = mid;
                }else{
                    start = mid + 1;
                }
            }
            return answer;
        }
    }
}

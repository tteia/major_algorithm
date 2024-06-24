package A1sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Collections;

public class S2야근지수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] works = {4, 3, 3};
        int n = Integer.parseInt(br.readLine());

        System.out.println(solution(works, n));
    }

    public static long solution(int[] works, int n) {
        // 남은 작업의 총합이 n보다 작거나 같으면, 모든 작업을 완료할 수 있으므로 피로도는 0
        long sum = 0;
        for (int work : works) {
            sum += work;
        }
        if (sum <= n) {
            return 0;
        }

        // 우선순위 큐를 사용하여 최대 힙 구성
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int work : works) {
            pq.add(work);
        }

        // N시간 동안 가장 큰 작업을 줄이기
        for (int i = 0; i < n; i++) {
            int maxWork = pq.poll();
            pq.offer(maxWork - 1);
        }


        // 남은 작업량의 피로도 계산
        long fatigue = 0;
        while (!pq.isEmpty()) {
            int work = pq.poll();
            fatigue += (long) work * work;
        }

        return fatigue;
    }
}

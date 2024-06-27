package A4greedy;

import java.util.*;

public class G3구명보트 {
    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        int answer = 0;

        Arrays.sort(people); // 50, 50, 70, 80
        // 가장 작은 애들부터 꺼내서 더해줌 > limit 보다 커지면 stop. 다시 빼.
        // 뺀 애들은 빠이빠이하고 answer++
        // 그러려면...? 큐로 선입선출 해주면 대는 거 아니야?

        // =======================================================
        // 왜 작은 애 하나랑 큰 애 하나 태워야대지?

        Deque<Integer> deque = new ArrayDeque<>();
        for (int person : people) {
            deque.add(person);
        }
        while(!deque.isEmpty()){
            int last = deque.pollLast();
            answer++;
            if(!deque.isEmpty() && last + deque.peekFirst() <= limit){
                deque.pollFirst();
            }
        }
        System.out.println(answer);
    }
}

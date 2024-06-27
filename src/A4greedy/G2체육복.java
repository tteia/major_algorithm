package A4greedy;

import java.util.*;

public class G2체육복 {
    public static void main(String[] args) {
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        int n = 5;
        int answer = n - lost.length;

        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(lost[i] == reserve[j]){
                    reserve[j] = -1;
                }
                else if(reserve[j]-1 == lost[i] || reserve[j]+1 == lost[i]){
                    answer++;
                    reserve[j] = -1;
                    lost[i] = -1;
                }
            }
        }
        System.out.println(answer);
    }
}

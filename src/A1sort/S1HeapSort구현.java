package A1sort;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class S1HeapSort구현 {
    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 8, 3, 5, 9, 1, 6};

        // 최초 힙 구성
        for (int i = (arr.length / 2) - 1; i >= 0; i--){
            heapify(arr, arr.length-1, i);
        }

        // 루트 노드와 최하위 노드를 바꾸면서 heapify
        for(int i = arr.length-1; i > 0; i--){
            int tmp = arr[i];
            arr[i] = arr[0];
            arr[0] = tmp;
            heapify(arr, i-1, 0);
        }

        int[] arr2 = {7, 6, 5, 8, 3, 5, 9, 1, 6};
        Queue<Integer> pq = new PriorityQueue<>();
        for(int a : arr2){
            pq.add(a); // 오름차순은 아니지만 힙 구조로 이미 형성이 되어있다 !
        }
        System.out.println(pq);
    }

    // 내림차순 방법.
    // 오름차순으로 만들려면 부등호를 모두 반대 방향으로 !
    static void heapify(int[] arr, int arrLength, int node){
        // 왼쪽 노드 : node*2 + 1
        int left = (node*2) + 1;
        // 오른쪽 노드 : node*2 + 2
        int right = (node*2) + 2;
        // check 해야할 사항
        // 1) 왼쪽, 오른쪽 각각의 노드가 배열의 길이보다 짧아야 함.
        if(left > arrLength) return;
        if(right > arrLength){ // node 와 left 만 비교.
            if(arr[node] > arr[left]) {
                int tmp = arr[node];
                arr[node] = arr[left];
                arr[left] = tmp;
                heapify(arr, arrLength, left);
            }
        // 2) node, left, right 세 개 중 가장 작은 노드로 다시 heapify -> 나 자신(node)를 제외했을 때 가장 작은 게 left 나 right 라면.
        // heapify(node); 로 나 자신으로 다시 호출하겠다는 뜻.
        }else { // node , left, right 모두 비교
            int index = 0;
            if(arr[node] > arr[left] || arr[node] > arr[right]){
                if(arr[left] > arr[right]){
                    index = right;
                }else {
                    index = left;
                }
                int tmp = arr[node];
                arr[node] = arr[index];
                arr[index] = tmp;
                heapify(arr, arrLength, index);
            }
        }

    }
}

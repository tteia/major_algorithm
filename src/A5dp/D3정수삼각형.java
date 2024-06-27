package A5dp;

import java.util.Arrays;

public class D3정수삼각형 {
    public static void main(String[] args) {
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        int[][] answerArr = new int[triangle.length][]; // dp 의 기억하기 저장소로 사용할거야!
        answerArr[0] = Arrays.copyOf(triangle[0], triangle[0].length);

        for(int i = 0; i < triangle.length-1; i++){
            answerArr[i+1] = new int[triangle[i+1].length];
            for(int j = 0; j < triangle[i].length; j++){
                if(answerArr[i][j] + triangle[i+1][j] > answerArr[i+1][j]){
                    answerArr[i+1][j] = answerArr[i][j] + triangle[i+1][j];
                }
                if(answerArr[i][j] + triangle[i+1][j+1] > answerArr[i+1][j+1]){
                    answerArr[i+1][j+1] = answerArr[i][j] + triangle[i+1][j+1];
                }
            }
        }
        System.out.println(Arrays.deepToString(answerArr));
        // for문으로 answer 값 찾기
    }
}

//package A5dp;
//public class D3정수삼각형 {
//    public static void main(String[] args) {
//        int[][] triangle={{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
//        int height = triangle.length;
//
//        for (int i = height - 2; i >= 0; i--) {
//            for (int j = 0; j <= i; j++) {
//                triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
//            }
//        }
//
//        System.out.println(triangle[0][0]);
//    }
//}

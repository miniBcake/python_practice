package test;

import java.util.Arrays;

public class Desc {
    public static void main(String[] args) {
        int num = 3;
        int total = 12;
        System.out.println("3,4,5 : "+ Arrays.toString(solution(num, total)));
    }

    public static int[] solution(int num, int total) {
        //등차수열을 활용해 시작번호 구하기
        //(total - num*(num-1)/2) / num
        //num만큼 반복해 시작 번호를 배열에 저장
        //배열 반환
        int[] answer = new int[num];
        int startNum = (total - num*(num-1)/2) / num; //시작번호

        for(int i = 0; i < num; i++) { //startNum부터 num만큼 반복
            answer[i] = startNum++; //배열에 저장
        }

        return answer;
    }
}

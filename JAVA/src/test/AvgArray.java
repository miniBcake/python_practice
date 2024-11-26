package test;

public class AvgArray {
    /*
정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
제한사항
0 ≤ numbers의 원소 ≤ 1,000
1 ≤ numbers의 길이 ≤ 100
정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.
입출력 예
numbers	result
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]	5.5
[89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99]	94.0 */

    public static void main(String[] args) {
        int[] arr = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        System.out.println(solution(arr));
    }

    public static double solution(int[] arr) {
        double answer = 0;

        //입력받은 배열의 값을 모두 sum 변수에 저장
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        //입력받은 길이로 나눠 평균값 추출(answer)
        answer = sum / arr.length;

        return answer;
    }
}
package test;

public class DupeNum {
    /*정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때,
    array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.*/

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 5};
        System.out.println(solution(array, 1));
    }

    public static int solution(int[] array, int n) {
        int answer = 0;

        //배열을 순회하며 n과 일치한다면 answer에 1추가
        //answer 반환

        for (int num : array){
            if (num == n){
                answer++;
            }
        }

        return answer;
    }
}

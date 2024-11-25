package test;

public class Game369 {
//머쓱이는 친구들과 369게임을 하고 있습니다.
//369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다.
//머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때,
//머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.

    public static void main(String[] args) {
        //확인용
        System.out.println(solution(3));
        System.out.println(solution(1));
    }

    private static int solution(int order) {
        int answer = 0;
        //order를 문자열로 변환
        //처음부터 차례로 비교하며 3,6,9 중 하나라면
        //answer 개수 증가
        //아니라면 아무것도 하지 않음
        //전부 확인 후 answer전달

        String numberStr = order+"";
        for(int i = 0; i < numberStr.length(); i++){
            if(numberStr.charAt(i) == '3' || numberStr.charAt(i) == '6' || numberStr.charAt(i) == '9'){
                answer++;
            }
        }

        return answer;
    }
}
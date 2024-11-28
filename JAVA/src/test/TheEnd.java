package src.test;

public class TheEnd {
    public static void main(String[] args) {
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        System.out.println(solution(3, words));
    }

    public static String[] solution(int n, String[] words){
        String[] answer = null;

        //words의 길이만큼 돌면서 게임 기록을 저장
            //만약 이미 저장된 단어라면 플래그를 체크하며 종료
            // 바로 직전 단어의 마지막으로 시작하지 않는다면
                //배열을 생성해 0번 자리에 i나머지n+1 == 번호 저장
                //1번 자리에 i나누기n+1 == 차례 저장
        return answer;
    }
}

package src.test;

public class ModeStr {
// 문자열 code가 주어집니다.
// code를 앞에서부터 읽으면서 만약 문자가 "1"이면 mode를 바꿉니다. mode에 따라 code를 읽어가면서 문자열 ret을 만들어냅니다.
// mode는 0과 1이 있으며, idx를 0 부터 code의 길이 - 1 까지 1씩 키워나가면서 code[idx]의 값에 따라 다음과 같이 행동합니다.
// mode가 0일 때
// code[idx]가 "1"이 아니면 idx가 짝수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.
// code[idx]가 "1"이면 mode를 0에서 1로 바꿉니다.
// mode가 1일 때
// code[idx]가 "1"이 아니면 idx가 홀수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.
// code[idx]가 "1"이면 mode를 1에서 0으로 바꿉니다.
// 문자열 code를 통해 만들어진 문자열 ret를 return 하는 solution 함수를 완성해 주세요.
// 단, 시작할 때 mode는 0이며, return 하려는 ret가 만약 빈 문자열이라면 대신 "EMPTY"를 return 합니다.

  public static void main(String[] args) {
    System.out.println(solution("abc1abc1abc"));
    System.out.println(solution(""));

  }

  public static String solution(String code) {
    StringBuilder answer = new StringBuilder();

    //mode변수 선언 기본값은 0
    //만약 1이라면 mode를 1로 변경(1이었다면 0으로)
    //아닌데 i값이 홀수이고 mode가 1이라면 현재 알파벳 누적
    //아닌데 i값이 짝수이고 mode가 0이라면 현재 알파벳 누적
    //전부 아니라면 아무것도 하지 않음
    //전부 조건에 해당하지 않았다면 EMPTY

    int mode = 0;

    for(int i = 0; i < code.length(); i++){
      char c = code.charAt(i);
      if(c == '1'){ //모드전환신호라면
        System.out.println("mode change");
        mode = mode <= 0? 1 : 0; //모드 전환
        continue; //다음 진행
      }

      //알파벳이라면
      if((i%2==1 && mode==1)||(i%2==0 && mode==0)){//홀수인데1이거나 짝수인데0이거나
        answer.append(c); //누적
      }
    }

    if(answer.isEmpty()){//비어있는 경우라면 //JAVA 15부터 가능
      answer.append("EMPTY");
    }

    return answer.toString();
  }
}

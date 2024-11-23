package test;

public class Login {
    /*머쓱이는 프로그래머스에 로그인하려고 합니다.
    머쓱이가 입력한 아이디와 패스워드가 담긴 배열 id_pw와 회원들의 정보가 담긴 2차원 배열 db가 주어질 때,
    다음과 같이 로그인 성공, 실패에 따른 메시지를 return하도록 solution 함수를 완성해주세요.*/

    public static void main(String[] args) {
        //확인용
        String[] id = {"test", "123"};
        String[] id2 = {"rardss", "123"};
        String[] id3 = {"rardss", "1234"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        System.out.println("fail : "+solution(id, db)); //fail
        System.out.println("login : "+solution(id2, db)); //login
        System.out.println("wrong pw : "+solution(id3, db)); //wrong pw
    }

    public static String solution(String[] id_pw, String[][] db) {
        //msg
        final String ID_FAIL = "fail"; //아이디 불일치
        final String PW_FAIL = "wrong pw"; //비밀번호 불일치
        final String LOGIN_SUCCESS = "login"; //성공 시

        //들어온 배열의 0번(아이디)가 db데이터의 중 0번(아이디)와 일치하는 경우가 있나?
            //있다면 해당 데이터의 1번(비밀번호)와 일치하나?
                //일치한다면 로그인 성공문구 반환
            //일치하지 않는다면 비밀번호 불일치 문구 반환
        //db를 다 확인했는데도 없다면 아이디 불일치 문구 반환

        for(String[] data : db){ //DB에서
            //아이디가 일치하는 경우가 있는지
            if(data[0].equals(id_pw[0])){
                System.out.println("id check success");
                //일치한다면 비밀번호 확인
                if(data[1].equals(id_pw[1])){
                    //비밀번호가 일치한다면
                    System.out.println("pw check success");
                    return LOGIN_SUCCESS;
                }
                //비밀번호가 일치하지 않는다면
                System.out.println("pw check fail");
                return PW_FAIL;
            }
        }
        //일치하는 경우가 없다면
        return ID_FAIL;
    }
}

def solution(id_pw, db):
    #msg
    ID_FAIL = 'fail'
    PW_FAIL = 'wrong pw'
    LOGIN_SUCCESS = 'login'

    #들어온 배열의 아이디와 일치하는 아이디가 있는지 확인
        #있다면 비밀번호 일치 확인
            #일치하면 로그인
        #일치하지 않는다면 비밀번호 불일치
    #없다면 아이디 불일치

    for data in db:
        #아이디가 일치하는지 확인
        if data[0] == id_pw[0]:
            print('id check success')
            #아이디 일치할 경우 pw 일치 확인
            if data[1] == id_pw[1]:
                #pw일치
                print('pw check success')
                return LOGIN_SUCCESS
            #비밀번호 불일치
            print('pw check fail')
            return PW_FAIL
    #아이디 불일치
    return ID_FAIL



db = [["rardss", "123"], ["yyoom", "1234"], ["meosseugi", "1234"]]
id = ["test", "123"]
id2 = ["rardss", "123"]
id3 = ["rardss", "1234"]
print("fail : "+solution(id, db)) #fail
print("login : "+solution(id2, db)) #login
print("wrong pw : "+solution(id3, db)) #wrong pw

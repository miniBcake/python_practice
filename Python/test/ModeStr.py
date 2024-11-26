def soloution(code) :
    answer = ''
    mode = 0

    for i in range(len(code)):
        if code[i] == '1': #만약 1이라면
            mode = 1 if mode == 0 else 0 #mode전환
        else: #알파벳이라면
            if mode == i % 2: #홀수짝수 확인 및 mode와 비교
                answer += code[i] #조건 만족 시 누적

    return answer if answer else "EMPTY"  # 빈 문자열일 경우 "EMPTY" 반환

print(soloution("abc1abc1abc"))
print(soloution(""))
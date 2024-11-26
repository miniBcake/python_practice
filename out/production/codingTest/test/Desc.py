#연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다.
# 두 정수 num과 total이 주어집니다. 연속된 수 num개를 더한 값이 total이 될 때,
# 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.

#입출력 예
# num	total	result
# 3	12	[3, 4, 5]
# 5	15	[1, 2, 3, 4, 5]
# 4	14	[2, 3, 4, 5]
# 5	5	[-1, 0, 1, 2, 3]

def solution(num, total):
    answer = []

    #(total - num*(num-1)/2) / num을 하면 시작 번호를 구할 수 있다.
    #시작번호부터 num만큼 1씩 더한 값을 배열에 저장한다 (answer)

    startNum = int((total - num*(num-1)/2) / num) #시작번호 구하기
    for i in range(num): #num만큼 반복
        answer.append(startNum) #배열에 저장하기
        startNum += 1 #숫자 증가하기

    return answer

num = 3
total = 12
print("3,4,5 : "+str(solution(num, total)))


# 머쓱이는 친구들과 369게임을 하고 있습니다.
# 369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다.
# 머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때,
# 머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.

def solution(order):
    answer = 0

    #order를 문자열로 변환
    #3을 몇 개 포함하는지 확인해 누적
    #6을 몇 개 포함하는지 확인해 누적
    #9을 몇 개 포함하는지 확인해 누적
    #answer를 전달

    numberStr = str(order)
    answer += numberStr.count('3')
    answer += numberStr.count('6')
    answer += numberStr.count('9')

    return answer


# 확인용
print(solution(3))
print(solution(1))
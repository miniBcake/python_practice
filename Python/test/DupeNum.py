def solution(array, n):
    answer = 0

    #n을 포함하는 개수 answer에 저장
    answer = array.count(n)

    return answer

array = [1, 1, 2, 3, 4, 5]
print(solution(array, 1))
import math

def solution(n, words):
    answer = []

    #입력받은 키워드만큼 반복
        #배령에 해당 키워드가 있거나 바로 직전 단어의 마지막 단어로 시작하지 않는다면
            #i나머지n+1은 번호
            #i나누기n+1은 차례
            #종료
        #기록에 키워드를 저장
    #전부 실행했는데도 빈 배열이라면 0,0을 저장

    #번호 차례

    history = [words[0]] #게임 기록용
    for i in range(1,len(words)): #게임 길이만큼 반복
        #count, in 둘다 O(n)이지만 count는 끝까지 순회하므로 in이 좀 더 낫다
        if words[i] in history or not words[i].startswith(words[i-1].strip()[-1]): #만약 중복된 단어거나, 전의 단어끝과 시작이 일치하지 않는다면
            print("words =",words[i], "i =",i, "n =",n)
            answer.append(i%n+1) #번호
            answer.append(math.floor(i/n+1)) #차례
            break
        history.append(words[i]) #if문에 걸려 종료되지 않았을 경우 기록에 추가
    if not answer : answer = [0,0] #만약 무사히 게임을 다 돌았다면
    return answer

print("3,3:",solution(3,["tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"]))
print("1,3:",solution(2,["hello", "one", "even", "never", "now", "world", "draw"]))
print("0,0:",solution(5,["hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"]))
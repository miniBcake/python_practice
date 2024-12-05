import math

def solution(arr):
  return math.lcm(*arr) #최소공배수를 알려주는 lcm

arr = [2,6,8,14]
print(solution(arr))
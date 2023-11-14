import math

def solution(n):
    answer=0
    # n의 제곱근을 계산하고 소수점 아래를 버린 후 제곱하여 정수를 얻습니다.
    sqrt_n = int(math.sqrt(n))
    if sqrt_n ** 2 == n:
        answer = 1  # 제곱수인 경우 1을 반환
    else:
        answer =  2  # 제곱수가 아닌 경우 2를 반환
    return answer
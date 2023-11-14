import math

def solution(a, b):
    answer = 0
    if (a*b)%2!=0:
        answer = a*a+b*b
    else:
        if (a%2==0) and (b%2==0):
            answer = abs(a-b)
        else:
            answer = 2*(a+b)
    return answer
def solution(sides):
    answer = 0
    sides.sort()
    
    answer = (1 if sides[0]+sides[1] > sides[2] else 2)
    return answer
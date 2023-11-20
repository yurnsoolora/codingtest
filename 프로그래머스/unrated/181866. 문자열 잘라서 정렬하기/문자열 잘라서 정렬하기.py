def solution(myString):
    answer = []
    answer = myString.split("x")
    answer = [item for item in answer if item]
    answer.sort()
    return answer
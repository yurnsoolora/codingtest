def solution(strArr):
    return [word.upper() if i%2!=0 else word.lower() for i, word in enumerate(strArr)]
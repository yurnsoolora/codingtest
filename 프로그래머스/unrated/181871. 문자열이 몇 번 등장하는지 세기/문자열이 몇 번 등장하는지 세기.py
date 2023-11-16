def solution(myString, pat):
    count = 0
    for i in range(0, len(myString), 1):
        if pat in myString[i:i+len(pat)]:
            count += 1
    return count
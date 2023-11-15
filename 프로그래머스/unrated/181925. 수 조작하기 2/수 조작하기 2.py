def solution(numLog):
    answer = ''
    
    for i in range(0, len(numLog)-1):
        cal = numLog[i+1] - numLog[i]
        
        if cal==1:
            answer += "w"
        elif cal==-1:
            answer += "s"
        elif cal==10:
            answer += "d"
        elif cal==-10:
            answer += "a"
            
    return answer
def solution(myStr):
    answer = []
    
    for i in myStr:
        if i in "abc":
            myStr = myStr.replace(i, ' ')
    
    answer = myStr.split()
    
    if len(answer) > 0:
        answer = myStr.split()
    else:
        answer = ["EMPTY"]
        
    return answer
def solution(num, k): 
    
    for i,word in enumerate(str(num)):
        if str(k) in word:
            return i+1
    return -1
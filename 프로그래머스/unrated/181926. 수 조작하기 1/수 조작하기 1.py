def solution(n, control):
    answer = 0
    
    for char in control:     
        if char == 'w':
            n=n+1
        elif char == 's':
            n=n-1
        elif char == 'd':
            n=n+10
        elif char == 'a':
            n=n-10
            
    return n
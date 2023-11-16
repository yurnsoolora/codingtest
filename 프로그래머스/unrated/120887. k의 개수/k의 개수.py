def solution(i, j, k):
    s=''
    for i in range(i,j+1,1):
        s += str(i)
        
    return s.count(str(k))
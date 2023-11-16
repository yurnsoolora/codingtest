def solution(arr, queries):
    temp=0
    
    for query in queries:
        a,b = query
        
        temp = arr[a]
        arr[a] = arr[b]
        arr[b] = temp
        
    return arr
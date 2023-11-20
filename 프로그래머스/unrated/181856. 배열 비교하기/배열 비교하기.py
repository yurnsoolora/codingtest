def solution(arr1, arr2):
    a = len(arr1)
    b = len(arr2)
    c = sum(arr1)
    d = sum(arr2)
    
    if a>b:
        return 1
    elif a<b:
        return -1
    elif a==b:
        if c>d:
            return 1
        elif c<d:
            return -1
        elif c==d:
            return 0
def solution(array):
    answer = []
    max=0
    idx=0
    for i in range(len(array)):
        if array[i] > max:
            max=array[i]
            idx=i
    answer = [max, idx]
    
    return answer
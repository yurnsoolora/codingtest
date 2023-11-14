def solution(num_list):
    answer = 0
    gob=1
    hap=0
    
    for i in num_list:
        gob *= i
        hap += i
        
    return hap if len(num_list)>=11 else gob
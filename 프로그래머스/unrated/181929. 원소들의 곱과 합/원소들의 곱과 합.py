def solution(num_list):
    gob=1
    hap=0
    for i in num_list:
        gob *= i
        hap += i
    return 1 if gob < hap*hap else 0
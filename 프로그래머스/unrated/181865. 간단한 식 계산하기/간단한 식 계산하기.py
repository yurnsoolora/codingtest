def solution(binomial):
    array = binomial.split()
    
    a = int(array[0])
    op = array[1]
    b = int(array[2])
    
    if op=="+":
        return a+b
    elif op=="-":
        return a-b
    else:
        return a*b
    
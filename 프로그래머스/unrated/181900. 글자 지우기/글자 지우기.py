def solution(my_string, indices):
    answer = ''
    
    s = list(my_string)
    
    for i in indices:
        s[i] = ''
    return ''.join(s)
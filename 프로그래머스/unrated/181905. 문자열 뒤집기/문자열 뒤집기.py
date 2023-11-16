def solution(my_string, s, e):
    answer = ''
    re = my_string[s:e+1]
    return my_string[0:s] + re[::-1] + my_string[e+1:]
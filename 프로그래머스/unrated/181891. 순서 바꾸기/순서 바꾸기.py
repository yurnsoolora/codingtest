def solution(num_list, n):
    answer = []
    answer = num_list[n:] + num_list[0:n]
    return answer
def solution(slice, n):
    answer = 0
    return n//slice + (0 if n%slice==0 else 1)
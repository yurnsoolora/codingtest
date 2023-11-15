def solution(age):
    answer = ''
    array=["a","b","c","d","e","f","g","h","i","j"]
    
    for i in str(age):
        answer += array[int(i)]
    return answer
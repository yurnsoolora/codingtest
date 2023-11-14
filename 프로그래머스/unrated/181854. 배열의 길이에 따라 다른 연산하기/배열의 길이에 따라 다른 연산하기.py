def solution(arr, n):
    result = []  # 새로운 배열을 생성하여 결과를 저장
    
    if len(arr) % 2 != 0:  # 배열의 길이가 홀수인 경우
        for i in range(len(arr)):
            if i % 2 == 0:
                result.append(arr[i] + n)
            else:
                result.append(arr[i])
    else:  # 배열의 길이가 짝수인 경우
        for i in range(len(arr)):
            if i % 2 == 1:
                result.append(arr[i] + n)
            else:
                result.append(arr[i])
    
    return result
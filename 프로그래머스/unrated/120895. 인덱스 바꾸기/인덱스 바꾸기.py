def solution(my_string, num1, num2):
    # 문자열을 리스트로 변환
    string_list = list(my_string)
    
    # num1과 num2의 문자 교환
    string_list[num1], string_list[num2] = string_list[num2], string_list[num1]
    
    # 리스트를 다시 문자열로 변환
    modified_string = ''.join(string_list)
    
    return modified_string

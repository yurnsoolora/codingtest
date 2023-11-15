def solution(box, n):
    # 상자의 가로, 세로, 높이를 각각 변수에 저장합니다.
    width, height, depth = box[0], box[1], box[2]
    
    # 주어진 상자에 들어갈 수 있는 주사위의 최대 개수를 계산합니다.
    max_dice_count = (width // n) * (height // n) * (depth // n)
    
    return max_dice_count

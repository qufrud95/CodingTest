def solution(nums):
    len1 = len(nums) // 2  # 기존 리스트의 길이 / 2 가 최대로 가질 수 있는 개수
    new_nums = set(nums)
    new_nums = list(new_nums) # 종복을 제거한 new_nums
    len2 = len(new_nums) # new_nums 의 개수
    
    if len1 < len2 :
        return len1
    elif len1 == len2 :
        return len1
    elif len1 > len2:
        return len2

def solution(numbers):
    nums = [0,1,2,3,4,5,6,7,8,9] # 0~9개의 수중

    sub = [x for x in nums if x not in numbers]

    return sum(sub)    
if __name__ == "__main__":

    numbers = [1,2,3,4,6,7,8,0]
    solution(numbers)

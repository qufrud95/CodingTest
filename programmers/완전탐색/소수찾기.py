from itertools import permutations

def isprime(nums):
    prime = []
    
    for n in nums:
        count =0
        for i in range(2,n): # 2~ n-1 까지
            if n % i == 0 :
                count+=1 # 나누어 떨어진다면 카운트
                break

        if n>1 and count ==0 : # 1이상 그리고 카운트가 0 즉 소수라면
            prime.append(n)

    print(prime)
    return len(prime)
    

def solution(numbers):

    nums = []
    
    for i in range(1,len(numbers)+1):
        temp = permutations(numbers,i) # 1부터 i개의 조합
        
        for n in temp:  #  "" 제거 , str to int 
            temp_str = "".join(n)
            nums.append(int(temp_str))
            
    nums = set (nums) # 중복 제거
    nums = list(nums)
    
    return isprime(nums)


    

if __name__ == "__main__":

    numbers  = "17"
    print(solution(numbers))

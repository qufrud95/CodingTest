import math
def solution(price, money, count):


    s = []
    for i in range(1,count+1):
        s.append(i*price)
    print(s)
    if money < sum(s):
        return abs(sum(s)-money)
    else :
        return 0

def worst(lottos, win_nums):
    count = 0
    for i in lottos:
        if i in win_nums:
            count+= 1
    if count == 6: return 1
    elif count ==5: return 2
    elif count ==4: return 3
    elif count ==3: return 4
    elif count ==2: return 5
    else : return 6

def best(lottos, win_nums):
    count =0
    for i in lottos:
        if i in win_nums: count+=1 # 일차하면 count +=1
        if i == 0 : count +=1 # 0 이라도 +=1 즉 다 맞다고 가정 행복회로 가동
    if count == 6: return 1
    elif count ==5: return 2
    elif count ==4: return 3
    elif count ==3: return 4
    elif count ==2: return 5
    else : return 6


    
def solution(lottos, win_nums):

    answer = []
    
    answer.append(best(lottos,win_nums))
    answer.append(worst(lottos,win_nums))
    return answer    
    



if __name__ == "__main__":


    lottos = [0, 0, 0, 0, 0, 0]
    win_nums = [38, 19, 20, 40, 15, 25]
    solution(lottos, win_nums)

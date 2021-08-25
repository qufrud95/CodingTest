def solution(n, lost, reserve):


    for res in reserve:
        if res in lost:
            lost.remove(res)
            reserve.remove(res)
    
    answer = n - len(lost)


    for i in lost:
        if i in reserve:
            answer+=1
            reserve.remove(i)
        elif i-1 in reserve:
            answer +=1
            reserve.remove(i-1)
        elif i+1 in reserve:
            answer +=1
            reserve.remove(i+1)
        
    
    return answer

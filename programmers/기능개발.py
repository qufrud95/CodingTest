def solution(progresses, speeds):


    days = []
    day = 0 
    answers = []

    # 걸리는 시간 구하기 
    for i,j in enumerate(progresses):
        
        #print(" i : ",i ," j : ",  j ," speeds : ", speeds[i] )
        while(j<100):
            j+=speeds[i]
            day+=1
        days.append(day)
        day = 0
    
    print(days)
    for i,d in enumerate(days):
        # 초기값을 max로 설정
        if i==0 :
            max =d
            answers.append(1)
            continue # 아래 코드를 실행하지않고 max 다음부터 탐색 
            
        #max 보다 작은 값이 있다면
        if d<=max:
            answers[-1]+=1
        # 그게 아니라면 새로운 manx 값을 기준으로 다시 탐색
        
        else:
            max =d
            answers.append(1)
            
    return answers

if __name__ == "__main__":


    progresses = [93, 30 , 55]
    speeds = [1,30,5]
    print(solution(progresses, speeds))

    

def solution(scores):

    avg = []
    answer =''

    #print("original : \n\n",scores)
    for i in range(len(scores)):
        s = []
        for j in range(len(scores)):
            s.append(scores[j][i]) # 내가 받은 점수
        if s[i] == min(s) and s.count(s[i]) == 1:del s[i] # 유일한 최소값이라면 del
        elif s[i] == max(s) and s.count(s[i]) == 1:del s[i] # 유일한 최대값이라면 del
        
        avg = sum(s)/len(s)
        #print("new :  \n\n",s)
   
        if avg >= 90: answer+='A'
        elif avg>= 80 :answer+='B'
        elif avg>= 70 :answer+='C'
        elif avg>= 50 :answer+='D'
        else : answer+='F'
    #print(answer)
    return answer
            
if __name__ == "__main__":

    scores =[[100,90,98,88,65],[50,45,99,85,77],[47,88,95,80,67],[61,57,100,80,65],[24,90,94,75,65]]
    solution(scores)

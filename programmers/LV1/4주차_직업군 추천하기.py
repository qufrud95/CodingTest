def solution(table, languages, preference):

    answer =[]
    new_table = sorted([list(t.split())for t in table], key = lambda x : x[0])
    #공백을 구분하여 new_table에 문자열 append 
    job = {n : new_table[n][0] for n in range(len(new_table))}
    #테이블에서 job만 따로 분리하여 별도의 list 생성
    print(new_table)

    for j in range(len(job)):
        total = 0
        for lang,pref in zip(languages, preference):
            #zip 함수를 이용해 언어와 선호도를 병렬처리
    
            if lang in new_table[j]: # 만약에 언어가 있다면
                total +=(6-new_table[j].index(lang))*pref # total에 선호도*
                #뒤에서 부터 점수를 계산하기 때문에 거꾸로 계산해줘야함
                
        answer.append(total)#최종 합을 더하기 
    print(answer)
    return job[answer.index(max(answer))] #합계중 맥스를 찾아서 해당 직업 선택
if __name__ == "__main__":
    table = ["SI JAVA JAVASCRIPT SQL PYTHON C#",
             "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
             "HARDWARE C C++ PYTHON JAVA JAVASCRIPT",
             "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
             "GAME C++ C# JAVASCRIPT C JAVA"]

    languages = ["PYTHON", "C++", "SQL"]

    preference = [7, 5, 5]

    solution(table, languages, preference)

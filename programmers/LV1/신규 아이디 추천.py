def solution(new_id):

    ### TO DO(1)  대문자 -> 소문자로 변경

    new_id = new_id.lower()

    answer = ''
        

    ### TO DO(2) 특수기호 제거 isalnum 알파벳 혹은 영문자 인자 검사

    for word in new_id:
        if word.isalnum() or word in '-_.':
            answer += word

        
    ## TO DO(3) ... , .. -> . 한개로 변    while~replace 조합 

    while '...'  in answer:
        answer = answer.replace('...','.')
        
    while '..'  in answer:
        answer = answer.replace('..','.')
    ## TO DO(4) 첫 . 제거   마지막 . 제거

    if answer[0] == ".":
        if len(answer) >= 2: ##문자열 길이가 2이상일때만 
            answer = answer[1:] # 첫문자를 제외한 그 이후까지 가져옴
        else:
            answer="."

    if answer[-1] == ".":
        answer = answer[:-1]
        
    ## TO DO(5) 빈 문자열
    if answer == "":
        answer = "a"

    ## TO DO(6) 16자리 이상 -> 15자리까지 변경

    if len(answer) >= 16:
        answer = answer[:15]
        if answer[-1] == ".":
            answer = answer[:-1]

    ## TO DO(7) 아이디 길이가 2자 이하라면 마지막 문자를 3이 될 때까지 반복해서 끝에붙임
    while len(answer)<3:
        answer+=answer[-1]

    
    return answer

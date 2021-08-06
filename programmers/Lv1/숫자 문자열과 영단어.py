def solution(s):

    dict = [ 'zero',
             'one',
             'two',
             'three',
             'four' ,
             'five',
             'six' ,
             'seven' ,
             'eight' ,
             'nine' 
             ]

    answer = ' '
    for idx,num in enumerate(dict):  ## enumerate : index , value 를 같이 가져옴
        if num in s : ## 만약 num 이 문자열에 존재하면 ?
            s = s.replace(num,str(idx)) ## then 문자열을 해당 idx로 변환
        answer = s



    return int(answer)
        




if __name__ == "__main__":

    text ="2three45sixseven"
    print(solution(text))

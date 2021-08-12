def solution(v):
    answers = []
    start = []
    end = []

    for i in v:
        if i[0] not in start:
            start.append(i[0])
        else:
            start.remove(i[0])
            
        if i[1] not in end:
            end.append(i[1])
        else:
            end.remove(i[1])
       
       
    answers = start + end
    
    return answers


if __name__ == "__main__":
    v = [[1, 4], [3, 4], [3, 10]]
    
    print(solution(v))

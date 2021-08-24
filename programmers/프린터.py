from collections import deque

def solution(priorities, location):
    answer = 0

    d = deque((v,i) for i,v in enumerate(priorities))

    print("초기 큐 : ",d)

    while len(d):
        item = d.popleft()
        print("item : ",item)
        print(d)
        if  d and max(d)[0]> item[0]:
            print("max  : ",max(d)[0])
            d.append(item)
        else:
            answer+=1
            print("answer : ",answer)
            if item[1] == location:
                break

    return answer

if __name__ == "__main__":


    priorities = [1,1,9,1,1,1]
    location = 0
    print(solution(priorities, location))

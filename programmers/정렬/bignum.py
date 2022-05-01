import itertools
def solution(numbers):
    answer = ''
    numbers2 = [str(n)*3 for n in numbers]
    print("number2: ",numbers2)
    numbers3=list(enumerate(numbers2))
    numbers3.sort(key=lambda x:x[1],reverse=True)
    print("number3 : ",numbers3)

    for index,value in numbers3:
        print("index : ",index,"value : ",value)
        answer += str(numbers[index])
        print("answer : ",answer)
    if answer == "0" *len(numbers):
        return "0"
    return answer


if __name__ == "__main__" :
    numbers = [3, 30, 34, 5, 9]
    print(solution(numbers))
    
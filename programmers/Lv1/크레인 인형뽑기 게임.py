def solution(board, moves):

    stack = [0]
    answer = 0

    for i in moves:
        i =i-1  # 0~4 이기 때문에 row -1 을 해줘야 맞음
        for j in range(len(board)):
            if board[j][i] != 0:
                stack.append(board[j][i])
                board[j][i] = 0
                if stack[-1] == stack[-2]: ## 반복을 돌때마다 같은 value 검사
                    stack.pop(-1)
                    stack.pop(-1)
                    answer +=2
                break
                
                
    return answer

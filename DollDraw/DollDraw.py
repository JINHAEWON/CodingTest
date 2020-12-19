def CountBingo(addItem, basket):
    count = 0
    if(len(basket) == 0):
        basket.append(addItem)
        return count
    if(addItem != basket[-1]):
        basket.append(addItem)
        return count
    if(addItem == basket[-1]):
        del basket[-1]
        count = 2
    return count


def popItem(target, board):
    addItem = 0
    target = target - 1
    for index, i in enumerate(board):
        if(i[target] != 0):
            addItem = i[target]
            board[index][target] = 0
            break
    return addItem


def solution(board, moves):
    answer = 0
    basket = []
    for i in moves:
        addItem = popItem(i, board)
        if(addItem != 0):
            answer += CountBingo(addItem, basket)
    return answer

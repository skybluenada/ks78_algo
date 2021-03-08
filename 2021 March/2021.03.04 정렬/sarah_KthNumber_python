def solution(array, commands):
    answer = []
    value = []
    for i in range(0,len(commands), 1):
        value = array[commands[i][0]-1:commands[i][1]]
        value.sort()
        answer.append(value[commands[i][2]-1])
    return answer

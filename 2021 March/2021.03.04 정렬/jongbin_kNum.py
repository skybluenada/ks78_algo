def solution(array, commands):
    answer = []
    result = []
    for command in commands:
        i = command[0]    
        j = command[1]
        k = command[2]
        result = array[i-1:j]
        result.sort()
        answer.append(result[k-1])
    return answer

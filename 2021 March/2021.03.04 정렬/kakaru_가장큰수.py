def solution(array, commands):
    answer = []
    for i in commands:
        cutArr = array[(i[0]-1):i[1]]
        cutArr.sort()
        answer.append(cutArr[i[2]-1])    
    return answer

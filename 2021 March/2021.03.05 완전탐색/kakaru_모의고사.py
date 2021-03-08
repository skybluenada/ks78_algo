def solution(answers):
    answer = []
    supo1 = [1,2,3,4,5]
    supo2 = [2,1,2,3,2,4,2,5]
    supo3 = [3,3,1,1,2,2,4,4,5,5,3,3,1,1,2,2]
    cnt =[0,0,0]
    for i in range(len(answers)):
        if answers[i]==supo1[(i%5)]:
            cnt[0]+=1
        if answers[i]==supo2[(i%8)]:
            cnt[1]+=1
        if answers[i]==supo3[(i%10)]:
            cnt[2]+=1
    
    for i in range(3):
        if cnt[i]==max(cnt):
            answer.append(i+1)
    return answer

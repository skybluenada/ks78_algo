function solution(answers) {
    var answer = [];
    var supo1 = [1,2,3,4,5];
    var supo2 = [2,1,2,3,2,4,2,5];
    var supo3 = [3,3,1,1,2,2,4,4,5,5];
    var su = [0,0,0];
    for(var i = 0; i <answers.length; i++){
        if(supo1[i%5]==answers[i]){
            su[0]++;
        };
        if(supo2[i%8]==answers[i]){
            su[1]++;
        };
        if(supo3[i%10]==answers[i]){
            su[2]++;
        };
    };
    var max = Math.max(su[0], su[1], su[2])
    for(var i = 0; i < 3; i++){
        if(su[i]== max){
            answer.push(i+1);
        }
    }
    return answer;
}

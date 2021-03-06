function solution(answers) {
    var answer = [];
    var supo1 = [1,2,3,4,5];
    var supo2 = [2,1,2,3,2,4,2,5];
    var supe3 = [3,3,1,1,2,2,4,4,5,5];
    var su = [0,0,0];
    for(var i = 0; i <answers.length; i++){
        if(supo1[i%5]==answers[i]){
            su[0]++;
        };
        if(supo2[i%8]==answers[i]){
            su[1]++;
        };
        if(supo2[i%10]==answers[i]){
            su[2]++;
        };
    };
    var su2 = su;
    su2.sort(function(a, b) { // 내림차순
        return b - a;
    });
    for(var i = 0; i < 3; i++){
        if(su[i]== su2[0]){
            answer.push(i+1);
        }
    }
    return answer;
}

function solution(numbers) {
    var answer = '';
    numbers.map(String);    
    numbers.sort(function(a, b) {
        return (b+a)-(a+b);
    });
    for(var i = 0; i < numbers.length; i++){
        answer += numbers[i];
    }
    if(answer[0]=='0') return "0";
    return answer;
}

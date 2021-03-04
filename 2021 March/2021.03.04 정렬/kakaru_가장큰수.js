function solution(numbers) {
    var answer = '';
    numbers.sort(function(a, b) {
        return (b.toString()+a.toString())-(a.toString()+b.toString());
    });
    for(var i = 0; i < numbers.length; i++){
        answer += numbers[i];
    }
    return answer[0]==='0'?'0':answer;
}

function solution(array, commands) {
    var answer = [];
    
    for(var i = 0; i < commands.length; i++){
            var tmp = new Array(commands[i][1]-commands[i][0]+1);
            var idx = 0;
            for(var j = commands[i][0]-1; j <= commands[i][1]-1; j++){
                tmp[idx] = array[j];
                idx++;
            }
            tmp.sort((a, b) => a - b);
            answer[i]=tmp[commands[i][2]-1];
        }
    return answer;
}

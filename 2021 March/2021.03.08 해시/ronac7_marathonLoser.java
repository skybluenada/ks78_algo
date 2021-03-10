import java.util.HashMap;

public class Solution {
    public String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> par = new HashMap<String, Integer>();
        for (int i=0; i< participant.length; i++) {
            if (par.containsKey(participant[i])) {
                par.replace(participant[i], par.get(participant[i])+1 );
            } else {
                par.put(participant[i], 1);
            }
        }
        for (int i=0; i< completion.length; i++) {
            par.replace(completion[i], par.get(completion[i])-1 );
        }
        String answer = "";
        for (String a : par.keySet()) {
            if (par.get(a) == 1) {
                answer = a;
                break;
            }
        }
        return answer;
    }
}

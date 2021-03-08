import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
             ArrayList<String> part = new ArrayList<String>(participant.length);
          for(int i=0; i<participant.length; i++) {
          part.add(participant[i]);
       }
         
       
       ArrayList<String> comp = new ArrayList<String>(completion.length);
       for(int i=0; i<completion.length; i++) {
          comp.add(completion[i]);
       }
       comp.add("0");
       
       for(int i=part.size()-1; i>=0; i--) {
          if(comp.contains(part.get(i)))
             part.remove(i);
       }
         
         String answer =  part.get(0);
         return answer;
        
      }
    }

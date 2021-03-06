import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, (str1, str2) -> (str2+str1).compareTo(str1+str2));

        return arr[0].equals("0") ?  arr[0] : String.join("", arr);
    }
}

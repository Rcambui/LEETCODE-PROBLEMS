/*Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
 

Example 1:

Input: n = 3
Output: ["1","2","Fizz"]
Example 2:

Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
Example 3:

Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 

Constraints:

1 <= n <= 104 */

import java.util.List;
import java.util.ArrayList;

public class LeetCode412_FizzBuzz {
    
    public List<String> fizzBuzz(int n) {
        List answer = new ArrayList();
        String str = "";

        for (int i=0; i<n; i++) {
            int j = i + 1;
            if (j % 3 == 0  && j % 5 == 0) { str = "FizzBuzz"; }
            else if (j % 3 == 0) { str = "Fizz"; }
            else if (j % 5 == 0) { str = "Buzz"; }
            else { str = String.valueOf(j); }
            answer.add(str);
        }
        return answer;
    }
}
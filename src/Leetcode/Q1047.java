package Leetcode;

import java.util.Stack;

/*ou are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.
Input: s = "abbaca"
Output: "ca"

 */
public class Q1047 {
    Stack<Character > myStack = new Stack<>();
    String answer;
    char temp;
    public String removeDuplicates(String s) {
        for(int i= 0; i< s.length(); i++){
            if(!myStack.isEmpty())
                temp = myStack.peek();
            if(temp==s.charAt(i))
                myStack.pop();
            else
                myStack.push(s.charAt(i));
        }

        while (!myStack.isEmpty())
            answer = answer + myStack.pop().toString();

        StringBuilder reverseAnswer = new StringBuilder();
        reverseAnswer.append(answer);


        return reverseAnswer.reverse().toString();

    }
}

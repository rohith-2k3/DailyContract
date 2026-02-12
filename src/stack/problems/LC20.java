package stack.problems;

import java.util.Stack;

public class LC20 {
    static void main() {
        System.out.println(isValid("(]"));
        System.out.println(isValid("()[][{}]"));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        for(char i : charArray){
            if(i ==  '(' || i ==  '{' || i ==  '['){
                stack.push(i);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(i == ')' && top!='('||
                        i == '}' && top!='{'
                        || i == ']' && top!='['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

package stack;

import javax.swing.*;
import java.util.Stack;

public class BalancedExpression {
    public boolean balanceCheck(String input){

        Stack<Character> stack=new Stack<>();
        for(char ch:input.toCharArray()) {
            if (ch == '(')
                stack.push(ch);
            if (ch == ')')
                if (stack.empty()) {
                    return false;
                }
            var top = stack.pop();
            if (ch == '(' && top != ')') return false;
        }
           return stack.empty();
        }
        public boolean leftCheck(){
        return false;
        }
    }


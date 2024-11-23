package stack;

import java.util.Stack;

public class ValidateParenthesis {
    public static void main(String[] args) {
        ValidateParenthesis validator = new ValidateParenthesis();

        String expression1 = "{[]}";
        String expression2 = "({[()]})";
        String expression3 = "[{(})]";
        String expression4 = "([{}])";

        System.out.println("Expression: " + expression1 + " is " + (validator.isValidExpression(expression1) ? "valid" : "invalid"));
        System.out.println("Expression: " + expression2 + " is " + (validator.isValidExpression(expression2) ? "valid" : "invalid"));
        System.out.println("Expression: " + expression3 + " is " + (validator.isValidExpression(expression3) ? "valid" : "invalid"));
        System.out.println("Expression: " + expression4 + " is " + (validator.isValidExpression(expression4) ? "valid" : "invalid"));
    }

    public boolean isValidExpression(String expression) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < expression.length(); i++) {
            char bracket = expression.charAt(i);
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            }

            if (bracket == ')' || bracket == '}' || bracket == ']') {
                if (stack.isEmpty()) return false;
                char open = stack.pop();

                if (open == '(' && bracket != ')' || open == '{' && bracket != '}' || open == '[' && bracket != ']') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

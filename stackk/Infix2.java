import java.util.Stack;
import java.util.*;

public class Infix2 {
    
    
    
    static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

  
    static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

    
     String infixToPostfix(String infix) {
       // StringBuilder postfix = new StringBuilder();
       String postfix = "";
        Stack<Character> stack = new Stack<>();

        
            for(int i=0;i<infix.length();i++)
            {   char ch = infix.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
              // postfix.append(ch);
              postfix = postfix + ch;
            } else if (isOperator(ch)) {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                  
                    postfix = postfix + stack.pop();
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            postfix = postfix + stack.pop();
          
        }

        return postfix.toString();
    }

    public static void main(String[] args) {
        Infix2 obj = new Infix2();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the infix expression: ");
        String infixExpression = scanner.nextLine();
        scanner.close();

        String postfixExpression = obj.infixToPostfix(infixExpression);
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);
    }
}



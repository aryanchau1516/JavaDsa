import java.util.Scanner;

public class Infix1 {
   


    static final int MAX_SIZE = 100;
    static char[] stack = new char[MAX_SIZE];
    static int top = -1;

    // Function to push element into stack
    static void push(char item) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stack[top] = item;
    }

    // Function to pop element from stack
    static char pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return '\0';
        }
        char poppedItem = stack[top];
        top--;
        return poppedItem;
    }

    // Function to check if a character is an operator
    static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    // Function to get the precedence of an operator
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

    // Function to convert infix to postfix
    static String infixToPostfix(String infix) {
        String postfix = "";
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                postfix += ch;
            } else if (isOperator(ch)) {
                while (top != -1 && precedence(ch) <= precedence(stack[top])) {
                    postfix += pop();
                }
                push(ch);
            }
        }
        while (top != -1) {
            postfix += pop();
        }
        return postfix;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the infix expression: ");
        String infixExpression = scanner.nextLine();
        scanner.close();

        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);
    }
}

    
    

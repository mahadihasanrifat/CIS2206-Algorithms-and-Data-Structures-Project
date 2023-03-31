package Week8Practical13;

import java.util.Stack;

public class Calculator {
    public static void main(String[] args) {
        //The infix notation is = ((4+5)-(1*2)/5)
        String[] infixNotationInput = {"4", "5", "+", "1", "2","*","-","5","/","end"};
        float totalValue = 0;

        Stack<String> stack = new Stack<>();
        int index = 0;
        while (true) {
            // push the current token onto the stack
            stack.push(infixNotationInput[index]);
            System.out.println("The top will be: ");
            System.out.println(infixNotationInput[index]);
            index++;

            String token = stack.peek();
            if (token.equals("+")) {
                // Pop the + operator and the two operands
                stack.pop();
                int integerValueOne = Integer.parseInt(stack.pop());
                int integerValueTwo = Integer.parseInt(stack.pop());
                int result = integerValueOne + integerValueTwo;
                System.out.println("The top will be: ");
                System.out.println(result);
                stack.push(String.valueOf(result));
            } else if (token.equals("*")) {
                // Pop the * operator and the two operands
                stack.pop();
                int integerValueOne = Integer.parseInt(stack.pop());
                int integerValueTwo = Integer.parseInt(stack.pop());
                int result = integerValueOne * integerValueTwo;
                System.out.println("The top will be: ");
                System.out.println(result);
                stack.push(String.valueOf(result));
            } else if (token.equals("-")){
                // Pop the - operator and the two operands
                stack.pop();
                int integerValueOne = Integer.parseInt(stack.pop());
                int integerValueTwo = Integer.parseInt(stack.pop());
                int result = integerValueTwo - integerValueOne;
                System.out.println("The top will be: ");
                System.out.println(result);
                stack.push(String.valueOf(result));
            } else if (token.equals("/")){
                // Pop the / operator and the two operands
                stack.pop();
                int integerValueOne = Integer.parseInt(stack.pop());
                int integerValueTwo = Integer.parseInt(stack.pop());
                totalValue = (float)integerValueTwo/integerValueOne;
                System.out.println("The top will be: ");
                System.out.println(totalValue);
                stack.push(String.valueOf(totalValue));
            } else if (token.equals("end")){
                // exit the loop when we reach the end token
                break;
            }
        }
        // Print the final result
        System.out.println("The result of evaluating the expression ((4+5)-(1*2)/5) is "+totalValue);
    }
}



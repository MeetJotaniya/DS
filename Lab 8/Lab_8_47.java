import java.util.Stack;
import java.util.Scanner;
public class Lab_8_47 {

        public static int evaluatePostfix(String expression) {
        
        Stack<Integer> stack = new Stack<>();

        
        String[] tokens = expression.split("\\s+");

        for (String token : tokens) {
          if (isOperator(token)) {
             
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                
                int result = performOperation(token, operand1, operand2);
                stack.push(result);
            } else {
               
                stack.push(Integer.parseInt(token));
            }
        }

       
        return stack.pop();
    }

  private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

   
    private static int performOperation(String operator, int operand1, int operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        String expression = sc.next();

      
        int result = evaluatePostfix(expression);

      
        System.out.println("The result of the postfix expression is: " + result);
    }
}

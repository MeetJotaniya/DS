import java.util.*;
import java.util.Stack;
public class Lab_8_45{
    public static int inputPrecedence(char c){
        if(c == '+' || c == '-') return 1;
        if(c == '*' || c == '/') return 3;
        if(c == '^') return 6;
        if(c == '(') return 9;
        if(c == ')') return 0;
        return 7;
    }
    public static int stackPrecedence(char c){
        if(c == '+' || c == '-') return 2;
        if(c == '*' || c == '/') return 4;
        if(c == '^') return 5;
        if(c == '(') return 0;
        if(c == ')') return 0;
        return 8;
    }
    public static int rank(char c){
        if(inputPrecedence(c)==7) return 1;
        return -1; 
    }

    
    
    public static String PostFix(String string){
        Stack<Character> stack = new Stack<>();
        int index = 0 ;
        char ch = string.charAt(index);
        String polish = "";
        int rank = 0;

        stack.push('(');
        for(int i=0;i<string.length();i++){
            if(stack.isEmpty()){
                return "Invalid String";
            }
            while(stackPrecedence(stack.peek())>inputPrecedence(string.charAt(i))){
                polish += stack.pop();
                rank += rank(string.charAt(i));
                if(rank < 1){
                    return "invalid string";
                }
            }
            if(stackPrecedence(stack.peek()) != inputPrecedence(string.charAt(i))){
                stack.push(string.charAt(i));
            }
            else{
                stack.pop();
            }
        }
        return string;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER STRING : ");
        String string = new String(sc.next());
        System.out.println("\nPostfix is "+PostFix(string+ ")"));
    }
}
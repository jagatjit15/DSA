import java.util.Scanner;import java.util.Stack;public class InfixPostFix {//    giving priority to operand    public static int priority(char c){        if(c == '^') return 3;        else if (c == '*' || c == '/')            return 2;        else if(c == '+' || c =='-')            return 1;        return -1;    }//    For checking is the current char is a Symbol or character    public static boolean isCharacter(char ele){        if(ele == ')' || ele == '(' || ele == '*' ||           ele == '-' || ele == '/' || ele == '+' || ele == '^')            return false;        return true;    }    public static String inFixPostFix(String exp){        StringBuilder ans = new StringBuilder();        Stack<Character> stack = new Stack<>();        for(char c : exp.toCharArray()){            if(isCharacter(c)) ans.append(c);            else if (c == '(') stack.push(c);            else if (c == ')') {                while(!stack.isEmpty() && stack.peek() != '(')                    ans.append(stack.pop());                if(stack.isEmpty()) return "Wrong Expression!";                else stack.pop();            }            else {                while (!stack.isEmpty() && priority(stack.peek()) >= priority(c))                    ans.append(stack.pop());                stack.push(c);            }        }        while(!stack.isEmpty()){            ans.append(stack.pop());        }        return ans.toString();    }    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        String expression = sc.next();        System.out.println(inFixPostFix(expression));    }}
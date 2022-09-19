import java.util.ArrayDeque;
import java.util.Deque;


public class Task12 {
    public static String removeNumeric(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c: str.toCharArray()) {
            if (c == '{' || c == '['
                    || c == '(' || c == '}'
                    || c == ']' || c == ')'){
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static boolean isValid (String s){
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                char top = stack.peek();
                if ((c == '}' && top == '{') ||
                        (c == ']' && top == '[') ||
                        (c == ')' && top == '(')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String str = "[a+(1*3)";
        System.out.println(isValid(removeNumeric(str)));
    }
}


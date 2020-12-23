import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("({)"));
    }

    public static boolean isValid(String str) {
        Stack<Character> charStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[') { // check if char is opening parenthese, if so push to the stack
                charStack.push(c);
            } else {
                if (!charStack.isEmpty() && (charStack.peek() == c - 1 || charStack.peek() == c - 2)) {
                    // check if the top of stack is the closed parenthese for c variable. 
                    // Use ASCII table for check it. For () the diferrent ascii code is 1, 
                    // but for {} and [] the different ascii code is 2
                    charStack.pop(); // delete your opening parenthese in stack
                } else
                    return false;
            }
        }

        // if stack is empty, it's mean all of the parentheses have opening and closing parentheses
        if (charStack.isEmpty())
            return true;
        else
            return false;
    }
}

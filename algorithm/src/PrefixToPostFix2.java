

import java.util.Stack;

/**
 * Created by Aravinda on 6/24/2017.
 */
public class PrefixToPostFix2 {

    private static String[] inputs = new String[]{"++A*BCD", "*+AB+CD", "+*AB*CD", "+++ABCD"};
    private static String[] outputs = new String[]{"ABC*+D+", "AB+CD+*", "AB*CD*+", "AB+C+D+"};

//    @Test
//    public void prefixToPostFixTest() {
//        for (int i = 0; i < inputs.length; i++) {
//            Assert.assertEquals(pre2post(inputs[i]), outputs[i]);
//        }
//    }

    private static String pre2post(String prefixExp) {

        final String LEFT_DONE = "LEFT_DONE";

        Stack<String> operatorStack = new Stack<>();
        StringBuilder strPostfix = new StringBuilder();

        if (prefixExp.trim().isEmpty()) {
            return null;
        }

        char[] chars = prefixExp.toCharArray();
        
        for (char aChar : chars) {

            if (isOperator(aChar)) {
                operatorStack.push(String.valueOf(aChar));
            } else {
                strPostfix.append(String.valueOf(aChar));
                while (!operatorStack.empty() && operatorStack.peek().equals(LEFT_DONE)) {
                    operatorStack.pop();
                    strPostfix.append(operatorStack.pop());
                }
                operatorStack.push(LEFT_DONE);
            }
        }

        return strPostfix.toString();
    }

    private static boolean isOperator(char c) {
        char[] operators = {'+', '-', '/', '*'};
        boolean isOp = false;
        for (char operator : operators) {
            if (c == operator) {
                isOp = true;
                break;
            }
        }
        return isOp;
    }
}
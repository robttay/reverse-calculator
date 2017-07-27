import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by roberttaylor on 7/20/17.
 */
public class ReversePolishCalc {

    // You'll need a variable here to INDEX the top of the stack
    int stackTop = -1;

    // The array of the input string split up
    private String[] tokens;

    // The stack
    protected String[] stack;

    public double calculate(String input) {

        // 1. Use the String split method to split the string into tokens at the commas

        String[] tokens = input.split(",");


        // 2. Allocate a stack as big as the number of tokens

         stack = new String[tokens.length];


        // 3. write the algorithm
        String stringResult = "";
        for (int i = 0; i < tokens.length; i++) {
            // calls to push() and pop() and do the math here
            double firstPop, secondPop, newResult;
            switch (tokens[i]) {
//                all cases/operators pass to push(String...)
                case "+":
                    firstPop = pop();
                    secondPop = pop();
                    newResult = secondPop + firstPop;
                    push(newResult);
                    break;
                case "-":
                    firstPop = pop();
                    secondPop = pop();
                    newResult = secondPop - firstPop;
                    push(newResult);
                    break;
                case "*":
                    firstPop = pop();
                    secondPop = pop();
                    newResult = secondPop * firstPop;
                    push(newResult);
                    break;
                case "/":
                    firstPop = pop();
                    secondPop = pop();
                    newResult = secondPop / firstPop;
                    push(newResult);
                    break;
                default:
                    push(tokens[i]);
            }
        }
        return pop();
    }




    private void push(String number) {
        // push on the stack
        stackTop++;
        stack[stackTop] = number;
    }

    private void push(double d) {
        // change the double to a string and then push it on the stack
        stackTop++;
        String dString = String.valueOf(d);
        stack[stackTop] = dString;
    }

    private double pop() {
        // remove the string from the top of the stack and convert it to a double and return it
        double currentPop  = Double.parseDouble(stack[stackTop]);
        stack[stackTop] = null;
        --stackTop;
        return currentPop;
    }

}



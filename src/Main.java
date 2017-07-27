/**
 * Created by roberttaylor on 7/20/17.
 */
/**
 * Test Driven Development (TDD)
 * Write your tests first and watch them fail.
 * Then write the algorithm and watch the tests pass.
 */
public class Main {
    public static void main(String[] args) {
        ReversePolishCalc rpc = new ReversePolishCalc();

//        String rpnExpression = "2.5,4.8,+";
//        double expectedResult = 7.3;
//        double actualResult = rpc.calculate(rpnExpression);
//        checkResult(rpnExpression, expectedResult, actualResult);

//        String rpnExpression = "8,2,/";
//        double expectedResult = 4;
//        double actualResult = rpc.calculate(rpnExpression);
//        checkResult(rpnExpression, expectedResult, actualResult);

//        String rpnExpression = "9,7,-,3,-";
//        double expectedResult = -1;
//        double actualResult = rpc.calculate(rpnExpression);
//        checkResult(rpnExpression, expectedResult, actualResult);

//          String rpnExpression = "12,4,-,2,*";
//          double expectedResult = 16;
//          double actualResult = rpc.calculate(rpnExpression);
//          checkResult(rpnExpression, expectedResult, actualResult);

        // Write tests for the other operators (-, *, /)

        // Uncomment this test which has many operators
            String rpnExpression = "5,1,2,+,4,*,+,3,-";
            double expectedResult = 14.0;
            double actualResult = rpc.calculate(rpnExpression);
            checkResult(rpnExpression, expectedResult, actualResult);
    }

    private static void checkResult(String expression, double expected, double actual) {
        if (expected == actual) {
            System.out.println("SUCCESS: " + expression + " is " + expected);
        } else {
            System.out.println("ERROR: " + expression + " expected " + expected + " actual " + actual);
        }
    }
}


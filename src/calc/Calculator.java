package calc;

public abstract class Calculator {
    public abstract String calculate(String s) throws Exception;

    static int getResult(String s, int number1, int number2) {
        int result = 0;
        if (s.contains("/")) {
            result = number1 / number2;
        } else if (s.contains("*")) {
            result = number1 * number2;
        } else if (s.contains("-")) {
            result = number1 - number2;
        } else if (s.contains("+")) {
            result = number1 + number2;
        }
        return result;
    }


}

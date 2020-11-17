package calc;

public class ArabicNumeralsCalc extends Calculator {

    public String calculate(String s) throws Exception {
        int result;
        String[] numbers = s.split("\\/|\\*|\\-|\\+");
        int number1 = Integer.parseInt(numbers[0].trim());
        int number2 = Integer.parseInt(numbers[1].trim());
        if (number1 > 10 || number2 > 10) throw new Exception("введены значения превышающие допустимые");
        result = getResult(s, number1, number2);


        return String.valueOf(result);
    }



}



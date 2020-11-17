package calc;

import calc.utils.RomanNumeralsUtils;

public class RomanNumeralsCalc extends Calculator {

    public String calculate(String s) throws Exception {
        int result;
        String[] numbers = s.split("\\/|\\*|\\-|\\+");
        int number1 = RomanNumeralsUtils.parseInt(numbers[0].trim());
        int number2 = RomanNumeralsUtils.parseInt(numbers[1].trim());
        if (number1 > 10 || number2 > 10) throw new Exception("введены значения превышающие допустимые");
        result = getResult(s, number1, number2);
        String romNum = RomanNumeralsUtils.toRomanNum(result);

        return romNum;
    }
}

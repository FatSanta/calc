import calc.ArabicNumeralsCalc;
import calc.Calculator;
import calc.RomanNumeralsCalc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        Calculator calculator;
        String result = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine().trim().toUpperCase();
            if (s.matches("[1-9]0?\\s*[\\*|\\/|\\-|\\+]\\s*[1-9]0?")) {
                calculator = new ArabicNumeralsCalc();
            } else if (s.matches("[IVX]+\\s*[\\*|\\/|\\-|\\+]\\s*[IVX]+")) {
                calculator = new RomanNumeralsCalc();
            } else throw new Exception("введены не подходящие значения");
            result = calculator.calculate(s);
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(result);
    }


}

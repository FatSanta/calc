package calc.utils;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;
//класс утилита для преобразования арабских и римских чисел
public class RomanNumeralsUtils {
    private static final NavigableMap<Integer, String> units;
    static {
        NavigableMap<Integer, String> initMap = new TreeMap<>();
        initMap.put(1000, "M");
        initMap.put(900, "CM");
        initMap.put(500, "D");
        initMap.put(400, "CD");
        initMap.put(100, "C");
        initMap.put(90, "XC");
        initMap.put(50, "L");
        initMap.put(40,"XL");
        initMap.put(10, "X");
        initMap.put(9, "IX");
        initMap.put(5, "V");
        initMap.put(4, "IV");
        initMap.put(1, "I");
        units = Collections.unmodifiableNavigableMap(initMap);
    }
//перевод с римских в арабские
    public static int parseInt(String s) {
        int result = 0;
        int curNum = 0;
        int previousNum = 0;
        s.trim();
        int l = s.length();

        for (int i = l - 1; i >= 0; i--) {
            char x = s.charAt(i);
            switch (x) {
                case 'I':
                    curNum = 1;
                    break;
                case 'V':
                    curNum = 5;
                    break;
                case 'X':
                    curNum = 10;
                    break;
            }
            if (curNum >= previousNum){
                result += curNum;
                previousNum = curNum;
            } else {
                result -= curNum;
            }
        }
//        if (result > 10){
//          throw new Exception("one of the numbers is more then 10");
//        }

        return result;
    }
// перевод с арабских на римские
    public static String toRomanNum(int number) throws Exception {
        if (number > 1000 || number <= 0) throw new Exception("результат больше 1000 или меньше 1");
        StringBuilder result = new StringBuilder();
        for (Integer key : units.descendingKeySet()){
            while (number >= key){
                number -= key;
                result.append(units.get(key));
            }
        }

        return result.toString();
    }



}

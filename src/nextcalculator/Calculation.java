package nextcalculator;

import java.io.PrintStream;

import static java.lang.System.err;

class Calculation extends Conversion {

    private final int num1 = fromRomanToArab(statement.group(1));
    private final String action = statement.group(2);
    private final int num2 = fromRomanToArab(statement.group(3));
    private String result = "";

    void calc() {
        switch (action) {
            case "+":
                result = String.valueOf((num1 + num2));
                break;
            case "*":
                result = String.valueOf((num1 * num2));
                break;
            case "/":
                result = String.valueOf((double) (num1) / num2);
                break;
            case "-":
                result = String.valueOf((num1 - num2));
                break;
            default:
               try(PrintStream ignored = err.append(" УПС!!! Ошибка! Используется операция, несоответствующая условиям!")){}
                break;
        }
    }

    void showResult(){
        if(!itIsRoman){
            System.out.println("Результат: " + result);
        }else {
            String outcome = convertArabToRom(result);
            System.out.println("Результат: " + outcome);
        }
    }
}

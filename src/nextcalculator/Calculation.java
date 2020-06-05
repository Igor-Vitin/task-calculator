package nextcalculator;

import java.io.PrintStream;

import static java.lang.System.err;

public class Calculation extends Conversion {

    int num1 = fromRomanToArab(statement.group(1));
    String action = statement.group(2);
    int num2 = fromRomanToArab(statement.group(3));


    public void calc() {
        switch (action) {
            case "+":
                System.out.println("Результат: " + (num1 + num2));
                break;
            case "*":
                System.out.println("Результат: " + (num1 * num2));
                break;
            case "/":
                System.out.println("Результат: " + ((double) (num1) / num2));
                break;
            case "-":
                System.out.println("Результат: " + (num1 - num2));
                break;
            default:
                PrintStream stream = err.append(" УПС!!! Ошибка! Используется операция, несоответствующая условиям!");
                break;
        }
    }
}

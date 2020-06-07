package nextcalculator;

import java.io.PrintStream;

import static java.lang.System.err;

class Calculation extends Conversion {

    private int num1 = fromRomanToArab(statement.group(1));
    private String action = statement.group(2);
    private int num2 = fromRomanToArab(statement.group(3));


    void calc() {
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
               try(PrintStream stream = err.append(" УПС!!! Ошибка! Используется операция, несоответствующая условиям!")) {}
                break;
        }
    }
}

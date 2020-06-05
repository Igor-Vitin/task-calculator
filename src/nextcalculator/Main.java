package nextcalculator;

import java.io.PrintStream;

import static java.lang.System.err;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\tПростой консольный калькулятор.");
        System.out.println("Калькулятор выполняет простые операции: сложения, вычитания, умножения и деления с двумя числами, \n" +
                "\t например: a + b, a - b, a * b, a / b.");
        System.out.println("Калькулятор принимает на вход целые числа только от 1 до 10 включительно, но не больше. " +
                "\nДанные вводятся в одну строку.");
        System.out.println("Калькулятор умеет работать одновременно только или с арабскими (1,2,3,4,5…), " +
                "или с римскими (I,II,III,IV,V…) цифрами.");
        System.out.println();
        System.out.println("\t\tВведите действие:");

        String line = Conversion.getLine();
        try {
            Conversion.parsingExpression(line);
        } catch (Exception e) {
            try (PrintStream stream = err.append(" УПС!!! Ошибка! Введены некорректные данные!")) {
            }
        }

        Calculation calc = new Calculation();
        calc.calc();
    }
}

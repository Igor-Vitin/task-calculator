package nextcalculator;

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

        Conversion.parsingExpression(Conversion.getLine());
        Calculation calc = new Calculation();
        calc.calc();
    }
}

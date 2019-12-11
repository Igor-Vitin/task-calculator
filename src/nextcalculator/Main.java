package nextcalculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\tПростой консольный калькулятор.");
        System.out.println("Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: \n" +
                "\t например: a + b, a - b, a * b, a / b.");
        System.out.println("Калькулятор принимает на вход только целые числа от 1 до 10 включительно, не более. Одной строкой.");
        System.out.println("Калькулятор умеет работать как с арабскими (1,2,3,4,5…), так и с римскими (I,II,III,IV,V…) числами," +
                "\nно одновременно только или с арабскими, или с римскими цифрами");
        System.out.println("\t\tВведите действие:");
//        Engine.getLine();
        /*Conversion.parsingLine(" ");*/
        Engine.calc2(Engine.getLine());
//        System.out.println(Engine.getLine());
//        String line = Calculator.getLine();
//        Calculator.calc(line);
//        Calculator.defineAll(line);
//        Calculator.getInt(line);
//        Calculator.parsingString(line);
//        Calculator.show(line);
    }
}

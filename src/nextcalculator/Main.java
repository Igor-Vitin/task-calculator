package nextcalculator;

public class Main {

    public static void main(String[] args) {

        Description.show();

        Conversion.parsingExpression(Conversion.getLine());
        Calculation calc = new Calculation();
        calc.calc();
    }
}

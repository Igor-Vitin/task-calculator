package nextcalculator;

import javax.script.ScriptEngineManager;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.err;

class Engine extends Conversion {

     static String getLine(){
         String string = new Scanner(System.in).nextLine();
//         parsingRomLine(string);
         return string;
    }

    static void calc1(String expression) {
        try {
            double result = (double) new ScriptEngineManager().getEngineByName("JavaScript").eval(expression);
            System.out.println(result);
        } catch (Exception ex) {
            try (PrintStream stream = err.append(" Ошибка! Введены некорректные данные!")) {
            }
         }
    }

    static void calc2(String expression, Object ... args){
        try {
            System.out.println(
                BigDecimal.class.getMethod(
                    Arrays.asList("multiply", "add", "subtract", "divide").get(
                        (Integer)(args = new Object[]{
                             args = new Object[]{
                                Pattern.compile("\\s*(\\d|[10]{2})\\s*([+-\\\\*/])\\s*(\\d|[10]{2})\\s*$").
                                matcher(expression)
                                },
                             args[0],
                             ((Matcher) args[0]).find(),
                             ((Matcher)args[0]).group(1),
                             ((int)((Matcher)args[0]).group(2).charAt(0)-41)/2,
                             ((Matcher)args[0]).group(3)
                        }
                        )[4]
                    ),
                BigDecimal.class, MathContext.class).invoke(
                    new BigDecimal(args[3].toString()), new BigDecimal(args[5].toString()),
                                new MathContext(10, RoundingMode.HALF_DOWN)
                )
            );
        }catch (Exception e){
            /*try (PrintStream stream = err.append(" Ошибка! Введены некорректные данные!")) {
            }*/
            System.out.println(e);
        }
    }

}
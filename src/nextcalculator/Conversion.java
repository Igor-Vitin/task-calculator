package nextcalculator;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.err;

class Conversion {
    private static String romPattern = "(X?|I[XV]|V?I{0,3})\\s*([\\+\\*\\/-])\\s*(X?|I[XV]|V?I{0,3})";
    private static String arabPattern = "(^[0-9]|(?:10))\\s*([\\+\\*\\/-])\\s*([0-9]$|(?:10)$)";
    static Matcher statement;
    public static boolean itIsRoman = false;

    static String getLine() {
        String expression = new Scanner(System.in).nextLine();
        return expression.trim();
    }

    static void parsingExpression(String expression) {
        Pattern romanPattern = Pattern.compile(romPattern);
        Matcher matchRom = romanPattern.matcher(expression);
        Pattern arabicPattern = Pattern.compile(arabPattern);
        Matcher matchArab = arabicPattern.matcher(expression);
        if (matchRom.matches()) {
            statement = matchRom;
            itIsRoman = true;
        } else if (matchArab.matches()) {
            statement = matchArab;
        } else {
            try (PrintStream ignored = err.append(" УПС!!! Ошибка! Введены данные, несоответствующие условиям!")) {
            }
        }
    }

    static int fromRomanToArab(String string) {
        int digit = (!itIsRoman) ? Integer.parseInt(string) : 0;
        if (itIsRoman) {
            switch (string) {
                case "I":
                    digit = 1;
                    break;
                case "II":
                    digit = 2;
                    break;
                case "III":
                    digit = 3;
                    break;
                case "IV":
                    digit = 4;
                    break;
                case "V":
                    digit = 5;
                    break;
                case "VI":
                    digit = 6;
                    break;
                case "VII":
                    digit = 7;
                    break;
                case "VIII":
                    digit = 8;
                    break;
                case "IX":
                    digit = 9;
                    break;
                case "X":
                    digit = 10;
                    break;
                default:
                    try (PrintStream ignored = err.append(" УПС!!! Ошибка! Введены данные, несоответствующие условиям!")) {
                    }
                    break;
            }
        }
        return digit;
    }

    String digitToRomChar(int number){
        String romChar;
        switch (number){
            case 1:
                romChar = "I";break;
            case 5:
                romChar = "V";break;
            case 10:
                romChar = "X";break;
            case 50:
                romChar = "L";break;
            case 100:
                romChar = "C";break;
            default:
                romChar = "I do not know";break;
        }
        return romChar;
    }



    String digitConvert(String number){
        String tmp = "";
        int base = 0;
        int digit = 0;

        try {
            digit = Integer.parseInt(number);
        }catch (Exception e){
             digit = (int) Double.parseDouble(number);
        }

        while (digit > 0){
            if((digit >= 1)&&(digit<=9)) {
                base=1;
            } else if ((digit >= 10)&&(digit<=99)) {
                base=10;
            } else if (digit == 100) {
                base=100;
            }

            if(digit >= 9*base){
                tmp = tmp + digitToRomChar(base) + digitToRomChar(base*10);
                digit = digit - 9*base;
            }else if (digit >= 5*base){
                tmp = tmp + digitToRomChar(5*base);
                digit = digit - 5*base;
            }else if (digit >= 4*base){
                tmp = tmp + digitToRomChar(base) + digitToRomChar(5*base);
                digit = digit - 4*base;
            }

            while (digit >= base){
                tmp = tmp + digitToRomChar(base);
                digit = digit - base;
            }
        }
        return tmp;
    }

    String convertArabToRom(String string){
        return digitConvert(string);
    }

}


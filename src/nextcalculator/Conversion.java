package nextcalculator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.err;

class Conversion {
    private static int[] digits = new int[2];

    public static int[] getDigits() {
        return digits;
    }

    static void parsingRomLine(String string, Object ... nums){
         String  line = new Scanner(string).nextLine();
         Pattern romPattern = Pattern.compile("(?=[XVI])(I[XV]|V?I{0,3})");
         Matcher romDigit = romPattern.matcher(line);
         int index = 0;
        try {
         while (romDigit.find()) {
//             nums[index] = romDigit.group();
             switch (romDigit.group()){
                 case "I": digits[index] = 1; break;
                 case "II": digits[index] = 2; break;
                 case "III": digits[index] = 3; break;
                 case "IV": digits[index] = 4; break;
                 case "V": digits[index] = 5; break;
                 case "VI": digits[index] = 6; break;
                 case "VII": digits[index] = 7; break;
                 case "VIII": digits[index] = 8; break;
                 case "IX": digits[index] = 9; break;
                 case "X": digits[index] = 10; break;
             }
//             System.out.println(digits[index]);
             index++;
         }
        } catch (Exception e){
            err.println(" Ошибка. Введены не корректные, лишние  цифры");
        }
     }

}


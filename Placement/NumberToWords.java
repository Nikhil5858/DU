import java.util.*;

public class NumberToWords {
    public static void main(String[] args) {

        String[] ones = {
                "", "one", "two", "three", "four", "five", "six", "seven",
                "eight", "nine", "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
        };

        String[] tens = {
                "", "", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"
        };

        int num = 542;
        String result = "";

        if (num >= 1000) {
            result += ones[num / 1000] + " thousand ";
            num %= 1000;
        }
        if (num >= 100) {
            result += ones[num / 100] + " hundred ";
            num %= 100;
        }
        if (num >= 20) {
            result += tens[num / 10] + " ";
            num %= 10;
        }
        if (num > 0) {
            result += ones[num] + " ";
        }

        System.out.println(result);
    }
}

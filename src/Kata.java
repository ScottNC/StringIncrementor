import java.util.stream.IntStream;

import static java.lang.Integer.parseInt;

public class Kata {

    public static String incrementString(String str) {

        int finalLetterIndex = IntStream.range(0, str.length())
                .filter(i -> isNotNumberString(str.charAt(i)))
                .reduce((first, second) -> second)
                .orElse(-1) + 1;

        if (finalLetterIndex != str.length()) {
            int num = parseInt(str.substring(finalLetterIndex));
            return str.substring(0, finalLetterIndex) + (num + 1);
        } else return str + 1;
    }

    public static boolean isNotNumberString (char c) {
        return !String.valueOf(c).matches("-?\\d+(\\.\\d+)?");
    }
}
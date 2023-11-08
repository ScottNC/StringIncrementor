import java.util.stream.IntStream;

import static java.lang.Integer.parseInt;

public class Kata {

    public static String incrementString(String str) {

        int finalLetterIndex = IntStream.range(0, str.length())
                .filter(i -> isNotNumberString(str.charAt(i)))
                .reduce((first, second) -> second)
                .orElse(-1) + 1;

        if (finalLetterIndex != str.length()) {
            String numStr = str.substring(finalLetterIndex);

            int zeros = numStr.lastIndexOf('0') + 1;
            int nines = str.length() - finalLetterIndex - zeros;

            if (numStr.equals("0".repeat(zeros) + "9".repeat(nines)))
                return str.substring(0, finalLetterIndex) +
                        "0".repeat(Math.max(zeros - 1, 0)) + "1" + "0".repeat(nines);
            else
                return str.substring(0, str.length() - 1) +
                        (parseInt(str.substring(str.length() - 1)) + 1);
        } else return str + 1;
    }

    public static boolean isNotNumberString (char c) {
        return !String.valueOf(c).matches("-?\\d+(\\.\\d+)?");
    }
}
import static java.lang.Integer.parseInt;

public class Kata {

    public static String incrementString(String str) {
        if (str.isEmpty()) return "1";
        return replaceCharacter(str, str.length() - 1);
    }

    public static String replaceCharacter (String str, int index) {
        if (index < 0)
            return "1" + str.substring(index + 1);

        char c = str.charAt(index);

        if (isNumberString(c)) {
            if (c == '9')
                return replaceCharacter(str.substring(0, index) + "0" + str.substring(index + 1), index - 1);
            return str.substring(0, index) + (parseInt(String.valueOf(c)) + 1) + str.substring(index + 1);
        }

        if (str.length() - 1 == index)
            return str + 1;

        return str.substring(0, index + 1) + "1" + str.substring(index + 1);
    }

    public static boolean isNumberString (char c) {
        return String.valueOf(c).matches("-?\\d+(\\.\\d+)?");
    }
}
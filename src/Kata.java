import static java.lang.Integer.parseInt;

public class Kata {

    public static String incrementString(String str) {

        String endStr = str.substring(str.length() - 1);

        if (isNumberString(endStr)) {
            return str.substring(0, str.length() - 1) + (parseInt(endStr) + 1);
        } else return str + 1;
    }

    public static boolean isNumberString (String s) {
        return s.matches("-?\\d+(\\.\\d+)?");
    }
}
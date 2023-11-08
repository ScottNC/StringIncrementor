public class Kata {

    public static String incrementString(String str) {
        if (isNumberString(str.substring(str.length() - 1))) {
            return str.substring(0, str.length() - 1) + "2";
        } else return str + 1;
    }

    public static boolean isNumberString (String s) {
        return s.matches("-?\\d+(\\.\\d+)?");
    }
}
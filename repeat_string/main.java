public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        System.out.println(repeat);
        String str = "";
        for (int i = 0; i < repeat; i++) {
          str += string;
        }
        return str;
    }
}

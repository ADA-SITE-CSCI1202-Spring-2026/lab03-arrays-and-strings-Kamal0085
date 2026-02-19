package week03;

public class StringUtils {

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static String explode(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            sb.append(s.substring(0, i + 1));
        }
        return sb.toString();
    }



    public static void main(String[] args) {

        String s1 = "Hello";
        System.out.println("ex7:");
        System.out.println(reverse(s1));

        String s2 = "Baku";
        System.out.println("ex8:");
        System.out.println(explode(s2));
    }
}

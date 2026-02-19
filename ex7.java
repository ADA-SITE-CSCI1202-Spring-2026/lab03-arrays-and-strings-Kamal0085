package week03;

public class ex7 {
    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(reverse(s1));
    }
}
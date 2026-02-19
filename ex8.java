package week03;

public class ex8 {
    public static String explode(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            sb.append(s.substring(0, i + 1));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "Baku";
        System.out.println(explode(s1));
    }
}
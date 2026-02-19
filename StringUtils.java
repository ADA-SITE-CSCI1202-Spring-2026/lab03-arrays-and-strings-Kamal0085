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

    public static String sortString(String s) {
    char[] arr = s.toCharArray();
    java.util.Arrays.sort(arr);
    return new String(arr);
    }

    public static boolean isAnagram(String a, String b) {
    if (a.length() != b.length()) return false;

    char[] arr1 = a.toCharArray();
    char[] arr2 = b.toCharArray();

    java.util.Arrays.sort(arr1);
    java.util.Arrays.sort(arr2);

    return java.util.Arrays.equals(arr1, arr2);
    }

    public static String swapWords(String sentence) {

    String[] words = sentence.split(" ");
    StringBuilder result = new StringBuilder();

    for (String w : words) {

        if (w.length() <= 1) {
            result.append(w);
        } else {
            char first = w.charAt(0);
            char last = w.charAt(w.length()-1);

            String middle = w.substring(1, w.length()-1);
            result.append(last + middle + first);
        }

        result.append(" ");
    }

    return result.toString().trim();
    }

    public static void main(String[] args) {

        String s1 = "Hello";
        System.out.println("ex7:");
        System.out.println(reverse(s1));

        String s2 = "Baku";
        System.out.println("ex8:");
        System.out.println(explode(s2));

        System.out.println("ex9:");
        System.out.println(sortString("dcba"));

        System.out.println("ex10:");
        System.out.println(isAnagram("listen","silent"));

        System.out.println("ex11:");
        System.out.println(swapWords("This is PP2 Fall 2021"));

    }
}

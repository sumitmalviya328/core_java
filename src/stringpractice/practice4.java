package stringpractice;

public class practice4 {
    public static void main(String[] args) {
        String s = "Hello";
        s = s.toUpperCase();
        for (int i = 0; i<s.length(); i++) {
            System.out.print((int)s.charAt(i)-64);
        }
    }
}

package stringpractice;

public class practice1 {
    public static void main(String[] args) {
        String s = "Hello";
        s = s.toUpperCase();
        int sum = 0;
        for (int i=0; i<s.length()/2; i++) { //2
            int ch1 = s.charAt(i)-64;
            int ch2 = s.charAt(s.length()-1-i)-64;
            int diff = Math.abs(ch1-ch2);
            sum = sum + diff;
        }
        if (s.length()%2 !=0) {
            int ch3 = s.charAt(s.length()/2)-64;
            sum = sum + ch3;
        }
        System.out.println(sum);

    }
}

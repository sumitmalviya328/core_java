package stringpractice;

public class practice6 {
    public static void main(String[] args) {
       String s = "World Wide Web";
       s = s.toUpperCase();
       int sum = 0;
       String[] r = s.split(" ");
       String res = "";
       for(String a : r) {
           sum = 0;
           for(int i=0;i<a.length()/2;i++){
               int ch1 = a.charAt(i)-64;
               int ch2 = a.charAt(a.length()-1-i)-64;
               int diff = Math.abs(ch1-ch2);
               sum = sum + diff;
           }
           if (a.length()%2 !=0); {
               int ch3 = a.charAt(a.length()/2)-64;
               sum = sum + ch3;
           }
           res = res + sum;
       }

        System.out.println(res);

    }

}

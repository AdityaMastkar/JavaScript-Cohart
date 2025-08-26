public class Reverse {
    public static void main (String [] args) {
        // int n = 654616;

        // while (n > 0) {
        //     int lastdigit = n%10;
        //     System.out.print(lastdigit);
        //     n/=10;
            
        // }
        // System.out.println();

        int n = 97834;
        int rev = 0;

        while (n > 0) {
            int lastdigit = n%10;
            rev = (rev*10) + lastdigit;
            System.out.println();
            n/=10;
        }
        System.out.println(rev);
    }
}
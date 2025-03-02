import java.util.*;


public class Whileloop {
    public static void main (String [] args) {
        // int counter = 0;
        //  while (counter <= 100) {
        //     System.out.println("Hello World " + counter);
        //     counter++;

        //  }
        //  System.out.println("100 times printed");


        // int counter = 1;
        // while (counter <= 1000) {
        //     System.out.println(counter + " ");
        //     counter++;

        // }
        // System.out.println();


        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int counter = 1;
        // while (counter <= n) {
        //     System.out.print(counter + " " );
        //     counter++;

        // }
        // System.out.println();
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
         while (i <= n) {
            sum += i;
            i++;
         }
         System.out.println("Sum is" + " " + sum);



    }
}

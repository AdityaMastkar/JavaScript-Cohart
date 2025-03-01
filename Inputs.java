import java.util.*;

public class Inputs {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in); 
        sc.close();        //sc is a object you can name anything
        String B = sc.next();                         // capture only single word
        System.out.println(B);
        String name = sc.nextLine();                  // nextLine Capture things after space
        System.out.println(name);                     //String capture
        int num = sc.nextInt();                       // Integer capture
        System.out.println(num);
        float price = sc.nextFloat();
        System.out.println(price);
        boolean G = sc.nextBoolean();
        System.out.println(G);
        long L = sc.nextLong();
        System.out.println(L);

        // nextByte
        // nextDouble
        // nextBoolean 
        // nextShort
        // nextLong


    }
}

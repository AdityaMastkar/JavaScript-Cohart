import java.util.*;

public class BreakState {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //     for (int i=1; i<=5; i++) {
    //     if (i == 4) {
    //         break;
    //     } 
    //     System.out.println(i);
    // }
    //    System.out.println("i am out");

           do {
            System.out.print("Enter Your Number : ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            };
            System.out.println(n);
           } while (true);
    }
}

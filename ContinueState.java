import java.util.*;

public class ContinueState {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        // for (int i=1; i<=5; i++) {
        //     if (i == 3) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        do {
            System.out.println("Enter Number Of : ");
            int n = sc.nextInt();

            if (n%10 ==0) {
                continue;
            }

            System.out.println("num was " + n);
        } while(true);
    }
}

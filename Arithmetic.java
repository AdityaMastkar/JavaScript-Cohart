import java.util.*;



public class Arithmetic {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println("Add = " + (A+B));
        System.out.println("Sub = " + (A-B));
        System.out.println("Mul = " + (A*B));
        System.out.println("Div =" + (A/B));
        System.out.println("Mod = " + (A%B));
    }
}

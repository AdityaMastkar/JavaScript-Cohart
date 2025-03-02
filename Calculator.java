import java.util.*;

public class Calculator {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter Val1 = ");
        int Val1 = sc.nextInt();
        System.out.println("Enter Val2 = ");
        int Val2 = sc.nextInt();
        System.out.println("Enetr Operator = ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+' :  System.out.println(Val1+Val2);
            break;
            case '-' : System.out.println(Val1-Val2);
            break;
            case '*' : System.out.println(Val1*Val2);
            break;
            case '/' : System.out.println(Val1/Val2);
            break;
            case '%' : System.out.println(Val1%Val2);
            break;
            default : System.out.println("System error");
        }

        


    }
}

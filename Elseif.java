import java.util.*;

public class Elseif {
    public static void main (String [] args) {
        // int age = 17;
         
        // if (age>18) {
        //     System.out.println("Adult");
        // } 
        // else if (age>13 && age<18) {
        //     System.out.println("Teenger");
        // }
        // else {
        //     System.out.println("Not Adult");
        // }

        Scanner sc = new Scanner(System.in);

        // int income = sc.nextInt();
        // float tax;

        // if (income<5000) {
        //     tax = 0;
        //     // System.out.println("0% tax on your Salary");
        // } 
        // else if (income>5000 && income<10000) {
        //     tax = (int) (income * 0.2);
        //     // System.out.println("20% Tax will be deducted");
        // }
        // else {
        //     tax = (int) (income * 0.3);
        //     // System.out.println("30% tax will be deducted");
        // }
        // System.out.println("tax will be " + tax);

        int a = 10, b = 200, c = 3;
        
        if ((a>=b) && (a>=c)) {
            System.out.println("A");
        }
        else if ((b>=c)) {
            System.out.println("B");
        } 
        else {
            System.out.println("C");
        }
    }
}

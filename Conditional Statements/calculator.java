import java.util.*;
public class calculator {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner (System.in);
    System.out.print("Tell the operation to be performed : ");
    String operation=sc.nextLine();

    //switch case 

    switch (operation){

        case "addition":
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 =sc.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum is : "+sum);
        break;

        case "subtraction" :
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        int sub = a - b;

        System.out.println("The Subtraction is : "+sub);
        break;

        case "multiplication":
        System.out.print("Enter the first number : ");
        int x = sc.nextInt();
        System.out.print("Enter the second number : ");
        int y =sc.nextInt();

        int prod = x * y;

        System.out.println("The product is : "+prod);
        break;

        case "division" :
        System.out.print("Enter the first number : ");
        int m = sc.nextInt();
        System.out.print("Enter the second number : ");
        int n = sc.nextInt();

        int div = m / n;

        System.out.println("The division is : "+div);
        break;

        case "modulo" :
        System.out.print("Enter the first number : ");
        int c = sc.nextInt();
        System.out.print("Enter the second number : ");
        int d = sc.nextInt();

        int modu = c % d;

        System.out.println("The Modulus is : "+modu);
        break;

        default : 
        System.out.println("Enter correct  operation");
        }
    }
}

import java.util.*;
public class switchCase {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the number : ");
    int number = sc.nextInt();

    //using Switch case

    switch (number) {
        case 1:
        System.out.println("Samosa khalo guys");
        break;
        case 2:
        System.out.println("Burger khalo guys");
        break;
        case 3:
        System.out.println("Maa k haath ka khana khalo bhai...");
        break;
        default:
        System.out.println("Sapne mt dekh chup chaap khana kha...");
    }

    }
}

import java.util.*;
public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println("Entered Number is even");
        }
        else{
            System.out.println("Entered number is odd");
    }
}
}
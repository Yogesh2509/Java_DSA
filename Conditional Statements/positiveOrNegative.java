import java.util.*;
public class positiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a Integer : ");
        int integer = sc.nextInt();

        if (integer >= 0){
            System.out.println("ENtered number is positive. ");
        }
        else{
            System.out.println("Entered number is negative. ");
        }
        
    }
}

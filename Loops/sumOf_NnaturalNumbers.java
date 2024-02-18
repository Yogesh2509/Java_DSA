import java.util.*;
public class sumOf_NnaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter the number : ");
        int number = sc.nextInt();
        int sum = 0;
        int i = 1;

        while(i <= number){
         
            sum += i;
            i++;
        }

        System.out.println("Sum of N natural number is : " + sum);
    }
}

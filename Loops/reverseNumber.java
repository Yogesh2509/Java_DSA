import java.util.*;
public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        int rev = 0;
        while(number > 0){
            int lastDigit = number % 10;
            rev = (rev *10) + lastDigit;
            number = number / 10;

        }
        System.out.println(rev);
 
    }
}

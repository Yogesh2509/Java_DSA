import java.util.*;
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        
        if(number == 2){
            System.out.println("Number is prime");
        }
        boolean isPrime = true;
        for(int i=2; i<=number-1;i++){
            if(number % i==0){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }
}

import java.util.*;
public class sumUsingFunction {

    public static void calculateSum(int a, int b){
        int sum = (a + b);
        System.out.println("Sum is : "+sum);
    
    }
    public static void main(String[] args) {  
        Scanner sc = new Scanner (System.in);
        System.out.print("Enetr a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
     
        calculateSum(a, b);
}
}
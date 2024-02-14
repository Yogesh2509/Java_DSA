import java.util.*;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the age : ");
        int age = sc.nextInt();

        if (age>=18){
            System.out.println("You are an adult soo you can vote, drive and work");
        }
        if (age > 13 && age < 18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("You are not an adult");
        }
    }
}

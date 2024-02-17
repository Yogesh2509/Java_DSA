import java.util.*;
public class else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the age : ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You are an adult so you can vote and drive");
        }
        else if(age > 13 && age < 18){
            System.out.println("You are an teenager");
                }
        else{
            System.out.println("You are neither Teenager nor adult soo you are a child");
        }
            }
}

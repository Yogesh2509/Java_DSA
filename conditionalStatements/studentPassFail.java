import java.util.*;
public class studentPassFail {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the marks : ");
    int marks = sc.nextInt();

    String result = (marks >= 33) ? "Student is pass" : "Student is Fail";

    System.out.println(result);


    }
}

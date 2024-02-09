import java.util.*;
public class billOfItems {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the cost of a pencil : ");
    float pencil = sc.nextFloat();
    System.out.print("Enter the cost of a pen : ");
    float pen = sc.nextFloat();
    System.out.print("ENter the cost of eraser : ");
    float eraser =sc.nextFloat();

    float total = pen + pencil + eraser ;
    System.out.println("The total Bill is : "+total);

    float newTotal = total + (0.18f * total);
    System.out.println("After 18 percent of GST added the total bill is : "+newTotal);
    }
}

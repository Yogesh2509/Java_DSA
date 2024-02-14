public class largestOfThreeNumbers {
    public static void main(String[] args) {
        int a = 100;
        int b = 30;
        int c = 10;
    if (a >= b && a >= c){
        System.out.println("The larger number is a");
    }
    else if(b > a && b >=c){
        System.out.println("The larger number is b");
    }
    else{
        System.out.println("The larger number is c");
    }
    }
}

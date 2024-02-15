public class ternaryOperator {
    public static void main(String[] args) {
        int number = 475;
        
        //checking that the number is even or odd using ternary operator....
        
        String type = ((number % 2) == 0) ? "Number is Even" : "Number is Odd";
        System.out.println(type);
    }
}

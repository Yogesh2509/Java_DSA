public class functionOverloading {
    //function to print the sum of 2 numbers
    public static int sum(int a, int b){
        return a + b;
    }

    //function to print the sum of 3 numbers
    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(3 ,5));
        System.out.println(sum(5, 3, 1 ));
    }    
}

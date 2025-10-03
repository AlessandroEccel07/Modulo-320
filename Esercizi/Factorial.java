public class Factorial {
    public static void main(String[] args) {
        Integer factorialNumber = Integer.parseInt(args[0]);
        Integer factorial = 1;
        for (int i = factorialNumber; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("factorialNumber: "+factorialNumber);
        System.out.println("factorialResult: "+factorial);
    }
}

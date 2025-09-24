public class Format {

    public static void main(String[] args) {
        
        double num = Double.parseDouble(args[0]);

        
        System.out.printf("%.6f%n", num);
        System.out.printf("%.2f%n", num);
        System.out.printf("%.0f%n", num);
        System.out.printf("%,.2f%n", num);
        System.out.printf("%.2e%n", num);
    }
}
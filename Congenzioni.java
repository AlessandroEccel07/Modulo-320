import java.lang.Math;
public class Congenzioni{
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        while(number > 1) {
            if ((number % 2) == 0) {
                number = number / 2;
            } else {
                number = number * 3 + 1;
            }
            System.out.println(number);

        }
    }
}


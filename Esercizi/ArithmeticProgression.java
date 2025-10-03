public class ArithmeticProgression {
    public static void main(String[] args) {
        Double num1 = Double.parseDouble(args[0]);
        Double num2 = Double.parseDouble(args[1]);
        Double num3 = Double.parseDouble(args[2]);
        Double costant = num2-num1;
        if ((num3-num2)==costant){
            System.out.println(num1 + ","+num2 + ","+num3+","+"are in arithmetic progression (constant difference of "+costant+")");

        }else{
            System.out.println(num1 + ","+num2 + ","+num3+","+" are not in arithmetic progression");
        }
    }
}

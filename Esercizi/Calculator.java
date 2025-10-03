public class Calculator {
    public static void main(String[] args) {
        Double num1 = Double.parseDouble(args[0]);
        Double num2 = Double.parseDouble(args[1]);
        String operator  = args[2];
        switch (operator) {
            case "+":
                System.out.println(num1 +"+"+ num2+"="+(num1+num2));
                break;
                case "-":
                    System.out.println(num1 +"-"+ num2+"="+(num1-num2));
                    break;
                    case "*":
                        System.out.println(num1 +"*"+ num2+"="+(num1*num2));
                        break;
                        case "/":
                            System.out.println(num1 +"/"+ num2+"="+(num1/num2));
                            break;
                            default:
                                break;


        }
    }
}

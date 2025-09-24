public class AVG {
	public static void main(String args[]){
        String num1s= args[0];
        String num2s= args[1];
        String num3s= args[2];
        float num1 = Float.parseFloat(num1s);
        float num2 = Float.parseFloat(num2s);
        float num3 = Float.parseFloat(num3s);
        int avg = (int) (num3+num2+num1)/3;
		System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("num3: " + num3);
        System.out.println("avg: " + avg);
	}
}
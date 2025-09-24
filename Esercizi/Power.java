import java.lang.Math;
public class Power{
	public static void main(String[] args) {
		double base = Double.parseDouble(args[0]); 
		double exponent = Double.parseDouble(args[1]);  
		double result = Math.pow(base, exponent);
		
		System.out.println("base= " + base);
		System.out.println("exponent= " + exponent);
		System.out.println("result= " + result);
	}
	}
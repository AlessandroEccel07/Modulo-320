import java.lang.Math;
public class Pythagoras{
	public static void main(String[] args) {
		double leg1 = Double.parseDouble(args[0]); 
		double leg2 = Double.parseDouble(args[1]);  
		double leg1s = Math.pow(leg1, 2);
		double leg2s = Math.pow(leg2, 2);
		double hy2 = leg1s + leg2s;
		double hypotenuse = Math.sqrt(hy2);
		String numeroFormattato = String.format("%.2f", hypotenuse);
		
		System.out.println("leg1= " + leg1);
		System.out.println("leg2= " + leg2);
		System.out.println("hypotenuse = " + numeroFormattato);
	}
	}
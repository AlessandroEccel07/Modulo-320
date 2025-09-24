import java.lang.Math;
public class MultiplesOfFive{
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]); 
		if((number%5)==0){
		System.out.println(number + " is a multiple of 5");
		}
		else{
		System.out.println(number + " is not a multiple of 5");
		}
		
	}
	}
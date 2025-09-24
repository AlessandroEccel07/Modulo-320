import java.lang.Math;
public class Encryption{
	public static void main(String[] args) {
		String inputCode = args[0]; 
		char[] parola = inputCode.toCharArray();
		int numeroDiElementi = parola.length;
		System.out.println("inputCode = "+ inputCode);
		System.out.print("encryptedCode = ");
		System.out.print(parola[0]);
		System.out.print(parola[2]);
		System.out.print(parola[numeroDiElementi-1]);
		System.out.println(parola[numeroDiElementi-2]);
		
	}
	}
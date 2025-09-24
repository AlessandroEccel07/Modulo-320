import java.lang.Math;
public class Dice{
	public static int getRandom(int min, int max) {

		int range = (max - min) + 1;
     		int random = (int) ((range * Math.random()) + min);
		return random;
	}
	public static void main(String[] args) {
		int Roll = getRandom(1, 6);
		System.out.println("Dice = " + Roll);
	}
	}
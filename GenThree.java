/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
		int random1 = (int)((Math.random() * (b - a)) + a);
		int random2 = (int)((Math.random() * (b - a)) + a);
		int random3 = (int)((Math.random() * (b - a)) + a);
		
	}
}

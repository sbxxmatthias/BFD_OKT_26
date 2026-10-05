
public class Casting {

	public static void main(String[] args) {
		int a = 10;
		long b;
		long c = Integer.MAX_VALUE; // ca. 2.4 Mrd...
				
		b = a; // unkritisch links long, rechts int ist IMPLIZIT
		
		a = (int) c; // rechts: long, links int 
		// c passt GRADE SO NOCH in den Wertebereich von int rein !
		System.out.println(a);
		
		c = c + 10; // c += 1; c++; ++c;
		// c = 2147483648
		a = (int) c;
		// Was macht das System jetzt? 
		System.out.println(a);
		
		// OVERFLOW
		// In Python kein Problem 
		
	}

}

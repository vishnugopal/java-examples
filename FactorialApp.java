

/**
 * The FactorialApp class implements an application that
 * calculates factorial of a given number.
 * There's also decent exception handling.
 */
class FactorialApp {
	public static void main(String[] args) {
		System.out.println("Starting up..."); // Display the string.		
		int number, product = 1;
		
		try {
			number = java.lang.Integer.parseInt(args[0]);
		} catch(java.lang.NumberFormatException e) {
			System.out.println("A number (not a string) should be given as parameter.");
			return;
		} catch(java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("A number should be given as a parameter.");
			return;
		}
		
		for(int i = 1; i <= number; i++) {
			product = product * i;
		}
		
		System.out.print("The factorial of ");
		System.out.print(number); 
		System.out.print(" is: ");
		System.out.println(product);
  }
}
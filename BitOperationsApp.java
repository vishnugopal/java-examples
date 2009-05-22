
/**
 * The BitOperationsApp illustrates bitwise &
 */
class BitOperationsApp {
	public static void main(String[] args) {
		
		/* note this is hexadecimal F
		   you can also write this as 0xF without any difference.
		  (or substitute any non-zero value in place of F, like 0x000A)
		*/
		int bitmask = 0x000F; 
		
		int val = 0x2222;
		
		/* 
		Bitwise AND (&) operation is like this:
		Bitmask | Val | Val & Bitmask
		 0        2       0
		 0        2       0
		 0        2       0
		 F        2       2
		*/
		System.out.println(val & bitmask);  // prints "2"
	}
}
package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public void printByteBinary(byte b) {
		
	}
	
	public void printShortBinary(short s) {
		
	}
	
	public void printIntBinary(int i) {
		boolean[] bit;
		boolean negative = false;
		if(i < 0) {
			negative = true;
			i = i*(-1);
		}
		int power = 0;
		boolean bool = true;
		while(bool) {
			int check = 1;
			for(int j = 0; j < power; j++) {
				check = check*2;
			}
			if(i < check) {
				power--;
				int current = i;
				bit = new boolean[power];
				boolean bool2 = true;
				for(int j = power-1; j >= 0; j--) {
					if(current-check > 0) {
						current -= check;
						bit[j] = true;
					}else {
						bit[j] = false;
					}
					check = check/2;
				}
				bool = false;
			}
			power++;
		}
		
	}
	
	public void printLongBinary(long l) {
		
	}
}

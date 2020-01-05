package _03_Printing_Binary;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public void printByteBinary(byte b){
		String ss = b + "";
		printIntBinary(Integer.parseInt(ss));
	}
	
	public void printShortBinary(short s) {
		String ss = s + "";
		printIntBinary(Integer.parseInt(ss));
	}
	
	public void printIntBinary(int i) {
		int power = 1;
		boolean bool = true;
		while(bool) {
			int check = 1;
			for(int j = 0; j < power; j++) {
				check = check*2;
			}
			if(i < check) {
				power --;
				check = check/2;
				int current = i;
				String s = "";
				for(int j = power; j >= 0; j--) {
					if(current - check >= 0) { 
						s += "1";
						current -= check;
					}else {
						s += "0";
					}
					check = check/2;
				}
				System.out.println(s);
				bool = false;
			}
			power++;
		}		
	}
	
	public void printLongBinary(long l) {
		String ss = l + "";
		printIntBinary(Integer.parseInt(ss));
	}
	
	//--
	
	int pow(int num, int pow) {
		int j = 1;
		for(int i = 0; i < pow; i++) {
			j = j * num;
	    }
		return j;
	}
}

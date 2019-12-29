package _03_Printing_Binary;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryPrinterTester {
	
	public static void main(String[] args) {
		BinaryPrinter a = new BinaryPrinter();
		a.printIntBinary(36456346);
		a.printShortBinary((short) 0);
		a.printByteBinary((byte) 23);
		a.printLongBinary((long) 281658284);
	}
	
}

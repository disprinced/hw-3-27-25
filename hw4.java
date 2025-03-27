// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
	public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int input = 0;
    	do {
        	System.out.print("Enter a positive number: ");
        	input = scan.nextInt();
    	}
    	while (input < 1);
    	System.out.print("Thank you! Your number is: " + input);
	}
}

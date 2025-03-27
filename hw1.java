import java.util.*;

class Main {
	public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Please write a sentence.");
    	String sentence = scan.nextLine();
    	System.out.println(sentence.length());
    	String caps = sentence.toUpperCase();
    	caps = caps.replace(" ","_");
    	System.out.println(caps);
    	String sub = caps.substring(3,10);
    	System.out.println(sub);
	}
}

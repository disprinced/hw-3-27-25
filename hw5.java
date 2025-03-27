import java.util.*;

class Main {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many days late is the book?");
        int days = scan.nextInt();
        double fine = 0;
        if (days < 6){
            fine = days;
        }else if (days < 11){
            fine = days * 1.50;
        }else if (days >= 11){
            fine = days * 2;
        }
        if (fine > 30){
            fine = 30;
        }
    }
}
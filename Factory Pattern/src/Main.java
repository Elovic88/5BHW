import java.util.Scanner;

public class Main {
	public static void main(String[] skrt) {
		System.out.println("Welche Pizza möchten Sie bestellen? ");
		Scanner sc = new Scanner(System.in);
		String i = sc.next();
		
		if (i.equals("Ma")) {
			Factory f1 = new Factory();
			f1.createPizza("Margherita");
		}
		
		else if (i.equals("Da")) {
			Factory f1 = new Factory();
			f1.createPizza("Diavolo");
		}
		
		else System.out.println("Diese Pizza gibt es nicht!");
	}
}

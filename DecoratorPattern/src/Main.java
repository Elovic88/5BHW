
public class Main {
	public static void main(String[] args) {
		Pizza newPizza = new ExtraCheeseDecorator(new Hauspizza());
		
		System.out.println(newPizza.getBeschreibung());
		System.out.println("EUR: " + newPizza.preis() +"\n");
		
		Pizza newPizza2 = new ExtraSalamiDecorator(new Hauspizza());
		
		System.out.println(newPizza2.getBeschreibung());
		System.out.println("EUR: " + newPizza2.preis());
	}
}

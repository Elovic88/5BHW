import java.util.ArrayList;

public class PizzaM implements IPizza {
	
	ArrayList <Zutaten> z = new ArrayList<Zutaten>();
	
	Zutaten z1 = new Zutaten("Teig", "500g");
	Zutaten z2 = new Zutaten("Käse", "100g");
	Zutaten z3 = new Zutaten("Scharfe Tomatensauce", "100ml");
	
	public PizzaM() {
		z.add(z1);
		z.add(z2);
		z.add(z3);
	}
	
	@Override
	public void zubereiten() {
		// TODO Auto-generated method stub
		System.out.println("Ihre Pizza Margherita wird zubereitet:");
		for(int i = 0; i< z.size(); i++) {
			System.out.println(z.get(i));
		}
	}

	@Override
	public ArrayList<Zutaten> getZutaten() {
		// TODO Auto-generated method stub
		return z;
	}

}

import java.util.ArrayList;

public class PizzaD implements IPizza {

	ArrayList <Zutaten> z = new ArrayList<Zutaten>();
	
	@Override
	public void zubereiten() {
		// TODO Auto-generated method stub
		System.out.println("Ihre Pizza Diavolo wird zubereitet");
		for(int i = 0; i< z.size(); i++) {
			System.out.println(z.get(i));
		}
	}
	
	public PizzaD() {
		z.add(new Zutaten("Teig","500g"));
		z.add(new Zutaten("Tomatensauce","500g"));
		z.add(new Zutaten("Käse","500g"));
		z.add(new Zutaten("Salami","500g"));
	}

	@Override
	public ArrayList<Zutaten> getZutaten() {
		// TODO Auto-generated method stub
		return z;
	}

}

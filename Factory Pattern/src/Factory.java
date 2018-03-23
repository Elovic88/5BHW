
public class Factory {
	public IPizza createPizza(String name) {
		if(name == "Margherita") {
			PizzaM m1 = new PizzaM();
			m1.zubereiten();
			return m1;
			
		}
		
		if(name == "Diavolo") {
			PizzaD d1 = new PizzaD();
			d1.zubereiten();
			return d1;
		}
		System.out.println("Diese Pizza gibt es nicht!");
		return null;
	}

}

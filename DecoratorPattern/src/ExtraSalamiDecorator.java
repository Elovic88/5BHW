
public class ExtraSalamiDecorator extends ZutatenDecorator{
	
	public ExtraSalamiDecorator(Pizza p1) {
		this.p1 = p1;
	}
	
	@Override
	public String getBeschreibung() {
		// TODO Auto-generated method stub
		return this.p1.getBeschreibung() + " mit extra salami";
	}

	@Override
	public int preis() {
		// TODO Auto-generated method stub
		return this.p1.preis() + 3;
	}

}
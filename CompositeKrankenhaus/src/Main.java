
public class Main {

	public static void main(String[] args) {
		CompositeUntersuchung uMain = new CompositeUntersuchung();
		uMain.add(new FieberMessen());
		
		CompositeUntersuchung kleineUntersuchung = new CompositeUntersuchung();
		kleineUntersuchung.add(new FieberMessen());
		kleineUntersuchung.add(new BlutdruckMessen());
		
		uMain.add(kleineUntersuchung);
		
		CompositeUntersuchung miniUntersucheung = new CompositeUntersuchung();
		miniUntersucheung.add(new FieberMessen());
		miniUntersucheung.add(new BlutdruckMessen());
		kleineUntersuchung.add(miniUntersucheung);
		
		System.out.println("Der Preis fuer die gesamte Untersuchung ist:");
		System.out.println(uMain.getPrize());
	}

}

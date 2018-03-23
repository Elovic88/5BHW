import java.lang.reflect.Array;

public class Zutaten{
	
	private String name;
	private String menge;
	
	public Zutaten(String name, String menge) {
		this.name = name;
		this.menge = menge;
	}
	
	public String toString() {
		return name + " "+ menge;
	} 
}

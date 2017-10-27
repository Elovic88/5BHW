
public class Singleton {

	private static Singleton instance = null;
	private Singleton()
	{
	}
	public static Singleton getInstance()
	{
		if(Singleton.instance == null)
		{
			Singleton.instance =  new Singleton();
			System.out.println("Eine neue Instanz wurde erstellt");
		}
		else
		{
			System.out.println("Es wurde keine neue Instanz erstellt");
		}
		return Singleton.instance;
	}

}

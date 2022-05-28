package pacote;

public class Singleton {
	private static Singleton singleton;
	private Singleton (String a) {
		salva = a;
	}
	public String salva;
	public static Singleton getInstance(String a) {
		if(singleton == null) {
			singleton = new Singleton(a);
		}
		return singleton;
	}
}	

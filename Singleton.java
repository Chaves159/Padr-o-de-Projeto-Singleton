package sing;

public class Singleton {
	private Singleton() {
		
	}
	
	private static Singleton instancia = null;
	
	public static Singleton getInstancia() {
		if(instancia == null) {
			//System.out.println("Instancia criada");
			instancia = new Singleton();
		}
		return instancia;
	}
}

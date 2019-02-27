package sing;

public class TestaSingleton {
	
	public static void main(String[] args) {
		Singleton teste = null;
		//Singleton s1 = new Singleton();
		
		for(int i = 0;i<20;i++) {
			teste = Singleton.getInstancia();
		}
	
		
	}
}

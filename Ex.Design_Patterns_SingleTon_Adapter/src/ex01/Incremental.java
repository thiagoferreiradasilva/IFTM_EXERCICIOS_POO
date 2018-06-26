package ex01;

public class Incremental {
	private static Incremental instancia = null;
	
	
	private Incremental() {
	}
	
	public static Incremental getInstancia() {
		if(instancia == null) {
			System.out.println("�nica Instancia Criada..");
			instancia = new Incremental();
		}
		return instancia;
	}
}

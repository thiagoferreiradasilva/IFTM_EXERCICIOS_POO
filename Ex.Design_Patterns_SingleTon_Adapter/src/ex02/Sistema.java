package ex02;

public class Sistema {

	public static void main(String[] args) {
		Cliente c1 = new Cliente(new SomadorExistenteAdapter());
		c1.executar();
	}
}

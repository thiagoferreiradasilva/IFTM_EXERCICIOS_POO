package ex03_templateMethod;

public class Sistema {

	public static void main(String[] args) {
		
		Relatorio rel = new RelatorioSimples();
		rel.imprimir();
		
		
		rel = new RelatorioComplexo();
		rel.imprimir();
	}
}

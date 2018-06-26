package ex03_templateMethod;

public class RelatorioSimples extends Relatorio{
	
	public String nomeBanco(){
		return " BANCO DO BRASIL ";
	}
	
	public String telefone(){
		return " 0800-940-1111 ";
	}
	
	public String titularConta() {
		return " MARCOS SILVA";
	}
	
	public double saldoConta() {
		return 2000.00;
	}
	
	
	public void imprimir() {
		System.out.println("\n\n RELAT�RIO SIMPLES");
		System.out.println("\n======================CABE�ALHO=========================");
		System.out.println("Nome do Banco: " + nomeBanco());
		System.out.println("Telefone:" + telefone());
		System.out.println("\n======================RODAP�=========================");
		System.out.println("Titular:" + titularConta());
		System.out.println("Saldo da Conta:" + saldoConta());
	}
}

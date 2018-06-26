package ex03_templateMethod;

public abstract class Relatorio {
	
	public abstract String nomeBanco();
	public abstract String telefone();
	public abstract String titularConta();
	public abstract double saldoConta();
	public abstract void imprimir();
}

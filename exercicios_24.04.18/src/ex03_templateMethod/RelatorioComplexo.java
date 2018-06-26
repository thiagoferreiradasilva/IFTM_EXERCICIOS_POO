package ex03_templateMethod;

import java.util.Date;

public class RelatorioComplexo extends Relatorio{
	
	public String nomeBanco(){
		return " CAIXA ECONOMICA FEDERAL ";
	}
	
	public String telefone(){
		return " 0800-1010-9090 ";
	}
	
	public String endereco() {
		return " Avenida Floriano Peixoto! ";
	}
	
	public String email() {
		return " bancodobrasil@bb.com ";
	}
	
	public Date data() {
		Date dataAtual = new Date();
		
		return dataAtual;
	}
	
	public String titularConta() {
		return " THIAGO FERREIRA";
	}
	
	public double saldoConta() {
		return 9000.00;
	}
	
	public String nAgencia() {
		return " 1515-0 ";
	}
	
	public String numeroConta() {
		return	" 14587-2";
	}

	public void imprimir() {
		System.out.println("\n\n RELATÓRIO COMPLEXO");
		System.out.println("\n======================CABEÇALHO=========================");
		System.out.println("Nome do Banco:" + nomeBanco());
		System.out.println("Telefone:" + telefone());
		System.out.println("Endereço:" + endereco());
		System.out.println("E-mail:" + email());
		System.out.println("Data:" + data());
		System.out.println("\n======================RODAPÉ=========================");
		System.out.println("Agencia:" + nAgencia());
		System.out.println("Conta:" + numeroConta());
	}
}

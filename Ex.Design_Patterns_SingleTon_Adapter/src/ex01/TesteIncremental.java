package ex01;

public class TesteIncremental {

	public static void main(String[] args) {
		Incremental inc = null;
		
		for(int i = 0; i < 10; i++) {
			inc = Incremental.getInstancia();
			System.out.println(inc);
		}
	}

}




/* 	NO PRIMEIRO C�DIGO, FORAM CRIADAS 10 INSTANCIAS DIFERENTES..
 *  AGORA DEPOIS DA TROCA DE IMPLEMENTA��O PARA O PADR�O SINGLETON,
 *  FOI CRIADA SOMENTE UMA INSTANCIA, ATRIBUINDO SOMENTE UM ENDERE�O
 *  DE MEM�RIA. CONFIRA NO C�DIGO
 * 
 * 
 * */

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




/* 	NO PRIMEIRO CÓDIGO, FORAM CRIADAS 10 INSTANCIAS DIFERENTES..
 *  AGORA DEPOIS DA TROCA DE IMPLEMENTAÇÃO PARA O PADRÃO SINGLETON,
 *  FOI CRIADA SOMENTE UMA INSTANCIA, ATRIBUINDO SOMENTE UM ENDEREÇO
 *  DE MEMÓRIA. CONFIRA NO CÓDIGO
 * 
 * 
 * */

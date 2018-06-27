package ex02;

public class SomadorExistenteAdapter implements SomadorEsperado {

	public int somaVetor(int[] vetor) {
		int soma = 0;

		for (int i = 0; i < vetor.length; i++)
			soma += vetor[i];

		return soma;
	}
}

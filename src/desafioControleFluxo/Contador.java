package desafioControleFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int numeroUm = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		int numeroDois = sc.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(numeroUm, numeroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println(exception);
		}
	}
	
	static void contar(int numeroUm, int numeroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(numeroUm > numeroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
		}
		
		
		int contagem = numeroDois - numeroUm;
		//realizar o for para imprimir os números com base na variável contagem
		for(int i = 0; i < contagem; i++) {
			System.out.println("Imprimindo o número " + (numeroUm + i));
		}
	}
	
}

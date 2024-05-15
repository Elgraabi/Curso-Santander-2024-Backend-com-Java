package Application;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		boolean inicial = true;
		String confirma = "";

		do {
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();
			try {
				// chamando o método contendo a lógica de contagem
				contar(parametroUm, parametroDois);
			} catch (ParametrosInvalidosException exception) {
				// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
				System.out.println(exception.getMessage());
			}

			System.out.println("Deseja para o programa? (S/N): ");
			terminal.nextLine();
			confirma = terminal.nextLine();
			if (confirma.equalsIgnoreCase("S")) {
				inicial = false;
			}
		} while (inicial);

		System.out.println("Programa finalizado!");
		terminal.close();
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}

		int contagem = parametroDois - parametroUm;
		// realizar o for para imprimir os números com base na variável contagem
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo numero " + i);
		}
	}
}

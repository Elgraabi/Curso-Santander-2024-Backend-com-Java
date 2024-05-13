package Apllication;

public class Program {

	public static void main(String[] args) {
		// Operadores Aritméticos
		int a = 10;
		int b = 3;
		int soma = a + b; // soma = 13
		int subtracao = a - b; // subtracao = 7
		int multiplicacao = a * b; // multiplicacao = 30
		int divisao = a / b; // divisao = 3
		int modulo = a % b; // modulo = 1
		
		// Operadores de Atribuição
		int x = 5;
		x += 3; // x = x + 3 => x = 8
		
		// Operadores de Incremento e Decremento
		int y = 5;
		y++; // y = y + 1 => y = 6

		// Operadores de Comparação
		int c = 5;
		int v = 3;
		boolean igual = (c == v); // igual = false
		boolean diferente = (c != v); // diferente = true
		boolean maior = (c > v); // maior = true
		boolean menor = (c < v); // menor = false
		boolean maiorOuIgual = (c >= v); // maiorOuIgual = true
		boolean menorOuIgual = (c <= v); // menorOuIgual = false

		// Operadores Lógicos
		boolean n = true;
		boolean m = false;
		boolean resultado1 = (n && m); // resultado1 = false
		boolean resultado2 = (n || m); // resultado2 = true
		boolean resultado3 = !n; // resultado3 = false

	}

}

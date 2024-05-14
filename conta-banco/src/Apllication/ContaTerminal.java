package Apllication;

import java.util.Locale;
import java.util.Scanner;

import Entities.Conta;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Conta conta;
		System.out.println("------------ Craindo conta ------------");
		System.out.println("Por favor, digite o número da Agência !");
		int numero = sc.nextInt();
		System.out.println("Digite a agencia: ");
		String agencia = sc.next();
		System.out.println("Digite seu nome: ");
		String nomeCliente = sc.next();
		System.out.println("Digite seu saldo: ");
		Double saldo = sc.nextDouble();
		System.out.println("----------------------------------------");
		conta = new Conta(numero, agencia, nomeCliente, saldo);
		System.out.println(conta);
		System.out.println("----------------------------------------\n");
	
		sc.close();
	}

}

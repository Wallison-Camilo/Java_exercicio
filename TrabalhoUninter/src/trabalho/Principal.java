package trabalho;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		Cofrinho cofrinho = new Cofrinho();
		
		System.out.println("Cofrinho:");
		System.out.println("1-Adicionar Moeda");
		System.out.println("2-Remover Moeda");
		System.out.println("3-Listar Moedas");
		System.out.println("4-Calcular total convertido para Real");
		System.out.println("0-Encerrar");
		opcao=teclado.nextInt();
		
		//variaveis
		Moeda moeda;
		double valor;
		int tipoMoeda = 0;
		
		while(opcao!=0) {
			
			switch(opcao) {
			
			case 1:
				//adicionar moeda

				tipoMoeda = 0;
				while(tipoMoeda > 3 || tipoMoeda <= 0) {
					System.out.println("Escolha Moeda:");
					System.out.println("1-Real:");
					System.out.println("2-Dolar:");
					System.out.println("3-Euro:");
					tipoMoeda = teclado.nextInt();
				}
				System.out.println("Digite o Valor:");
				
				valor = teclado.nextDouble();
				moeda = null;
				if(tipoMoeda == 1) {
					moeda = new Real(valor);
				}
				if(tipoMoeda == 2) {
					moeda = new Dolar(valor);
				}
				if(tipoMoeda == 3) {
					moeda = new Euro(valor);
				}
				
				cofrinho.adicionar(moeda);
				
				break;
			
			case 2:
				//remover moeda

				tipoMoeda = 0;
				while(tipoMoeda > 3 || tipoMoeda <= 0) {
					System.out.println("Escolha Moeda:");
					System.out.println("1-Real:");
					System.out.println("2-Dolar:");
					System.out.println("3-Euro:");
					tipoMoeda = teclado.nextInt();
				}
				System.out.println("Digite o Valor:");
				
				valor = teclado.nextDouble();
				moeda = null;
				if(tipoMoeda == 1) {
					moeda = new Real(valor);
				}
				if(tipoMoeda == 2) {
					moeda = new Dolar(valor);
				}
				if(tipoMoeda == 3) {
					moeda = new Euro(valor);
				}
				
				cofrinho.remover(moeda);
			
				break;
			
			case 3:
				//listagem
				cofrinho.listagemMoedas();
				break;
			case 4:
				//total
				cofrinho.totalConvertido();
				break;
			case 0:
				//encerra
				System.exit(0);
			default:
				System.out.println("Opção Inválida");
		}
			System.out.println("Cofrinho:");
			System.out.println("1-Adicionar Moeda");
			System.out.println("2-Remover Moeda");
			System.out.println("3-Listar Moedas");
			System.out.println("4-Calcular total convertido para Real");
			System.out.println("0-Encerrar");
			opcao=teclado.nextInt();
	}

	}
}
	

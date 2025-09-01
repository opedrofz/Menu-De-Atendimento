package projetorestaurante;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaCardapio {

	public static void main(String[] args) {

		ArrayList<String> nomePedidos = new ArrayList<>();
		ArrayList<Double> valorPedidos = new ArrayList<>();

		Scanner scan = new Scanner(System.in);

		String[] entradas = { "Cestinha de Queijo", "Bruschetta", "Mini Pastel", "Camarão Crocante", "Carpaccio",
				"Bolinho de Bacalhau", "Dadinho de Tapioca", "Salada Caprese" };
		double[] valorEntradas = { 12.50, 15.00, 8.00, 25.00, 28.00, 18.00, 14.00, 20.00 };

		String[] principal = { "Sol Nascente", "Coração da Terra", "Ecanto do Mar", "Brasas", "Costela da Casa",
				"MegaZorde", "Montanha", "Toscana" };
		double[] valorPrincipal = { 65.00, 72.00, 80.00, 70.00, 68.00, 75.00, 85.00, 78.00 };

		String[] sobremesas = { "Pudim", "Tiramisu", "Cheesecake", "Petit Gâteau", "Mousse de Maracujá", "Brownie",
				"Pavê", "Sorvete Artesanal" };
		double[] valorSobremesas = { 12.00, 15.00, 18.00, 14.00, 10.00, 13.00, 9.00, 8.00 };

		String[] drinks = { "Caipirinha", "Mojito", "Piña Colada", "Margarita", "Gin Tônica", "Sex on the Beach",
				"Daiquiri", "Cosmopolitan" };
		double[] valorDrinks = { 22.00, 25.00, 28.00, 26.00, 24.00, 27.00, 23.00, 29.00 };

		String[] bebidas = { "Água", "Coca-Cola", "Pepsi", "Guaraná", "Sprite", "Schweppes", "Heineken", "Budweiser",
				"Corona" };
		double[] valorBebidas = { 5.00, 8.00, 8.00, 7.00, 7.00, 9.00, 12.00, 12.00, 14.00 };

		double total = 0.0;

		System.out.println("Seja Bem-Vindo ao Restaurante!\n");

		int cont = -1;
		while (cont != 2) {

			enviarMenu();

			System.out.println("\nInsira a opção desejada: "); // MENU PRINCIPAL
			int opcaoMenu1 = scan.nextInt();

			if (opcaoMenu1 == 0) {
				System.out.println("\n=== ALIMENTOS & BEBIDAS ===\n"); // CARDAPIO
				enviarMenu2();
				
			}
			System.out.println("\nInsira a opção desejada: ");
			int opcaoMenu2 = scan.nextInt(); // TIPO: ENTRADA, PRINCIPAL, SOBREMESA...
			
			if (opcaoMenu2 == 0) {
				System.out.println("==== ENTRADAS ====\n"); // TODOS OS PRATOS DE ENTRADA
				for (int j = 0; j < entradas.length; j++) {
					System.out.printf("[" + j + "]" + " - " + "%-20s R$ %6.2f%n", entradas[j], valorEntradas[j]);
				}

				System.out.println("Insira o Prato de Entrada desejado que notificaremos o garçom."); // ESCOLHA DO
																										// PRATO
																										// PELO CLIENTE
				int escolhaEntrada = scan.nextInt();

				if (escolhaEntrada >= 0 && escolhaEntrada <= 7) {
					System.out.println("Entrada escolhida: " + entradas[escolhaEntrada] + ".");
					System.out.println("Pedido Efetuado! Aguarde.");

				} else {
					System.out.println(
							"Ops! Não encontramos nenhum Prato! Selecione a numeração correspondente ao Prato escolhido.");
				}

			} else if (opcaoMenu2 == 1) {
				System.out.println("==== PRATO PRINCIPAL ====\n"); // TODOS OS PRATOS PRINCIPAIS
				for (int j = 0; j < principal.length; j++) {
					System.out.printf("[" + j + "]" + " - " + "%-20s R$ %6.2f%n", principal[j], valorPrincipal[j]);
				}
				System.out.println("");
				System.out.println("Insira o Prato Principal desejado que notificaremos o garçom."); // ESCOLHA DO PRATO
																										// PELO CLIENTE
				int escolhaPrincipal = scan.nextInt();

				if (escolhaPrincipal >= 0 && escolhaPrincipal <= 7) {
					System.out.println("Prato Principal escolhido: " + principal[escolhaPrincipal] + ".");
					System.out.println("Pedido Efetuado! Aguarde.");

				} else {
					System.out.println(
							"Ops! Não encontramos nenhum Prato! Selecione a numeração correspondente ao Prato escolhido.");
				}

			} else if (opcaoMenu2 == 2) {
				System.out.println("==== SOBREMESAS ====\n"); // TODAS AS SOBREMESAS
				for (int j = 0; j < sobremesas.length; j++) {
					System.out.printf("[" + j + "]" + " - " + "%-20s R$ %6.2f%n", sobremesas[j], valorSobremesas[j]);
				}

				System.out.println("");
				System.out.println("Insira a Sobremesa desejado que notificaremos o garçom."); // ESCOLHA DA SOBREMESA
																								// PELO
																								// CLIENTE
				int escolhaSobremesa = scan.nextInt();

				if (escolhaSobremesa >= 0 && escolhaSobremesa <= 7) {
					System.out.println("Sobremesa solicitada: " + sobremesas[escolhaSobremesa] + ".");
					System.out.println("Pedido Efetuado! Aguarde.");

				} else {
					System.out.println(
							"Ops! Não encontramos nenhuma Sobremesa! Selecione a numeração correspondente a Sobremesa escolhida.");
				}

			} else if (opcaoMenu2 == 3) {
				System.out.println("==== DRINKS ====\n"); // TODOS OS DRINKS
				for (int j = 0; j < drinks.length; j++) {
					System.out.printf("[" + j + "]" + " - " + "%-20s R$ %6.2f%n", drinks[j], valorDrinks[j]);
				}

				System.out.println("\nInsira o Drink desejado que notificaremos o garçom."); // ESCOLHA DOS DRINKS DO
																								// CLIENTE

				int escolhaDrink = scan.nextInt();

				if (escolhaDrink >= 0 && escolhaDrink <= 7) {
					System.out.println("Drinks solicitado: " + sobremesas[escolhaDrink] + ".");
					System.out.println("Pedido Efetuado! Aguarde.");

				} else {
					System.out.println(
							"Ops! Não encontramos nenhum Drink! Selecione a numeração correspondente ao Drink escolhido.");
				}

			} else if (opcaoMenu2 == 4) {
				System.out.println("==== BEBIDAS ====\n"); // TODAS BEBIDAS
				for (int j = 0; j < bebidas.length; j++) {
					System.out.printf("[" + j + "]" + " - " + "%-20s R$ %6.2f%n", bebidas[j], valorBebidas[j]);
				}

				System.out.println("\nInsira a Bebida desejado que notificaremos o garçom."); // ESCOLHA DAS BEBIDAS DO
																								// CLIENTE

				int escolhaBebidas = scan.nextInt();

				if (escolhaBebidas >= 0 && escolhaBebidas <= 7) {
					System.out.println("Bebida solicitado: " + bebidas[escolhaBebidas] + ".");
					System.out.println("Pedido Efetuado! Aguarde.");

				} else {
					System.out.println(
							"Ops! Não encontramos nenhuma Bebida! Selecione a numeração correspondente a Bebida escolhida.");
				}
			} else if (opcaoMenu1 == 1) {
				System.out.println("\n==== CONTA ====\n");

			}

		} // LOOP INICIAL
	}

	public static void enviarMenu() {
		System.out.println("[0] Acessar o cardápio");
		System.out.println("[1] Pedir a Conta");
		System.out.println("[2] Finalizar Atendimento");
	}

	public static void enviarMenu2() { // CARDÁPIO
		System.out.println("[0] Entradas");
		System.out.println("[1] Pratos Principais");
		System.out.println("[2] Sobremesas");
		System.out.println("[3] Drinks");
		System.out.println("[4] Bebidas");
		System.out.println("[5] Voltar");
	}
}
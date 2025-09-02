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

		double totalConta = 0.0;
		
		System.out.println("Seja Bem-Vindo ao Restaurante!\n");
		
		boolean repetir = true;
		menu1: while (repetir) {

			enviarMenu();

			System.out.println("\nInsira a opção desejada: "); // MENU PRINCIPAL
			int opcaoMenu1 = scan.nextInt();

			if (opcaoMenu1 == 0) {
				int contMenu1 = -1;
				
				menu2: while (contMenu1 != 5) {
				System.out.println("\n=== ALIMENTOS & BEBIDAS ===\n"); // CARDAPIO
				enviarMenu2();
				
                    System.out.println("\nInsira a opção desejada: ");
			    int opcaoMenu2 = scan.nextInt(); // TIPO: ENTRADA, PRINCIPAL, SOBREMESA...
			
			    if (opcaoMenu2 == 0) {
			    	
				    System.out.println("==== ENTRADAS ====\n"); // TODOS OS PRATOS DE ENTRADA
				    for (int j = 0; j < entradas.length; j++) {
					    System.out.printf("[" + j + "]" + " - " + "%-20s R$ %6.2f%n", entradas[j], valorEntradas[j]);
				    }

				        System.out.println("\nInsira o Prato de Entrada desejado que notificaremos o garçom."); // ESCOLHA DO
																										// PRATO
																										// PELO CLIENTE
				    int escolhaEntrada = scan.nextInt();

				    if (escolhaEntrada >= 0 && escolhaEntrada <= 7) {
					    System.out.println("Entrada escolhida: " + entradas[escolhaEntrada] + ".");
					    System.out.println("Pedido Efetuado! Aguarde.");
					    
					    nomePedidos.add(entradas[escolhaEntrada]);    //ARMAZENA NA ARRAY
					    valorPedidos.add(valorEntradas[escolhaEntrada]);
					    totalConta += valorEntradas[escolhaEntrada];
					    
					    	System.out.println("\nVocê deseja fazer outro pedido? (S/N): ");
					    	scan.nextLine();
					    	String saida = scan.nextLine().toUpperCase();
					    	if (saida.equalsIgnoreCase("S")) {
					    		continue menu2;  //RETORNA AO MENU2
					    	} else {
					    		break;
					    	}
				    
				    } else {
				    	System.out.println("Número Inválido! Tente novamente.");
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
					    
					    nomePedidos.add(principal[escolhaPrincipal]);    //ARMAZENA NA ARRAY
					    valorPedidos.add(valorPrincipal[escolhaPrincipal]);
					    totalConta += valorPrincipal[escolhaPrincipal];
					    
					    System.out.println("\nVocê deseja fazer outro pedido? (S/N): ");
				    	scan.nextLine();
				    	String saida = scan.nextLine().toUpperCase();
				    	if (saida.equalsIgnoreCase("S")) {
				    		continue menu2;  //RETORNA AO MENU2
				    	} else {
				    		break;
				    	}

				    } else {
					    System.out.println("Número Inválido! Tente novamente.");
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
					    
					    nomePedidos.add(sobremesas[escolhaSobremesa]);   //ARMAZENA NA ARRAY
					    valorPedidos.add(valorSobremesas[escolhaSobremesa]);
					    totalConta += valorSobremesas[escolhaSobremesa];
					    
					    System.out.println("\nVocê deseja fazer outro pedido? (S/N): ");
				    	scan.nextLine();
				    	String saida = scan.nextLine().toUpperCase();
				    	if (saida.equalsIgnoreCase("S")) {
				    		continue menu2;  //RETORNA AO MENU2
				    	} else {
				    		break;
				    	}

				    } else {
				    	System.out.println("Número Inválido! Tente novamente.");
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
					    System.out.println("Drink solicitado: " + sobremesas[escolhaDrink] + ".");
					    System.out.println("Pedido Efetuado! Aguarde.");
					    
					    nomePedidos.add(drinks[escolhaDrink]);   //ARMAZENA NA ARRAY
					    valorPedidos.add(valorDrinks[escolhaDrink]);
					    totalConta += valorDrinks[escolhaDrink];
					    
					    System.out.println("\nVocê deseja fazer outro pedido? (S/N): ");
				    	scan.nextLine();
				    	String saida = scan.nextLine().toUpperCase();
				    	if (saida.equalsIgnoreCase("S")) {
				    		continue menu2;  //RETORNA AO MENU2
				    	} else {
				    		break;
				    	}

				    } else {
				    	System.out.println("Número Inválido! Tente novamente.");
					    continue ;
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
					    System.out.println("Bebida solicitada: " + bebidas[escolhaBebidas] + ".");
					    System.out.println("Pedido Efetuado! Aguarde.");
					    
					    nomePedidos.add(bebidas[escolhaBebidas]);    //ARMAZENA NA ARRAY
					    valorPedidos.add(valorBebidas[escolhaBebidas]);
					    totalConta += valorBebidas[escolhaBebidas];
					    
					    System.out.println("\nVocê deseja fazer outro pedido? (S/N): ");
				    	scan.nextLine();
				    	String saida = scan.nextLine().toUpperCase();
				    	if (saida.equalsIgnoreCase("S")) {
				    		continue menu2;  //RETORNA AO MENU2
				    	} else {
				    		break;
				    	}

				    } else {
					    System.out.println("Número Inválido! Tente novamente.");
				    }
			    }
			
			} 

			} else if (opcaoMenu1 == 1) {
				System.out.println("\n==== CONTA ====\n");
				for (int i = 0; i < nomePedidos.size(); i++) {
					System.out.printf("%d - " + "%-20s R$ %6.2f%n",i , nomePedidos.get(i), valorPedidos.get(i));
				}
				System.out.printf("Total: R$ %.2f%n", totalConta);
				System.out.println("\nVocê deseja fazer outro pedido? (S/N): ");
		    	scan.nextLine();
		    	String saidaConta = scan.nextLine().toUpperCase();
		    	if (saidaConta.equalsIgnoreCase("S")) {
		    		continue menu1;  
		    	} else {
		    		continue menu1;
		    	}
			
			} else if (opcaoMenu1 == 2) {
				System.out.println("\nFinalizando atendimento...");
				System.out.println("Obrigado pela preferência!");
				System.out.println("Volte sempre!");
				break;
				
			} else {
				System.out.println("Número Inválido! Tente novamente.");
			}
			}
		scan.close();} 


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
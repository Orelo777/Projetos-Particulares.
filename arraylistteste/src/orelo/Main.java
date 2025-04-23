package orelo;


		
		import java.util.Scanner;

		public class Main {

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int opcao = 0;
				
				Biblioteca biblioteca = new Biblioteca();
				do{
				System.out.println("=-=-=-MENU-=-=-=");
			
				System.out.println("[1]- Adicionar um novo livro");
				System.out.println("[2]- Mostrar os livros registrados");
				System.out.println("[3]- Buscar um livro através do título");
				System.out.println("[4]- Remover um livro através do título");
				System.out.println("[5]- Sair do programa");
				System.out.println("==========================================");
				System.out.println("");
				System.out.print("Digite um número para escolher uma dessas opções: ");
				 opcao = sc.nextInt();
				sc.nextLine();
				
				
				switch(opcao) {
					
				
				case 1:
					System.out.println();
					
					System.out.println("---REGISTRAR LIVROS---");
					System.out.println("Digite o nome da obra: ");
					String titulo= sc.nextLine();
					
					System.out.println("Digite o nome do autor deste livro: ");
					String autor = sc.nextLine();
					
					System.out.println("Em que ano ele foi publicado? ");
					int publicacao = sc.nextInt();
					
					
					
					
					biblioteca.addlivros(titulo, autor, publicacao);
					
					System.out.println("---------------------------------------------");
					
								break;
								
				case 2:
					System.out.println();
					System.out.println("---LISTA DE LIVROS---");
					biblioteca.listarlivros();
					
					System.out.println("---------------------------------------------");
					
							break;
							
							
				case 3: 
					System.out.println();
					System.out.println("---BUSCAR UM LIVRO---");
					System.out.println("Digite o nome do livro que você está buscando: ");
					titulo= sc.nextLine();
					
					biblioteca.buscarlivro(titulo);
					System.out.println("---------------------------------------------");
								break;
								
				case 4: 
					System.out.println();
					System.out.println("---REMOVER UM LIVRO---");
					System.out.println("Digite um nome de um livro para removê-lo: ");
					titulo = sc.nextLine();
					biblioteca.removerlivro(titulo);
					System.out.println("---------------------------------------------");
								break;
								
				case 5: 
					System.out.println();
					System.out.println("Obrigado por usar o programa!");
					System.out.println("Volte sempre... ");
					
					break;
					
					default:
						
						System.out.println("Opção inválida!!!!");
						break;
					
				
				
				
				}
				}while(opcao!=5);

				
				
				
			
				sc.close();
			}

			

	}



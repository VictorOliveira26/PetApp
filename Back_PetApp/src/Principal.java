import java.util.Scanner;

import Model.Pessoa;
import Model.Animal;
import DAO.ArrayAnimalPerdido;
import DAO.ArrayAnimalEncontrado;
import Model.AnimalDoacao;
import DAO.ArrayAnimalDoacao;
import Model.Vacina;
import DAO.ArrayVacina;

/* Andr� Luiz H. Kanashiro / Victor Oliveira*/
public class Principal {

	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			Pessoa p1 = new Pessoa();
			ler.nextLine();
			System.out.println("-----CADASTRAR NOVO USUARIO-----");
			System.out.println("Nome completo");
			p1.setNome(ler.nextLine());
			System.out.println("Email");
			p1.setEmail(ler.nextLine());
			System.out.println("Telefone");
			p1.setTelefone(ler.nextLine());
			System.out.println("Senha");
			p1.setSenha(ler.nextLine());
			System.out.println("Confirmar Senha");
			p1.setConfsenha(ler.nextLine());
			System.out.println();

			p1.toString();
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
		int op;

		do {
			System.out.println();
			System.out.println("----MENU----");
			System.out.println("1) Animais Perdidos");
			System.out.println("2) Animais Encontrados");
			System.out.println("3) Animais para Doa��o");
			System.out.println("4) Vacinas");
			System.out.println("5) Sair");
			System.out.print("Escolha uma op��o: ");
			op = ler.nextInt();

			switch (op) {

			case 1:// Animal perdido
				String resp;
				ler.nextLine();
				System.out.println("\nDeseja cadastrar um animal perdido? [S/N]");
				resp = ler.nextLine();
					if (resp.equals("S") || resp.equals("s")) {
						Animal a1 = new Animal();

						System.out.println("\n== Cadastro de animal perdido ==");
						System.out.println("Nome: ");
						a1.setNome(ler.nextLine());
						System.out.println("Esp�cie: ");
						a1.setEspecie(ler.nextLine());
						System.out.println("Ra�a: ");
						a1.setRaca(ler.nextLine());
						System.out.println("Cor: ");
						a1.setCor(ler.nextLine());
						System.out.println("Caracr�sticas: ");
						a1.setCaracteristicas(ler.nextLine());

						ArrayAnimalPerdido.addAnimal(a1);

						System.out.println("\nAnimal adicionado com sucesso!");
						System.out.println("\n--------------------------------------\n");

						
						if (ArrayAnimalPerdido.qtdAnimal() > 0) {

							System.out.println(
									"\nVoc� possui " + ArrayAnimalPerdido.qtdAnimal() + " animal(s) cadastrados \n");

							for (Animal temp : ArrayAnimalPerdido.getAnimal()) {

								System.out.println(temp.toString() + "\n");
								System.out.println("--------------------------------------\n");

							}

						} else {

							System.out.println("\nAten��o n�o h� Animais Cadastrados");

						}

					} else if (resp.equals("N") || resp.equals("n")) {

						if (ArrayAnimalPerdido.qtdAnimal() > 0) {

							System.out.println(
									"\nVoc� possui " + ArrayAnimalPerdido.qtdAnimal() + " animais cadastrados \n");

							for (Animal temp : ArrayAnimalPerdido.getAnimal()) {

								System.out.println(temp.toString() + "\n");
								System.out.println("--------------------------------------\n");

							}

						} else {

							System.out.println("\nAten��o n�o h� Animais Cadastrados");

						}
					}

				break;

			case 2:// Animal encontrado

				String resp1;
				ler.nextLine();
				System.out.println("\nDeseja cadastrar um animal encontrado? [S/N]");
				resp1 = ler.nextLine();

				if (resp1.equals("S") || resp1.equals("s")) {
					Animal a1 = new Animal();

					System.out.println("\n== Cadastro de animal encontrado ==");
					System.out.println("Nome: ");
					a1.setNome(ler.nextLine());
					System.out.println("Esp�cie: ");
					a1.setEspecie(ler.nextLine());
					System.out.println("Ra�a: ");
					a1.setRaca(ler.nextLine());
					System.out.println("Cor: ");
					a1.setCor(ler.nextLine());
					System.out.println("Carar�sticas: ");
					a1.setCaracteristicas(ler.nextLine());

					ArrayAnimalEncontrado.addAnimal(a1);

					System.out.println("\nAnimal adicionado com sucesso!");
					System.out.println("\n--------------------------------------\n");

					if (ArrayAnimalEncontrado.qtdAnimal() > 0) {

						System.out.println(
								"\nVoc� possui " + ArrayAnimalEncontrado.qtdAnimal() + " animal(s) cadastrados \n");

						for (Animal temp : ArrayAnimalEncontrado.getAnimal()) {

							System.out.println(temp.toString() + "\n");
							System.out.println("--------------------------------------\n");

						}

					} else {

						System.out.println("\nAten��o n�o h� Animais Cadastrados");

					}

				} else if (resp1.equals("N") || resp1.equals("n")) {

					if (ArrayAnimalEncontrado.qtdAnimal() > 0) {

						System.out.println(
								"\nVoc� possui " + ArrayAnimalEncontrado.qtdAnimal() + " animais cadastrados \n");

						for (Animal temp : ArrayAnimalEncontrado.getAnimal()) {

							System.out.println(temp.toString() + "\n");
							System.out.println("--------------------------------------\n");

						}

					} else {

						System.out.println("\nAten��o n�o h� Animais Cadastrados");

					}
				}

				break;

			case 3:// Animais para Doa��o

				String resp2;
				ler.nextLine();
				System.out.println("\nDeseja cadastrar um animal para doa��o? [S/N]");
				resp2 = ler.nextLine();

				if (resp2.equals("S") || resp2.equals("s")) {
					AnimalDoacao a1 = new AnimalDoacao();

					System.out.println("\n== Cadastro de animal para doa��o ==");
					System.out.println("Nome: ");
					a1.setNome(ler.nextLine());
					System.out.println("Esp�cie: ");
					a1.setEspecie(ler.nextLine());
					System.out.println("Ra�a: ");
					a1.setRaca(ler.nextLine());
					System.out.println("Cor: ");
					a1.setCor(ler.nextLine());
					System.out.println("Carar�sticas: ");
					a1.setCaracteristicas(ler.nextLine());
					System.out.println("Data de Nascimento: ");
					a1.setDatanascimento(ler.nextLine());

					ArrayAnimalDoacao.addAnimal(a1);

					System.out.println("\nAnimal adicionado com sucesso!");
					System.out.println("\n--------------------------------------\n");

					if (ArrayAnimalDoacao.qtdAnimal() > 0) {

						System.out.println(
								"\nVoc� possui " + ArrayAnimalDoacao.qtdAnimal() + " animal(s) cadastrados \n");

						for (AnimalDoacao temp : ArrayAnimalDoacao.getAnimal()) {

							System.out.println(temp.toString() + "\n");
							System.out.println("--------------------------------------\n");

						}

					} else {

						System.out.println("\nAten��o n�o h� Animais Cadastrados");

					}

				} else if (resp2.equals("N") || resp2.equals("n")) {

					if (ArrayAnimalDoacao.qtdAnimal() > 0) {

						System.out
								.println("\nVoc� possui " + ArrayAnimalDoacao.qtdAnimal() + " animais cadastrados \n");

						for (AnimalDoacao temp : ArrayAnimalDoacao.getAnimal()) {

							System.out.println(temp.toString() + "\n");
							System.out.println("--------------------------------------\n");

						}

					} else {

						System.out.println("\nAten��o n�o h� Animais Cadastrados");

					}
				}

				break;

			case 4:// Vacinas

				String resp3;
				ler.nextLine();
				System.out.println("\nDeseja cadastrar uma Vacina? [S/N]");
				resp3 = ler.nextLine();

				if (resp3.equals("S") || resp3.equals("s")) {
					Vacina v1 = new Vacina();

					System.out.println("\n== Cadastro de Vacina ==");
					System.out.println("Nome: ");
					v1.setNome(ler.nextLine());
					System.out.println("Data da Aplica��o: ");
					v1.setDataAplicacao(ler.nextLine());
					System.out.println("Data da pr�xima Aplica��o: ");
					v1.setDataProxAplicacao(ler.nextLine());

					ArrayVacina.addVacina(v1);

					System.out.println("\nVacina adicionada com sucesso!");
					System.out.println("\n--------------------------------------\n");

					if (ArrayVacina.qtdVacina() > 0) {

						System.out.println("\nVoc� possui " + ArrayVacina.qtdVacina() + " Vacina(s) cadastradas \n");

						for (Vacina temp : ArrayVacina.getVacina()) {

							System.out.println(temp.toString() + "\n");
							System.out.println("--------------------------------------\n");

						}

					} else {

						System.out.println("\nAten��o n�o h� Vacinas Cadastradas");

					}

				} else if (resp3.equals("N") || resp3.equals("n")) {

					if (ArrayVacina.qtdVacina() > 0) {

						System.out.println("\nVoc� possui " + ArrayVacina.qtdVacina() + " Vacina(s) cadastradas \n");

						for (Vacina temp : ArrayVacina.getVacina()) {

							System.out.println(temp.toString() + "\n");
							System.out.println("--------------------------------------\n");

						}

					} else {

						System.out.println("\nAten��o n�o h� Vacinas Cadastradas");

					}
				}

				break;

			case 5:// Sair

				System.out.println("\nPrograma finalizado.");

				break;

			default:

				System.out.println("\nOp��o Invalida, escolha novamente \n");

				break;

			}

		} while (op != 5);
	}

}

import java.util.Scanner;

import Model.Pessoa;
import Model.Animal;
import DAO.ArrayAnimalPerdido;
import DAO.ArrayAnimalEncontrado;
import Model.AnimalDoacao;
import DAO.ArrayAnimalDoacao;
import Model.Vacina;
import DAO.ArrayVacina;

public class Principal {

	 static Scanner ler = new Scanner(System.in);
	public static void main(String[] args) {	
		
		   ler.nextLine();
			Pessoa p1 = new Pessoa();
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
			
			int op;
			
			do {
				System.out.println();
				System.out.println("----MENU----");
				System.out.println("1) Animais Perdidos");
				System.out.println("2) Animais Encontrados");
				System.out.println("3) Animais para Doação");
				System.out.println("4) Vacinas");
				System.out.println("5) Sair");
				System.out.print("sua opção: ");
				op = ler.nextInt();
				
		switch(op) {
		
		case 1://Animal perdido
			String resp;
			ler.nextLine();
			System.out.println("\nDeseja cadastrar um animal perdido? S/N");
			System.out.print("sua opção: ");
			resp = ler.nextLine();
			
			if(resp.equals("S")  || resp.equals("s")) {
				Animal a1 = new Animal();

				System.out.println("\nCadastro de animal perdido: ");
				System.out.println("Nome: ");
				a1.setNome(ler.nextLine());
				System.out.println("Espécie: ");
				a1.setEspecie(ler.nextLine());
				System.out.println("Raça: ");
				a1.setRaca(ler.nextLine());
				System.out.println("Cor: ");
				a1.setCor(ler.nextLine());
				System.out.println("Cararísticas: ");
				a1.setCaracteristicas(ler.nextLine());

				ArrayAnimalPerdido.addAnimal(a1);

				System.out.println("\nAnimal adicionado com sucesso!");
				System.out.println("\n--------------------------------------\n");
				
				if(ArrayAnimalPerdido.qtdAnimal() > 0) {
					
					System.out.println("\nVocê possui "+ArrayAnimalPerdido.qtdAnimal()+" animal(s) cadastrados \n");

					for(Animal temp : ArrayAnimalPerdido.getAnimal()) {
						
						System.out.println(temp.toString() + "\n");
						System.out.println("--------------------------------------\n");

					}
					
				}else {

					System.out.println("\nAtenção não há Animais Cadastrados");	
						
				}
				
			}else
			if(resp.equals("N")  || resp.equals("n")){
			
			if(ArrayAnimalPerdido.qtdAnimal() > 0) {
				
				System.out.println("\nVocê possui "+ArrayAnimalPerdido.qtdAnimal()+" animais cadastrados \n");

				for(Animal temp : ArrayAnimalPerdido.getAnimal()) {

					System.out.println(temp.toString() + "\n");
					System.out.println("--------------------------------------\n");

				}
				
			}else {

				System.out.println("\nAtenção não há Animais Cadastrados");	
					
			}
		}
			
			break;
			
		case 2://Animal encontrado
			
			String resp1;
			ler.nextLine();
			System.out.println("\nDeseja cadastrar um animal encontrado? S/N");
			System.out.print("sua opção: ");
			resp1 = ler.nextLine();
			
			if(resp1.equals("S")  || resp1.equals("s")) {
				Animal a1 = new Animal();

				System.out.println("\nCadastro de animal encontrado: ");
				System.out.println("Nome: ");
				a1.setNome(ler.nextLine());
				System.out.println("Espécie: ");
				a1.setEspecie(ler.nextLine());
				System.out.println("Raça: ");
				a1.setRaca(ler.nextLine());
				System.out.println("Cor: ");
				a1.setCor(ler.nextLine());
				System.out.println("Cararísticas: ");
				a1.setCaracteristicas(ler.nextLine());

				ArrayAnimalEncontrado.addAnimal(a1);

				System.out.println("\nAnimal adicionado com sucesso!");
				System.out.println("\n--------------------------------------\n");
				
				if(ArrayAnimalEncontrado.qtdAnimal() > 0) {
					
					System.out.println("\nVocê possui "+ArrayAnimalEncontrado.qtdAnimal()+" animal(s) cadastrados \n");

					for(Animal temp : ArrayAnimalEncontrado.getAnimal()) {
						
						System.out.println(temp.toString() + "\n");
						System.out.println("--------------------------------------\n");

					}
					
				}else {

					System.out.println("\nAtenção não há Animais Cadastrados");	
						
				}
				
			}else
			if(resp1.equals("N")  || resp1.equals("n")){
			
			if(ArrayAnimalEncontrado.qtdAnimal() > 0) {
				
				System.out.println("\nVocê possui "+ArrayAnimalEncontrado.qtdAnimal()+" animais cadastrados \n");

				for(Animal temp : ArrayAnimalEncontrado.getAnimal()) {

					System.out.println(temp.toString() + "\n");
					System.out.println("--------------------------------------\n");

				}
				
			}else {

				System.out.println("\nAtenção não há Animais Cadastrados");	
					
			}
		}
			
			break;
			
		case 3://Animais para Doação
			
			String resp2;
			ler.nextLine();
			System.out.println("\nDeseja cadastrar um animal para doação? S/N");
			System.out.print("sua opção: ");
			resp2 = ler.nextLine();
			
			if(resp2.equals("S")  || resp2.equals("s")) {
				AnimalDoacao a1 = new AnimalDoacao();

				System.out.println("\nCadastro de animal para doação: ");
				System.out.println("Nome: ");
				a1.setNome(ler.nextLine());
				System.out.println("Espécie: ");
				a1.setEspecie(ler.nextLine());
				System.out.println("Raça: ");
				a1.setRaca(ler.nextLine());
				System.out.println("Cor: ");
				a1.setCor(ler.nextLine());
				System.out.println("Cararísticas: ");
				a1.setCaracteristicas(ler.nextLine());
				System.out.println("Data de Nascimento: ");
				a1.setDatanascimento(ler.nextLine());

				ArrayAnimalDoacao.addAnimal(a1);

				System.out.println("\nAnimal adicionado com sucesso!");
				System.out.println("\n--------------------------------------\n");
				
				if(ArrayAnimalDoacao.qtdAnimal() > 0) {
					
					System.out.println("\nVocê possui "+ArrayAnimalDoacao.qtdAnimal()+" animal(s) cadastrados \n");

					for(AnimalDoacao temp : ArrayAnimalDoacao.getAnimal()) {
						
						System.out.println(temp.toString() + "\n");
						System.out.println("--------------------------------------\n");

					}
					
				}else {

					System.out.println("\nAtenção não há Animais Cadastrados");	
						
				}
				
			}else
			if(resp2.equals("N")  || resp2.equals("n")){
			
			if(ArrayAnimalDoacao.qtdAnimal() > 0) {
				
				System.out.println("\nVocê possui "+ArrayAnimalDoacao.qtdAnimal()+" animais cadastrados \n");

				for(AnimalDoacao temp : ArrayAnimalDoacao.getAnimal()) {

					System.out.println(temp.toString() + "\n");
					System.out.println("--------------------------------------\n");

				}
				
			}else {

				System.out.println("\nAtenção não há Animais Cadastrados");	
					
			}
		}
			
			break;
	
		case 4://Vacinas
			
			String resp3;
			ler.nextLine();
			System.out.println("\nDeseja cadastrar uma Vacina? S/N");
			System.out.print("sua opção: ");
			resp3 = ler.nextLine();
			
			if(resp3.equals("S")  || resp3.equals("s")) {
				Vacina v1 = new Vacina();

				System.out.println("\nCadastro de Vacina: ");
				System.out.println("Nome: ");
				v1.setNome(ler.nextLine());
				System.out.println("Data da Aplicação: ");
				v1.setDataAplicacao(ler.nextLine());
				System.out.println("Data da próxima Aplicação: ");
				v1.setDataProxAplicacao(ler.nextLine());

				ArrayVacina.addVacina(v1);

				System.out.println("\nVacina adicionada com sucesso!");
				System.out.println("\n--------------------------------------\n");
				
				if(ArrayVacina.qtdVacina() > 0) {
					
					System.out.println("\nVocê possui "+ArrayVacina.qtdVacina()+" Vacina(s) cadastradas \n");

					for(Vacina temp : ArrayVacina.getVacina()) {
						
						System.out.println(temp.toString() + "\n");
						System.out.println("--------------------------------------\n");

					}
					
				}else {

					System.out.println("\nAtenção não há Vacinas Cadastradas");	
						
				}
				
			}else
			if(resp3.equals("N")  || resp3.equals("n")){
			
			if(ArrayVacina.qtdVacina() > 0) {
				
				System.out.println("\nVocê possui "+ArrayVacina.qtdVacina()+" Vacina(s) cadastradas \n");

				for(Vacina temp : ArrayVacina.getVacina()) {

					System.out.println(temp.toString() + "\n");
					System.out.println("--------------------------------------\n");

				}
				
			}else {

				System.out.println("\nAtenção não há Vacinas Cadastradas");	
					
			}
		}
			
			break;
			
		case 5://Sair
			
			System.out.println("\nPrograma finalizado.");
			
			break;
	
		default:
			
			System.out.println("\nOpção Invalida, escolha novamente \n");
			
			break;
		
		}
				
				
			}while(op != 5);	
	}

}

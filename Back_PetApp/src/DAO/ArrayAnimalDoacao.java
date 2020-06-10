package DAO;

import java.util.ArrayList;

import Model.AnimalDoacao;

public class ArrayAnimalDoacao {

	private static ArrayList<AnimalDoacao> array = new ArrayList<>();

	public static void addAnimal(AnimalDoacao a) {
		array.add(a);
	}

	public static ArrayList<AnimalDoacao> getAnimal() {
		return array;
	}

	public static int qtdAnimal() {
		return array.size();
	}

	public static void ExcluirAnimal(AnimalDoacao busca) {
		array.remove(busca);
	}

}

package DAO;

import java.util.ArrayList;

import Model.Vacina;

public class ArrayVacina {

	private static ArrayList<Vacina> array = new ArrayList<>();

	public static void addVacina(Vacina v) {
		array.add(v);
	}

	public static ArrayList<Vacina> getVacina() {
		return array;
	}

	public static int qtdVacina() {
		return array.size();
	}

	public static void ExcluirVacina(Vacina busca) {
		array.remove(busca);
	}

}

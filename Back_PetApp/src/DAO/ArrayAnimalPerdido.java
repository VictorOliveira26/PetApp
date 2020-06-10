package DAO;

import java.util.ArrayList;

import Model.Animal;;

public class ArrayAnimalPerdido {

		private static ArrayList<Animal> array= new ArrayList<>();
		
		public static void addAnimal(Animal a) {
			
				array.add(a);
			
		}
		
		public static ArrayList<Animal> getAnimal() {
			
			return array;

		}
		
		public static int qtdAnimal() {
			
			return array.size();
			
		}
		
		
		public static void ExcluirAnimal(Animal busca) {
			
			array.remove(busca);
			
		}

}

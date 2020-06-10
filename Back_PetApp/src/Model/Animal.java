package Model;

public class Animal {

		private String nome;
		private String especie;
		private String raca;
		private String cor;
		private String caracteristicas;
		
		
		public Animal() {
			
			
		}


		public Animal(String nome, String especie, String raca, String cor, String caracteristicas) {
			this.nome = nome;
			this.especie = especie;
			this.raca = raca;
			this.cor = cor;
			this.caracteristicas = caracteristicas;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getEspecie() {
			return especie;
		}


		public void setEspecie(String especie) {
			this.especie = especie;
		}


		public String getRaca() {
			return raca;
		}


		public void setRaca(String raca) {
			this.raca = raca;
		}


		public String getCor() {
			return cor;
		}


		public void setCor(String cor) {
			this.cor = cor;
		}


		public String getCaracteristicas() {
			return caracteristicas;
		}


		public void setCaracteristicas(String caracteristicas) {
			this.caracteristicas = caracteristicas;
		}		
		
		public String toString() {
			
			return "Nome: " + this.nome+ "\n"+
					"Espécie: "+ this.especie+ "\n"+
					"Raça: "+ this.raca+ "\n"+
					"Cor: "+ this.cor+ "\n"+
					"Caracteristicas: "+ this.caracteristicas + "\n";
		}
		
	}



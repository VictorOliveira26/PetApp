package Model;

public class AnimalDoacao extends Animal{
	
	private String datanascimento; 

	public AnimalDoacao() {
		super();
	}

	public AnimalDoacao(String nome, String especie, String raca, String cor, String caracteristicas, String datanascimento) {
		this.datanascimento = datanascimento;
	}

	public String getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}
	
public String toString() {
		
		return super.toString()+
				"Data de Nascimento: "+this.datanascimento+"\n";
				
	}
	
}

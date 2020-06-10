package Model;

public class Vacina {
	
	private String nome;
	private String dataAplicacao;
	private String dataProxAplicacao;
	
	public Vacina() {
		// TODO Auto-generated constructor stub
	}
	
	public Vacina(String nome, String dataAplicacao, String dataProxAplicacao) {
		this.nome = nome;
		this.dataAplicacao = dataAplicacao;
		this.dataProxAplicacao = dataProxAplicacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataAplicacao() {
		return dataAplicacao;
	}

	public void setDataAplicacao(String dataAplicacao) {
		this.dataAplicacao = dataAplicacao;
	}

	public String getDataProxAplicacao() {
		return dataProxAplicacao;
	}

	public void setDataProxAplicacao(String dataProxAplicacao) {
		this.dataProxAplicacao = dataProxAplicacao;
	}
	
	public String toString() {
		
		return "Nome: " + this.nome+ "\n"+
				"Data de Aplicação: "+ this.dataAplicacao+ "\n"+
				"Data da Próxima Aplicação: "+ this.dataProxAplicacao+ "\n";
	}

}

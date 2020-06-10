package Model;

import java.util.regex.Pattern;

public class Pessoa {

	private String nome;
	private String email;
	private String telefone;
	private String senha;
	private String confsenha;

	public Pessoa() {

	}

	public Pessoa(String nome, String email, String telefone, String senha, String confsenha) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
		this.confsenha = confsenha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() < 3)
			throw new IllegalArgumentException("Nome invalido! Minimo 3 caracteres.");
		else
			this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		if ((senha.length() < 8) || (senha.length() > 16))
			throw new IllegalArgumentException("Senha inválida. Minimo 8 caracteres, maximo 16 caracteres.");
		else
			this.senha = senha;
	}

	public String getConfsenha() {
		return confsenha;
	}

	public void setConfsenha(String confsenha) {
		if ((confsenha.length() < 8) || (confsenha.length() > 16))
			throw new IllegalArgumentException("Senha inválida. Minimo 8 caracteres, maximo 16 caracteres.");
		else
			this.confsenha = confsenha;
	}

	public String toString() {

		return "Nome Completo :" + this.nome + "\n" + "Email: " + this.email + "\n" + "Telefone: " + this.telefone
				+ "\n";
	}

}

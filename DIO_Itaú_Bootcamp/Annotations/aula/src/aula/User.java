package aula;

public class User {
	@Obrigatorio(mensagem = "Tem que ter nome cuiudo")
	String nome;
	
	
	public User (String nome) {
		this.nome = nome;
	}
}

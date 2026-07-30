package entities;

public class Funcionarios {
	private String nome;
	private String id;
	private Double salario;
	public Funcionarios(String id,String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Double getSalario() {
		return salario;
	}
	public void AumentarSalario(Double porcentagem ) {
		this.salario += (salario * (porcentagem / 100));
	}
	public String toString() {
		return "\nId: " + this.id + ", nome: " + this.nome +  ", salário: " + this.salario;
	}
}

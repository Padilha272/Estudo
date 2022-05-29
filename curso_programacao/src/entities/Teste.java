package entities;

public class Teste {

	private String nome;
	private String cpf;
	private int idade;
	
	public Teste(String nome,String cpf,int idade) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		
	}
	
	public void setName(String nome) {
		this.nome = nome;
	}
	
	public String getName() {
		return nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf=cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	
	
	
	
	public String toString() {
		
		return "Nome: "+nome+"\n"+"CPF: "+cpf+"\n"+"Idade: "+idade;
	}
	
	
}

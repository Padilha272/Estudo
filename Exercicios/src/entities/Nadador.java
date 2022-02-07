package entities;

public class Nadador {

	public int idade;
	public String nome;
	public Nadador(int idade, String nome) {
		super();
		this.idade = idade;
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public void classificacao (int idade, String nome) {
		
		if(idade <5) {
			System.out.println(nome+" você não tem idade suficiente para se inscrever");
		}
		
		else if((idade >=5) && (idade <=7)) {
			System.out.println(nome+" Infantil A");
		}
		else if((idade >=8) && (idade <=11)) {
			System.out.println(nome+" Infantil B");
		}
		else if((idade >=12) && (idade <=13)) {
			System.out.println(nome+" Juvenil A");
		}
		else if((idade >=14) && (idade <=17)) {
			System.out.println(nome+" Juvenil B");
		}
		else {
			System.out.println(nome+" Sua classificação é Adulto");
		}
	}
	
	
}

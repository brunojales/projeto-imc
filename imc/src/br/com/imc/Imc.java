package br.com.imc;

public class Imc {
	
	public int genero;
	public double idade;
	public double altura;
	public double peso;
	public double imc;
	public double resultado;
	
	public int genero() {
		return this.genero;
	}
	public double idade() {
		return this.idade;
	}
	public double altura() {
		return this.altura;
	}
	public int peso() {
		return this.peso();
	}
	public double imc() {
		this.imc = this.peso / (this.altura * this.altura);
		return imc;
	}
	public void exibirDados() {
		System.out.println("Genero - 1-Feminino / 2-Masculino: \n" + this.genero);
		System.out.println("Idade: \n" + this.idade);
		System.out.println("Altura: \n" + this.altura);
		System.out.println("Peso: \n" + this.peso+ "\n");
	}

}

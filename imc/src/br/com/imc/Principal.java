package br.com.imc;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Imc pessoa = new Imc();
		Scanner leia = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("#.##");

		int opcao = 0;

		do {

			System.out.println("Informe o gênero (1 - Feminino ou 2 - Masculino):");
			pessoa.genero = leia.nextInt();
			System.out.println("Informe sua idade(anos): ");
			pessoa.idade = leia.nextInt();
			System.out.println("Informe sua altura(m): ");
			pessoa.altura = leia.nextDouble();
			System.out.println("Informe o seu peso atual(Kg): ");
			pessoa.peso = leia.nextDouble();

			
			pessoa.imc = pessoa.imc();
			
			
			pessoa.exibirDados();

			if (pessoa.genero == 1) {
				if (pessoa.imc > 30.0) {
					System.out.println("Você está com Obesidade. Seu IMC é " + f.format(pessoa.imc));
					System.out.println("Obesidade IMC > 30 e Peso > 81.7Kg");
				} else if (pessoa.imc < 30.0 && pessoa.imc >= 24.9) {
					System.out.println("Você está com Sobrepeso. Seu IMC é " + f.format(pessoa.imc));
					System.out.println("Sobrepeso IMC < 30 e >= 24.9 e Peso < 81.7 e >= 67.8Kg");
				} else if (pessoa.imc < 24.9 && pessoa.imc >= 18.5) {
					System.out.println("Seu peso está Normal. Seu IMC é " + f.format(pessoa.imc));
					System.out.println("Peso Nomal IMC < 24.9 e >= 18.5 e Peso < 67.8 e >= 50.4Kg");
				} else if (pessoa.imc < 18.5 && pessoa.imc > 0) {
					System.out.println("Você está com Magreza. Seu IMC é " + f.format(pessoa.imc));
					System.out.println("Magreza IMC < 18.5 e Peso < 50.4Kg");
				} else {
					System.out.println("Desculpa, algo deu errado. Tente Novamente." + f.format(pessoa.imc));
				}
			}
			if (pessoa.genero == 2) {
				if (pessoa.imc > 30.0) {
					System.out.println("Você está com Obesidade. Seu IMC é " + f.format(pessoa.imc));
					System.out.println("Obesidade IMC > 30 e Peso > 106Kg");
				} else if (pessoa.imc < 30.0 && pessoa.imc >= 24.9) {
					System.out.println("Você está com Sobrepeso. Seu IMC é " + f.format(pessoa.imc));
					System.out.println("Sobrepeso IMC < 30 e >= 24.9 e Peso < 106 e >= 88Kg");
				} else if (pessoa.imc < 24.9 && pessoa.imc >= 18.5) {
					System.out.println("Seu peso está Normal. Seu IMC é " + f.format(pessoa.imc));
					System.out.println("Peso Nomal IMC < 24.9 e >= 18.5 e Peso < 88 e >= 65.4Kg");
				} else if (pessoa.imc < 18.5 && pessoa.imc > 0) {
					System.out.println("Você está com Magreza. Seu IMC é " + f.format(pessoa.imc));
					System.out.println("Magreza IMC < 18.5 e Peso < 65.4Kg");
				} else {
					System.out.println("Desculpa, algo deu errado. Tente Novamente." + f.format(pessoa.imc));
				}
			}
			System.out.println("Deseja sair? 1 - SIM / 2 - NÃO");
			opcao = leia.nextInt();
		} while (opcao == 2);
		System.out.println("Programa encerrado. Obrigado!");
	}
}

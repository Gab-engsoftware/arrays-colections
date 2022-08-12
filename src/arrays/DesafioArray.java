package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantas notas você quer informar ?");
		int qtd = scan.nextInt();
		double soma = 0;
		double[] notas = new double[qtd];
		
		for (int i = 0; i < notas.length; i++) {
			
			System.out.println("Informe a " + (i+1) + "º nota:");
			notas[i] = scan.nextDouble();
		}
		
		for(double nota: notas) {
			soma += nota;
		}
		System.out.println("A media é: " + soma/qtd );
	}

}

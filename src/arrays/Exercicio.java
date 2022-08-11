package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		// Instanciando array e definindo tipo e tamanho
		double[] notasAlunoA = new double[3];
		
		// Imprimindo array em branco
		System.out.println(Arrays.toString(notasAlunoA));
		
		// Populando o array 
		notasAlunoA[0] = 7.0;
		notasAlunoA[1] = 8.0;
		notasAlunoA[2] = 6.7;
		
		//Imprimindo array preenchido
		System.out.println(Arrays.toString(notasAlunoA));
		
	

		// Atribuindo ps valores do array na variavel total
		double total= 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		
		// Calculando média do aluno
		System.out.println(total/notasAlunoA.length);
		
		//Instanciando array e atribuindo valores
		double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
		
		//Imprimindo notas por incice do array
		System.out.println(notasAlunoB[0]);
		System.out.println(notasAlunoB[2]);
		
	}

}

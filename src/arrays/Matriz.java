package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		double total = 0;
		double media = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a quantidade de alunos: ");
		int qtdeAlunos = scan.nextInt();

		System.out.println("Informe a quantidade de notas por aluno");
		int qtdeNotas = scan.nextInt();

		double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];

		for (int i = 0; i < notasDaTurma.length; i++) {
			for (int j = 0; j < notasDaTurma[i].length; j++) {
				System.out.printf("Informe a nota %d do aluno %d:", j + 1, i + 1);

				notasDaTurma[i][j] = scan.nextDouble();

				total += notasDaTurma[i][j];
			}
		}
		media = total / (qtdeAlunos * qtdeNotas);
		System.out.println("A média é: " + media);

		for (double[] notasDoAluno : notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
	}
}

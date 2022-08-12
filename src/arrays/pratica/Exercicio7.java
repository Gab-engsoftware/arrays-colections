package arrays.pratica;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		arrayDeInteiros(5);

	}
	
	public static void arrayDeInteiros(int x) {
		Scanner scan = new Scanner(System.in);
		int[] teste = new int[x];
		for (int i = 0; i < teste.length; i++) {
			System.out.println("Informe o " + (i+1) + "º número do array: ");
			teste[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(teste));
	}

}

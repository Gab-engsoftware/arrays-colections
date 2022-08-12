package arrays.pratica;

import java.util.Arrays;

public class Exercicio6 {

	public static void main(String[] args) {
		int[] teste = {50, 10, 500, 3, 100};
		
		numeroMaior(teste);

	}
	public static void numeroMaior(int a[]) {
		int index = 0;
		int numeroMaior = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] > numeroMaior) {
				numeroMaior = a[i];
				index = i;
			}
		}
		System.out.println("O maior elemento é o número: " + numeroMaior + " e está no indice: " + index);
	}

}

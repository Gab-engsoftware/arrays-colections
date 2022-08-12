package arrays.pratica;

import java.util.Arrays;

public class Exercicio8 {

	public static void main(String[] args) {
		int[] teste = {-5, 10, 3, 4, -2, -6};
		
		mudandoNumeros(teste);

	}

	public static void mudandoNumeros(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				a[i] = 1;
			} else {
				a[i] = -1;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}

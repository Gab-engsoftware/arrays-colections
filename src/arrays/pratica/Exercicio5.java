package arrays.pratica;

import java.util.Arrays;

public class Exercicio5 {

	public static void main(String[] args) {
		int[] teste = {5, 2, 3, -1, -4, -6, -7};
		
		numerosPositivos(teste);
	}
	
	public static void numerosPositivos(int a[]) {
		boolean[] b = new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i] > 0) {
					b[i] = true;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

}

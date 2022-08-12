package arrays.pratica;

public class Exercicio4 {

	public static void main(String[] args) {
		int[] teste = {5, 5, 5, 4, 3, 2};
		
		numeroX(teste, 5);
	}

	public static void numeroX(int a[], int x) {
		int contador = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] == x) {
				contador ++;
			}
		}
		System.out.println("O numero " + x + " repete " + contador +" vezes no array");
	}
}

package arrays.pratica;

public class Exercicio3 {

	public static void main(String[] args) {
		int[] teste = {-5, -9, -1, -3, 0};
		
		numerosNegativos(teste);

	}
	
	public static void numerosNegativos(int a[]) {
		int contador= 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] < 0) {
				contador++;
			}
		}
		System.out.println("O array tem " + contador + " números negativos!");
	}
}

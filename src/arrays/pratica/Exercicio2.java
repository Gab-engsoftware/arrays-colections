package arrays.pratica;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio2 {
	/*Escreva um trecho Java que leia 10 valores double do teclado e armazene-os num
array d*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] d = new int[10];
		
		for (int i = 0; i < d.length; i++) {
			System.out.println("Informe o " +(i+1) + "º numero: " );
			d[i] = scan.nextInt();
		}
		
		for(int numero: d) {
			System.out.println(numero);
		}
	}
}

package equalsHashcode;

import java.util.Date;

public class EqualsHashcodePratica {

	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Gabriel";
		u1.email = "gabrielgomes@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Gabriel";
		u2.email = "gabrielgomes@gmail.com";
		
		//Comparando com == (endereço de memória)
		System.out.println(u1 == u2);
		
		//Comparando com equals (Implementado na classe Usuario)
		System.out.println(u1.equals(u2));
		
		
		// Fazendo validação do metodo Equals ( não pode ser feito o Cast de (Usuario) em Date() logo irá retornar false)
		System.out.println(u1.equals(new Date()));
		
	}

}

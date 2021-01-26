
package Pacotejava;

import java.util.Scanner;

public class Exercício5 {
	public static void main(String[] arg) {
	
		Scanner ler = new Scanner (System.in);
		
		int n1,n2,n3,media;
		
		System.out.println("Entre com a primeira nota: ");
		
		 n1 = ler.nextInt();
		 
		 System.out.println("Entre com a segunda nota: ");
			
		 n2 = ler.nextInt();
		 
		 System.out.println("Entre com a terciera nota: ");
			
		 n3 = ler.nextInt();
		 
		 
		 media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
		 
		 System.out.println("Media é: " + media);
		 
		 
	} 
		
	

}

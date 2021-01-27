package Pacotejava;

import java.util.Scanner;

public class Exercício8 {
	public static void main(String [] arg){
		double distribuidor=0,imposto,fabrica,valorTotal;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor de fabrica: ");
		fabrica = ler.nextInt();
		
		imposto = (fabrica*0.45);
		distribuidor = (fabrica*0.28);
		valorTotal = fabrica+imposto+distribuidor;
		
		System.out.println("O valor total é R$: " + valorTotal);
		 
		 
	}
}

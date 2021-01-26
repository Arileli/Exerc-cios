package Pacotejava;

import java.util.Scanner;

public class Exe3 {

	public static void main(String [] arg) {
		int totalSegundos, horas, minutos, segundos;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Me diga os segundos: ");
		totalSegundos = ler.nextInt();
		
		horas = ( totalSegundos/3600);
		minutos = (totalSegundos%3600)/60;
		segundos = (totalSegundos%3600)%60;
		
		System.out.println("O tempo de duração é de:  "+horas+" horas, "+minutos+" minutos e "+segundos+" segundos");
	}
	

}
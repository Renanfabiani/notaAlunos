package Application;
import java.util.Locale;
import java.util.Scanner;

import entities.notas;

public class Alunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		notas notas = new notas();
		
		System.out.println("Qual seu nome ?");
		notas.nome = sc.nextLine();
		System.out.println("Qual sua nota 1?");
		notas.a = sc.nextDouble();
		System.out.println("Qual sua nota 2?");
		notas.b = sc.nextDouble();
		System.out.println("Qual sua nota 3?");
		notas.c = sc.nextDouble();
		
		System.out.printf("Sua nota total é : %.2f%n", notas.totalNota());
		
		if(notas.totalNota()<60.0) {
			System.out.println("Você reprovou");
			System.out.printf("Faltou %.2f pontos%n ", notas.resultado());
		}
		else {
			System.out.println("Você passou!");
	}
		sc.close();
	}
	

}

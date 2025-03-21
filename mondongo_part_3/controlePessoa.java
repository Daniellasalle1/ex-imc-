package mondongo_part_3;

import mondongo_part_2.pessoa;

import java.util.Scanner;

public class controlePessoa {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("digie o ID: ");
		 int id = sc.nextInt();
		 
		 sc.nextLine();
		
		 System.out.println("digie o nome: ");
		 
		 String nome = sc.nextLine();
		 
		 System.out.print("digie o idade: ");
		 int idade = sc.nextInt();
		 
		 System.out.print("digie o peso: ");
		 double peso = sc.nextInt();
		 
		 System.out.print("digie o altura: ");
		 double altura = sc.nextInt();
		 
		 double imc;
		 
		 imc = (altura * altura) / peso;
		 
		 
		 pessoa pessoa = new pessoa(id,nome,idade,peso,altura);
		 
		 pessoa.listarPessoa();
		 
		 
		 if(imc < 18.5) {
			 System.out.print("MAGREZA");
		 }
		 else if(imc > 18.5 && imc <= 24.9) {
			 System.out.print("normal ");
		 }
		 else if(imc > 25 && imc <= 29.9) {
			 System.out.print("sobrepeso ");
		 }
		 else if(imc > 30 && imc <= 34.9) {
			 System.out.print("obesidade 1 ");
		 }
		 else if(imc > 35 && imc <= 39.9) {
			 System.out.print("obesidade 2  ");
		 }
		 else if(imc > 40) {
			 System.out.print("obesidade 3  ");
		 }
		 else {
			 System.out.print("obesidade 999  ");
		 }
		
		
	}
}

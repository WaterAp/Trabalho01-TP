package br.edu.univas;

import java.text.DecimalFormat;
import java.util.Scanner;


public class StartApp {
   
	
	public static void menu() {   // MENU VISIVEL
		
		System.out.println("Menu do programa de calculo da �rea de pol�gonos:\n\n");
		
		
		System.out.println(" 1- quadrado                     ");
		System.out.println(" 2- tri�ngulo                    ");
		System.out.println(" 3- trap�zio                     ");
		System.out.println(" 4- hex�gono                     ");
		System.out.println(" 9- sair                         ");
		System.out.println("Selecione uma op��o: ");
	}
	

   
 public static void main(String[] args) {
	 
	 Scanner input = new Scanner (System.in);
	 DecimalFormat df = new DecimalFormat ("##.##");
	 
	 
	int i = 1;
	do { 
	     int opcao = 0; 
	     double area, base, lado, altura, baseMaior, baseMenor;
		
		menu (); 
		
	 	opcao = input.nextInt ();		
	      // FUN��O DE ESCOLHA
			switch (opcao) {
		  
		     case 1:
		    	
                 System.out.println("Informe o valor da base do quadrado: ");  
		    	 base = input.nextFloat();
		    	 
		    	 System.out.println("Informe o valor da altura do quadrado: "); 
		    	 altura = input.nextFloat ();
		    	 
		    	 area = base * altura;
		    	 
		    	 System.out.println("A �rea do quadrado � igual a: " + df.format(area) + "\n\n");
		    	 
		    	 break;
			
		     case 2:
		    	 
		    	 System.out.println("Digite (1) caso seu tri�ngulo seja equil�tero, e (2) caso n�o.");
		    	 
		    	 int verifTriang;
		    	 
		    	 verifTriang = input.nextInt();
		    	 
		    	 if (verifTriang == 1) {
		    		 
		    		 
		    		 
		    		 System.out.println("Informe o valor do lado do tri�ngulo equil�tero: ");
		    	    lado = input.nextDouble();
                    
		    	    area = (lado * lado * Math.sqrt(3)) / 4;
		    		
		    	    System.out.println("A �rea do tri�ngulo equil�tero � igual a: " + df.format(area) + "\n\n");
		    	    
		    	 } else if (verifTriang == 2) {
		    		 
		    		 
		    		 System.out.println("Informe o valor da altura do tri�ngulo: ");
		    		 altura = input.nextDouble();
		    		 System.out.println("Informe o valor da base do tri�ngulo: ");
		    		 base = input.nextDouble();
		    		 
		    		area = base * altura / 2;
		    		
		    		System.out.println("A �rea do tri�ngulo � igual a: " + df.format(area) + "\n\n");
		    		 
		    		 
		    	 } else {
		    		  System.out.println("Op��o inv�lida, tente novamente");
		    	 }
		    	  
		    	 break;
		     
		     case 3:
		    	
		    	 System.out.println("Informe o valor da base maior do trap�zio: ");
		    	 baseMaior = input.nextDouble();
		    	 System.out.println("Informe o valor da base menor do trap�zio: ");
		    	 baseMenor = input.nextDouble();
		    	 System.out.println("Informe o valor da altura do trapezio: ");
		    	 altura = input.nextDouble();
		    	 
		    	 area = (baseMaior + baseMenor) * altura / 2;
		    	 
		    	 System.out.println("A �rea do trap�zio � igual a: " + df.format(area) + "\n\n");
		    	 
		    	 
		    	 
		    	 
		    	 break;
		    
		     case 4:
		    	
		    	 double a = Math.toRadians(30);
		    	 double b = Math.tan(a);
		    	 
		    	 
		    	 System.out.println("Informe o valor do lado do hex�gono: ");
		    	 lado = input.nextDouble();
		    	 
		    	 area = (6 *(lado * lado)) / (4 * b);
		    	
		    	 
		    	 System.out.println("A �rea do hex�gono � igual a: " + df.format(area) + "\n\n");
		    	 
		    	 
		    	 
		    	 break;	  
		  
		     case 9:
		    	 System.out.println("Fim do programa de calculo de �rea dos pol�gonos, at� mais.");
		    	 ++i;
		    	  break;	  
		
		default :
			System.out.println("Op��o inv�lida, tente novamente"); } 
	
	      } while (i < 2);
		
	input.close();
	}
}


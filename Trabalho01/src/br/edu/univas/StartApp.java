package br.edu.univas;

import java.text.DecimalFormat;
import java.util.Scanner;


public class StartApp {
   
	
	public static void menu() {   // MENU VISIVEL
		
		System.out.println("Menu do programa de calculo da área de polígonos:\n\n");
		
		
		System.out.println(" 1- quadrado                     ");
		System.out.println(" 2- triângulo                    ");
		System.out.println(" 3- trapézio                     ");
		System.out.println(" 4- hexágono                     ");
		System.out.println(" 9- sair                         ");
		System.out.println("Selecione uma opção: ");
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
	      // FUNÇÂO DE ESCOLHA
			switch (opcao) {
		  
		     case 1:
		    	
                 System.out.println("Informe o valor da base do quadrado: ");  
		    	 base = input.nextFloat();
		    	 
		    	 System.out.println("Informe o valor da altura do quadrado: "); 
		    	 altura = input.nextFloat ();
		    	 
		    	 area = base * altura;
		    	 
		    	 System.out.println("A área do quadrado é igual a: " + df.format(area) + "\n\n");
		    	 
		    	 break;
			
		     case 2:
		    	 
		    	 System.out.println("Digite (1) caso seu triângulo seja equilátero, e (2) caso não.");
		    	 
		    	 int verifTriang;
		    	 
		    	 verifTriang = input.nextInt();
		    	 
		    	 if (verifTriang == 1) {
		    		 
		    		 
		    		 
		    		 System.out.println("Informe o valor do lado do triângulo equilátero: ");
		    	    lado = input.nextDouble();
                    
		    	    area = (lado * lado * Math.sqrt(3)) / 4;
		    		
		    	    System.out.println("A área do triângulo equilátero é igual a: " + df.format(area) + "\n\n");
		    	    
		    	 } else if (verifTriang == 2) {
		    		 
		    		 
		    		 System.out.println("Informe o valor da altura do triângulo: ");
		    		 altura = input.nextDouble();
		    		 System.out.println("Informe o valor da base do triângulo: ");
		    		 base = input.nextDouble();
		    		 
		    		area = base * altura / 2;
		    		
		    		System.out.println("A área do triângulo é igual a: " + df.format(area) + "\n\n");
		    		 
		    		 
		    	 } else {
		    		  System.out.println("Opção inválida, tente novamente");
		    	 }
		    	  
		    	 break;
		     
		     case 3:
		    	
		    	 System.out.println("Informe o valor da base maior do trapézio: ");
		    	 baseMaior = input.nextDouble();
		    	 System.out.println("Informe o valor da base menor do trapézio: ");
		    	 baseMenor = input.nextDouble();
		    	 System.out.println("Informe o valor da altura do trapezio: ");
		    	 altura = input.nextDouble();
		    	 
		    	 area = (baseMaior + baseMenor) * altura / 2;
		    	 
		    	 System.out.println("A área do trapézio é igual a: " + df.format(area) + "\n\n");
		    	 
		    	 
		    	 
		    	 
		    	 break;
		    
		     case 4:
		    	
		    	 double a = Math.toRadians(30);
		    	 double b = Math.tan(a);
		    	 
		    	 
		    	 System.out.println("Informe o valor do lado do hexágono: ");
		    	 lado = input.nextDouble();
		    	 
		    	 area = (6 *(lado * lado)) / (4 * b);
		    	
		    	 
		    	 System.out.println("A área do hexágono é igual a: " + df.format(area) + "\n\n");
		    	 
		    	 
		    	 
		    	 break;	  
		  
		     case 9:
		    	 System.out.println("Fim do programa de calculo de área dos polígonos, até mais.");
		    	 ++i;
		    	  break;	  
		
		default :
			System.out.println("Opção inválida, tente novamente"); } 
	
	      } while (i < 2);
		
	input.close();
	}
}


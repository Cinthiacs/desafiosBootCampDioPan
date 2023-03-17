package bootCampBancoPanDio.Algoritimos_intermediarios.Triangulo;
import java.io.IOException;
import java.util.Scanner;

public class triangulo {
 
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
		
		double maior  ;
		double soma = A + B + C;
		boolean triangulo;
		
//TODO: Implemente a condição necessária para o cálculo do triângulo:
//Dica: Você pode utilizar o String.format() na formatação do texto.
		if(A < (B+C) && B < (A+C) && C < (A+B)){
		  
		  System.out.println(String.format("Perimetro = %.1f", soma));
		}else{
		  
		System.out.println(String.format("Area = %.1f", (C*(A + B))/2));
	}
	}
}


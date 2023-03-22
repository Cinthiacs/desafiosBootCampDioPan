package Algoritimos_basicos.src.Fabrica_carros;
import java.util.Scanner;

public class Fabrica_carros {
    public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
        int custoFabrica = scan.nextInt();
	    int porcentagemDistribuidor = scan.nextInt();
	    int PercentualImpostos = scan.nextInt();
      
        int precoFinal = ((custoFabrica* (porcentagemDistribuidor + PercentualImpostos) / 100)+custoFabrica);
      
        
        System.out.println(precoFinal);


	}
}	

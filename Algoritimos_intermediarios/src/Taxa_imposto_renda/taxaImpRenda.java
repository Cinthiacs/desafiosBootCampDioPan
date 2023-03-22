package Algoritimos_intermediarios.src.Taxa_imposto_renda;
import java.io.IOException;
import java.util.Scanner;


public class taxaImpRenda {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
        double imposto;
     
        if(renda >= 0 && renda <= 2000) {
          System.out.println("Isento");
        }
        else if(renda > 2000 && renda <= 3000){
          //System.out.println(String.format("R$ %.2f", (8*(renda))/100 + (renda)));
          System.out.println(String.format("R$ %.2f", (renda - 2000)* 0.08));
        }
        
        else if(renda > 3000 && renda <= 4500){
          //System.out.println(String.format("R$ %.2f", (8*(renda))/100 + (renda)));
          System.out.println(String.format("R$ %.2f", ((renda - 3000) * 0.18)+80));
          
        }
       
        else{
          System.out.println(String.format("R$ %.2f", ((renda - 4500) * 0.28)+350));
    
        }
        
      }
}
// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  



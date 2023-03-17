package bootCampBancoPanDio.Algoritimos_básicos.Desafio_dragao;
import java.util.*;
public class desafioDragão {
    public static void main(String[] args){
        int casos, poderDeLuta;

        Scanner ler = new Scanner(System.in);

        casos = ler.nextInt();

        for(int i = 0; i < casos; i++){
            poderDeLuta = ler.nextInt();

//TODO: Implemente a condição adequada para a impressão dos textos conforme o solicitado no desafio:

            if(poderDeLuta > 8000){
                System.out.println("Mais de 8000!");
            } else {
                System.out.println("Inseto!");
            }
        }
}
}
//A primeira linha contém um número inteiro C relativo ao número de casos de teste. Em seguida, haverá C linhas, com um número inteiro N (100 <= N <= 100000) relativo ao nível de energia de um ser vivo.
/*Saída
Para cada valor lido, imprima o texto correspondente.

 
Exemplo de Entrada	Exemplo de Saída
3
8001
100
200

Mais de 8000!
Inseto!
Inseto!*/
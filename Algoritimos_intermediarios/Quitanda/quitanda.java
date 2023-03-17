package bootCampBancoPanDio.Algoritimos_intermediarios.Quitanda;
import java.util.*;

public class quitanda {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
       int morangos = input.nextInt();
       int macas = input.nextInt();

//TODO: Implemente as condições necessárias para retornar o preço a ser pago pelo cliente, conforme a tabela de preços do seu Zé:
      if(morangos < 5 || macas < 5){
        System.out.println((morangos * 2.5) + (macas * 1.8));
      } 
      else if (morangos >= 4 && macas >= 4){
        //System.out.println ((morangos * 2.5 + macas * 1.8) * 0.1 - ( morangos * 2.5 + macas * 1.8));
          System.out.println ( 10* (morangos * 2.5 + macas * 1.8) /100 * (-1) + (morangos * 2.5 + macas * 1.8));
     
      }else{
       System.out.println("erro");
      }
    
  }
}


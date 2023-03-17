package bootCampBancoPanDio.Algoritimos_intermediarios.Espacos_vogais;
import java.util.Scanner;

public class contaEspVog {

         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String[] strSplit = str.split(" ");
        char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;
        int vCount=0;
        int sCount = 0;
         
        for (int i=0; i < str.length(); i++){
          if (str.charAt(i) == 'a' ||
            str.charAt(i) == 'e' ||
            str.charAt(i) == 'i' ||
            str.charAt(i) == 'o' ||
            str.charAt(i) == 'u'){
            vCount++;
          }
          if (str.charAt(i) == ' '){
            sCount++;
          }
        }
        System.out.println ("Espacos em branco: " + sCount + " Vogais: " + vCount);
    }
     
}

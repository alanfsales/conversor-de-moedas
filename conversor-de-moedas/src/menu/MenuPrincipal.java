package menu;

import java.util.Scanner;
import java.util.SortedMap;

public class MenuPrincipal {

    public static void opcoes(){
        Scanner entrada = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 9){
            System.out.print("""     
                
                 --------------------------------------------------
                 |               CONVERSOR DE MOEDAS              |
                 --------------------------------------------------
                  1) Dólar =>> Peso argentino
                  2) Peso argentino =>> Dólar
                  3) Dólar =>> Real brasileiro
                  4) Real brasileiro =>> Dólar
                  5) Dólar =>> Peso colombiano
                  6) Peso colombiano =>> Dólar 
                  7) Real brasileiro =>> Euro
                  8) Euro =>> Real brasileiro
                  9) Sarir
                  --------------------------------------------------
                  |  Escolha uma opção válida.                     |
                  --------------------------------------------------                               
                """);
            System.out.print("Opção: ");
            opcao = entrada.nextInt();

        }
    }
}

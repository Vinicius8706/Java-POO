package structure;

import java.util.Scanner;


public class exercicio03 {
  public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);

    int type = sc.nextInt();
    
    int somaAlcool = 0;
    int somaDiesel = 0 ;
    int somaGasolina = 0;
    while(type != 4) {

        if(type ==3){
          somaAlcool += somaAlcool +  1;

        }


        else if(type ==2) {
          somaGasolina += somaGasolina + 1;
          
        }
          
        else if(type ==3){
          somaDiesel += somaDiesel + 1;

        }
        type = sc.nextInt();
        
      }
      System.out.println("MUITO OBRIGADO");

      System.out.println("Alcool:" + somaAlcool);
      System.out.println("Gasolina: " + somaGasolina);
      System.out.println("Diesel: " + somaDiesel);
      sc.close();

      
  }
      

}

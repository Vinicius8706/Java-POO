package src;
import java.util.Scanner;

public class exercicio05 {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int code1,code2,np1,np2 ;
    float peca2,peca1,soma;

    code1 = sc.nextInt();
    np1 = sc.nextInt();
    peca1 = sc.nextFloat();
    code2 = sc.nextInt();
    np2 = sc.nextInt();
    peca2 = sc.nextFloat();

    soma = (np1 * peca1)  + (np2 * peca2);

    System.out.printf("VALOR A PAGAR: " + soma );
    
    sc.close();


  }
  

}

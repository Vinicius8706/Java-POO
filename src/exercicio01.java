package src;

import java.util.Scanner;


public class exercicio01 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a;
    int b;
    int soma;


    a = sc.nextInt();
    b = sc.nextInt();
    soma = a + b;

    System.out.printf("A soma de a "+ a +"e b ", b, "é "+ soma);
    
    sc.close();






  }

  
}

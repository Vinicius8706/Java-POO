package src;

import java.io.PrintStream;
import java.util.Scanner;


public class execicio03 {
  
  private static PrintStream printf;

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    int a,b,c,d, diferenca;

    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = sc.nextInt();


    diferenca = (a * b - c * d);

    printf = System.out.printf("Diferença=  " + diferenca);

    sc.close();
  }
}

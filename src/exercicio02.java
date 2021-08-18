package src;


import java.util.Scanner;

public class exercicio02 {
  
  public static void main(String argv[], int i) {

    Scanner sc = new Scanner(System.in);

    
    double  raio;
    double pi;
    double area;

    raio = sc.nextDouble();
    pi = 3.14159;

    area = pi * raio * raio;

    System.out.printf("A=%.4f%n", area);

    sc.close();
  }

  
}

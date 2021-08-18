package src;
import java.util.Scanner;

public class exercicio06 {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    double A,B,C,triangle, rectangle, quadrado, trapezio,circle;

    A = sc.nextDouble();
    B = sc.nextDouble();
    C = sc.nextDouble();

    triangle = (A * C)/ 2;
    quadrado = (Math.pow(A, 2));
    trapezio = (A + B)*C/2;
    rectangle = (A * C);
    circle = (C * C) * 3.14159;

    System.out.printf("TRIANGULO: %.3f%n" + triangle + "\nCIRCULO: %.3f%n" + circle + "\nTRAPEZIO: %.3f%n" + trapezio + "\nQUADRADO:%.3f%n " + quadrado + "\nRETANGULO: %.3f%n " + rectangle);
    
    sc.close();


  }
  

}

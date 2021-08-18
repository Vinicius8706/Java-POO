package src;
import java.util.Scanner;

public class exercicio04 {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    double salaryperhour, salary;

    int number, hours;

    number = sc.nextInt();
    hours = sc.nextInt();
    salaryperhour = sc.nextDouble();

    salary = hours * salaryperhour;

    System.out.printf("NUMBER = " + number + " \nSALARY= U$ " + salary);

    sc.close();


  }
  

}

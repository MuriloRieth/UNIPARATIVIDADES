import java.util.Scanner;

public class AT3 {

    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

       int num1;
       int num2;

        System.out.println("Informe um valor ");
        num1 = scanner.nextInt();

        System.out.println("Informe outro valor ");
        num2 = scanner.nextInt();

        if(num1 > num2) {
        System.out.println("O primeiro numero: "+ num1 + " eh o maior");
        }else{ 
         System.out.println("O segundo numero: "+ num2 + " eh o maior");
        }

        scanner.close();

    }
 }

   import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    int num = 0;



        System.out.println("Informe um numero ");
        num = scanner.nextInt();




        if(num % 2 == 0){
            System.out.println("numero par");
             }
        else{ System.out.println("numero impar");

        }
        scanner.close();
    }
    }

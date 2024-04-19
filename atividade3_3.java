 import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nota = 0;
        int nota2 = 0;


        System.out.println("Informe a primeira nota ");
        nota = scanner.nextInt();
        System.out.println("Informe a segunda nota ");
        nota2 = scanner.nextInt();




        double valornota = (nota + nota2 )/2;

        System.out.println("O valor da nota final eh " + valornota);

        scanner.close();
    }
    }

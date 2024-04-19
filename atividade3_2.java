  import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valor = 0;
        int valor2 = 0;


        System.out.println("Informe o primeiro valor ");
        valor = scanner.nextInt();
        System.out.println("Informe o segundo valor ");
        valor2 = scanner.nextInt();




        double valorsub = valor - valor2;

        System.out.println("O valor da subtracao eh " + valorsub);

        scanner.close();
    }
    }

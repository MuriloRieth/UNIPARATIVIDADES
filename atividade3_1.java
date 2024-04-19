   import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valor = 0;
        int valor2 = 0;
        int valor3 = 0;
        int valorCotacao = 0;

        System.out.println("Informe o primeiro valor ");
        valor = scanner.nextInt();
        System.out.println("Informe o segundo valor ");
        valor2 = scanner.nextInt();
        System.out.println("Informe o terceiro valor ");
        valor3 = scanner.nextInt();




        double valorsoma = valor + valor2 + valor3;

        System.out.println("O valor da soma eh " + valorsoma);

        scanner.close();
    }

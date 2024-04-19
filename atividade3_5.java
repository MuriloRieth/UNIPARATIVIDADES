  import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nota = 0;
        int nota2 = 0;


        System.out.println("Informe a primeira nota ");
        nota = scanner.nextInt();
        System.out.println("Informe a segunda nota2 ");
        nota2 = scanner.nextInt();




        double valorsoma = (nota + nota2);
        double valorsub = (nota - nota2);
        double valordiv = (nota / nota2);
        double valormul = (nota * nota2);
        System.out.println("O valor da soma eh " + valorsoma); 
        System.out.println("O valor da subtracao eh " + valorsub);
        System.out.println("O valor da divisa eh " + valordiv);
        System.out.println("O valor da multiplicacao eh " + valormul);
        scanner.close();
    }
    }

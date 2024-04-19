  import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nota = 0;
        int nota2 = 0;
        int nota3 = 0;
        int nota4 = 0;

        System.out.println("Informe a primeira nota ");
        nota = scanner.nextInt();
        System.out.println("Informe a segunda nota2 ");
        nota2 = scanner.nextInt();
      System.out.println("Informe a primeira nota 3 ");
        nota3 = scanner.nextInt();
        System.out.println("Informe a segunda nota 4 ");
        nota4 = scanner.nextInt();




        double valornota = (nota + nota2 + nota3 + nota4 )/4;

        if(valornota >= 6){
            System.out.println("voce foi APROVADO com media = " + valornota);
             }
        else{ System.out.println("voce foi REPROVADO com media = " + valornota);

        }
        scanner.close();
    }
    }

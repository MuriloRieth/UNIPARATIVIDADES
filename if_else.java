
        import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    int idade = 0;



        System.out.println("Informe a sua idade ");
        idade = scanner.nextInt();




        if(idade >= 18){
            System.out.println("voce eh maior de idade = " + idade);
             }
        else{ System.out.println("voce eh menor de idade = " + idade);

        }
        scanner.close();
    }
    }

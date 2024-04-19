import java.util.Scanner;

 class Atividade_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Patinhos da XUXA");
        System.out.println("----------------");
        System.out.print("Digite o número de patinhos: ");
        int patinhos = scanner.nextInt();

        for (int i = patinhos; i > 0; i--) {
            System.out.println(i + " patinho(s) foram passear. Além das montanhas para brincar a " +
                    "mamãe gritou: Quá, Quá, Quá, Quá mas só " + (i-1) + " voltaram de lá");
        }
        System.out.println(" ");
        System.out.println("A mamãe patinha foi procurar. Além das montanhas. Na beira do mar. " +
                "A mamãe gritou: " + "Quá, quá, quá, quá. E os " + patinhos +  " patinhos voltaram de lá." );
    }

}

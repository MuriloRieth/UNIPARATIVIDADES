import java.util.Scanner;

 class ATIVIDADE_4 {
    public static void main(String[] args) {
        int entre0a100 = 0;
        int entre101a200 = 0;
        int maiores200 = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 21; i++) {
            System.out.print("Digite seu " + i + "º número: ");
            int numero = scanner.nextInt();
            if (numero >= 0 && numero <=100) {
                entre0a100++;
            } else if (numero >= 101 && numero <= 200) {
                entre101a200++;
            } else {
                maiores200++;
            }
        }
        System.out.println("A quantidade de números entre 0 e 100 é: " + entre0a100);
        System.out.println("A quantidade de números entre 101 e 200 é: " + entre101a200);
        System.out.println("A quantidade de números maiores que 200 é: " + maiores200);
    }
}

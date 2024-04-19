import java.util.Scanner;

 class Atividade_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade em anos: ");
        int idadeAnos = scanner.nextInt();
        System.out.print("Digite a idade em meses: ");
        int idadeMeses = scanner.nextInt();
        System.out.print("Digite a idade em dias: ");
        int idadeDias = scanner.nextInt();

        int SomaDeDias = idadeAnos * 365 + idadeMeses * 30 + idadeDias;

        System.out.println("Você tem: " + idadeAnos + " anos, " + idadeMeses + " meses, " + idadeDias + " dias " +
                " = " + SomaDeDias + " 10dias!"  );

    }
}

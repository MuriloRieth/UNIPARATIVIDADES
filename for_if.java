class Atividade1 {
    public static void main(String[] args) {
        for (int i = 1; i < 51; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.print(i);
                System.out.println(" FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print(i);
                System.out.println(" Fizz ");
            } else if (i % 5 == 0) {
                System.out.print(i);
                System.out.println(" Buzz ");
            } else {
                System.out.println(i);
            }
        }
    }
}

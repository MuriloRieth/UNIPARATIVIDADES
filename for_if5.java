public class Carro {

    String cor;
    String placa;
    int porta;
    String motor;
    int pneu;
    double gasolina;

}

public class exercicio_2 {

    public static void main(String[] args) {

        Carro car = new Carro();
        car.cor="Azul";
        car.motor="13cv";
        car.gasolina= 15;
        car.pneu=4;
        car.porta=4;
        car.placa="IXB4B28";

        System.out.println(car.cor);
        System.out.println(car.placa);

    }

}

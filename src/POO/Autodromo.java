package POO;

public class Autodromo {

    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("458262");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("48464626");
        z400.ligar();

        Veiculo coringa = new Carro();
        coringa.ligar();

    }
        
}

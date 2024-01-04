package POO;

//extends é a Herança onde temos uma classe genérica Veículo que fornece o que precisamos aqui
//o private nos 2 métodos é o encapsulamento onde escondemos esses métodos para que a chamada 
//lá na Classe Autodromo não os veja pq não é necessário, eles já são chamados no metodo ligar.
public class Carro extends Veiculo {

    @Override
    public void ligar() {
        checarGasolina();
        checarCambio();
        System.out.println("Carro ligado");
    }

    private void checarGasolina(){
        System.out.println("verificando gasolina");
    } 

    private void checarCambio(){
        System.out.println("verificando cambio na posição P");
    }
    
}

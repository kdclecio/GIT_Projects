package POO;

//abstrac aqui é a abstração, na classe e no método, representa uma abstração genérica e quem quiser 
//usar essa abstração vai ter que usar os metodos abstratos também, ou seja quem extender essa classe
public abstract class Veiculo {

    public abstract void ligar();

    private String chassi;

    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

}

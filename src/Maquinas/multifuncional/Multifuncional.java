package Maquinas.multifuncional;

import Maquinas.copiadora.Copiadora;
import Maquinas.digitalizadora.Digitalizadora;
import Maquinas.impressora.Impressora;

public class Multifuncional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void imprimir() {
        System.out.println("imprimindo via multifuncional");
    }

    @Override
    public void digitalizar() {
         System.out.println("digitalizando via multifuncional");
    }

    @Override
    public void copiar() {
         System.out.println("copiando via multifuncional");
    }
    
}

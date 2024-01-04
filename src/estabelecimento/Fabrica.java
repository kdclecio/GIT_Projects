package estabelecimento;

import Maquinas.digitalizadora.Digitalizadora;
import Maquinas.impressora.Deskjet;
import Maquinas.impressora.Impressora;
import Maquinas.multifuncional.Multifuncional;

public class Fabrica {
    public static void main(String[] args) {
        
        Multifuncional multifuncional = new Multifuncional();
        multifuncional.copiar();
        multifuncional.imprimir();
        multifuncional.digitalizar();
    
        Impressora impressora = multifuncional;
        impressora.imprimir();
    }
}

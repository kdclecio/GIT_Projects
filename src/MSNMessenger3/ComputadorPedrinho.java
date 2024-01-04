package MSNMessenger3;

import java.util.function.ToLongBiFunction;

import MSNMessenger3Apps.Facebook;
import MSNMessenger3Apps.MSN;
import MSNMessenger3Apps.ServicoMensagem;
import MSNMessenger3Apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        
       ServicoMensagem smi = null;

        String appEscolhido = "Facebook";

        if(appEscolhido == "Facebook"){
            smi = new  Facebook();
        } else if(appEscolhido == "MSN"){
            smi = new MSN();
        } else if(appEscolhido == "Telegram"){
            smi = new Telegram();
        }

        //smi.validarConexaoInternet();

        smi.enviarMensagem();
        smi.recebendoMensagem();

        

    }

    
}

package MSNMessenger;

public class CoputadorPedrinho {
 
    public static void main(String[] args) {
        MSN msn = new MSN();
        msn.enviarMensagem();

        Facebook facebook = new Facebook();
        facebook.recebendoMensagem();

        Telegram telegram = new  Telegram();
        //telegram.verificarConexaoInternet();
        //telegram.salvarHistorico();

    }
    
}

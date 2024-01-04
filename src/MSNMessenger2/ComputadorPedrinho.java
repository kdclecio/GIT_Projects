package MSNMessenger2;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        
        Facebook facebook = new Facebook();
        facebook.enviarMensagem();
        facebook.recebendoMensagem();

        MSN msn = new MSN();
        msn.enviarMensagem();
        msn.recebendoMensagem();

        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.recebendoMensagem();

    }
    
}

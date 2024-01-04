package MSNMessenger3Apps;

public class Telegram extends ServicoMensagem{

    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        // TODO Auto-generated method stub
        System.out.println("Enviando mensagem pelo Telegram");
    }

    @Override
    public void recebendoMensagem() {
        // TODO Auto-generated method stub
        System.out.println("Recebendo mensagem pelo Telegram");
    }
    
    
}

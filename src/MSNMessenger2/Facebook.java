package MSNMessenger2;

public class Facebook extends ServicoMensagem{

    @Override
    public void enviarMensagem() {
       System.out.println("Enviando mensagem pelo Facebook");
    }

    @Override
    public void recebendoMensagem() {
        // TODO Auto-generated method stub
        System.out.println("Recebendo mensagem pelo Facebook");
    }
    
}

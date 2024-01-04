package MSNMessenger3Apps;

public class Facebook extends ServicoMensagem{

    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        // TODO Auto-generated method stub
        System.out.println("Enviando mensagem pelo Facebook");
    }

    @Override
    public void recebendoMensagem() {
        // TODO Auto-generated method stub
        System.out.println("Recebendo mensagem pelo Facebook");
        salvarHistoricoMensagem();
    }
    
}

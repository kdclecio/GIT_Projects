package MSNMessenger3Apps;

public class MSN extends ServicoMensagem {

    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        // TODO Auto-generated method stub
        System.out.println("Enviando mensagem pelo MSN");
    }

    @Override
    public void recebendoMensagem() {
        // TODO Auto-generated method stub
        System.out.println("Recebendo mensagem pelo MSN");
    }
    
}

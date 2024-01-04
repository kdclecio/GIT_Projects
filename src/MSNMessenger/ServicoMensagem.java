package MSNMessenger;

public class ServicoMensagem {
    public void enviarMensagem(){
        verificarConexaoInternet();
        System.out.println("enviando mensagem");
    }
    public void recebendoMensagem(){
        System.out.println("recebendo mensagem");
        salvarHistorico();
    }
    private void verificarConexaoInternet(){
        System.out.println("verificando conexão com a internet");
    }
    private void salvarHistorico(){
        System.out.println("salvando histórico de mensagem");
    }

}

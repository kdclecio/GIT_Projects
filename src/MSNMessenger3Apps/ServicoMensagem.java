package MSNMessenger3Apps;

//Projeto MSN com abstração e com polimorfismo
public abstract class ServicoMensagem {

    public abstract void enviarMensagem();
    public abstract void recebendoMensagem();

    protected void validarConexaoInternet(){
        System.out.println("Validando conexão com a internet");
    }

    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando historico de mensagens");
    }
    
}

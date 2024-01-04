package DiagarmacaoUMLIphone;

public class Funcionalidades implements reprodutorMusical, Navegador, CorreioVoz {

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica() {
       System.out.println("selecionando música...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("exibindo página...");
    }

    @Override
    public void adicionarPagina() {
         System.out.println("adicionando página...");
    }

    @Override
    public void atualizarPagina() {
         System.out.println("atualizando página...");
    }

    @Override
    public void ligar() {
         System.out.println("ligando...");
    }

    @Override
    public void atender() {
         System.out.println("atendendo telefone...");
    }

    @Override
    public void iniciarCorreioVoz() {
         System.out.println("iniciando correio de voz...");
    }

     
}

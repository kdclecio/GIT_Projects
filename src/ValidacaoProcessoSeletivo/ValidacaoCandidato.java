package ValidacaoProcessoSeletivo;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ValidacaoCandidato {
    public static void main(String[] args) {
        
        ValidacaoCandidato validar = new ValidacaoCandidato();
        ArrayList<String> valida = validar.analisarCandidato();
        
        ligarParaCandidato(valida);
    }

    public ArrayList<String> analisarCandidato(){

        String [] candidatos = {"A", "B","C","D","E","F","G"};
        
        int salarioBase = 2000;
        ArrayList<String> candidatosSelecionados = new ArrayList<>();

        for(String candidato : candidatos){
            double salarioPretendido = valorAleatorio();
            String mensagem = String.format("%s solicitou %.2f", candidato, salarioPretendido);
            if(salarioPretendido > salarioBase){
                System.out.println( mensagem +  " aguardando resposta dos demais candidatos");
            } else if (salarioPretendido == salarioBase) {
                System.out.println( mensagem + " ligar para candidato com contraproposta");
            } else {
                System.out.println( mensagem + " e foi selecionado para a vaga");
                candidatosSelecionados.add(candidato);
            }
        }

        System.out.println("total candidato selecionados: " + candidatosSelecionados.size());
        System.out.println("Candidatos Selecionados: " + candidatosSelecionados);

        return candidatosSelecionados;
    }

    static void ligarParaCandidato(ArrayList<String> candidatosSelecionados){

        for(String candidato : candidatosSelecionados){

            int totalLigacoes = 1;
            boolean continuarLigando;

            do{
                continuarLigando = resultadoLigacao();
                if(continuarLigando){
                    totalLigacoes++;
                } else {
                    System.out.println(candidato + " nos atendeu!");
                }
            } while(continuarLigando && totalLigacoes < 3);

            System.out.println(!continuarLigando ? candidato + " nos atendeu na " + totalLigacoes + "° tentativa" : "Ligamos para " + candidato + " " + totalLigacoes + " vezes, mas ele não nos atendeu");
        }

    }

    static boolean resultadoLigacao(){
        return ThreadLocalRandom.current().nextInt(3)==1;
    }

    static int valorAleatorio(){
        return ThreadLocalRandom.current().nextInt(1800,2250);
    }
}


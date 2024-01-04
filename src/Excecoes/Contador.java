package Excecoes;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int param1 = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int param2 = scanner.nextInt();

        try{
            contar(param1, param2);
        } catch(ParametrosInvalidosException g){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    public static void contar(int param1, int param2) throws ParametrosInvalidosException{
            if(param1 > param2){
                throw new ParametrosInvalidosException();
            }

            int contagem = param2 - param1;
            System.out.println("diferença: " + contagem);
            for(int i =1; i <= contagem; i++){
                System.out.println("contador: " + i);
            }
        }
}

package br.com.study.TabelaFipe.principal;

import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    public void exibeMenu() {
        var menu = """
                *** OPÇÕES ***
                Carro
                Moto
                Caminhão
                
                Digite uma das opções para consultar: 
                """;

        System.out.println(menu);
        var opcao = leitura.nextLine();
    }
}

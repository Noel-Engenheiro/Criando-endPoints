package ViewLinkeTinder;

import ControllerLinkeTinder.ControllerTabelaDeVagas;
import ModelLinkeTinder.TabelaDeVagasDAO;

import java.util.Scanner;

public class InputTabelaDeVagas {
    static Scanner teclado = new Scanner(System.in);

    static void inserir_Vagas_Na_Tabela() {
        System.out.println("Informe o código da vaga : ");
        int codigo_vaga = teclado.nextInt();
        System.out.println("Informe o nome da vaga  : ");
        teclado.nextLine();
        String nome_vaga = teclado.nextLine();
        System.out.println("Informe a descrição da vaga : ");
        String descricao_vaga = teclado.nextLine();
        System.out.println("Informe as competências exigidas : ");
        String competencia_vaga = teclado.nextLine();
        System.out.println("Informe o local da vaga : ");
        String local_vaga = teclado.nextLine();

        ControllerTabelaDeVagas.inserir_Vagas_Na_Tabela(codigo_vaga, nome_vaga, descricao_vaga, competencia_vaga, local_vaga);
    }

    static void atualizar_Vagas_Da_Tabela() {
        System.out.println("Informe o código do candidato");
        int codigo_vaga = teclado.nextInt();

        ControllerTabelaDeVagas.atualizar_Vagas_Da_Tabela(codigo_vaga);
    }

    static void deletar_Vagas_Da_Tabela() {
        System.out.println("Código da vaga : ");
        int codigo_vaga = teclado.nextInt();

        ControllerTabelaDeVagas.deletar_Vagas_Da_Tabela(codigo_vaga);
    }
}
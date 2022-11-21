package ViewLinkeTinder;

import ControllerLinkeTinder.ControllerCompetencia;

import java.sql.SQLException;
import java.util.Scanner;

public class InputCompetencia {
    static Scanner teclado = new Scanner(System.in);

    static void inserir_Competencia_Candidato() {

        System.out.println("Informe o código da competência do Candidato : ");
        int cod_competencia_candidato = teclado.nextInt();
        System.out.println("Informe a descrição da competência do Candidato  : ");
        teclado.nextLine();
        String descricao = teclado.nextLine();

        ControllerCompetencia.inserir_Competencia_Candidato(cod_competencia_candidato, descricao);
    }

    static void atualizar_Competencia_Candidato() throws SQLException {
        System.out.println("Informe o código da competência");
        int codigo_competencia_candidato = teclado.nextInt();
        System.out.println("Informe a competência do Candidato  : ");
        teclado.nextLine();
        String descricao = teclado.nextLine();

        ControllerCompetencia.atualizar_Competencia_Candidato(codigo_competencia_candidato, descricao);
    }

    static void deletar_Competencia_Candidato() {
        System.out.println("Código da competência : ");
        int codigo_competencia_candidato = teclado.nextInt();

        ControllerCompetencia.deletar_Competencia_Candidato(codigo_competencia_candidato);
    }
}
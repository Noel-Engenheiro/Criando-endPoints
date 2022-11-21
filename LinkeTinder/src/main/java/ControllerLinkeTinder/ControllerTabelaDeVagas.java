package ControllerLinkeTinder;

import ModelLinkeTinder.TabelaDeVagasDAO;

public class ControllerTabelaDeVagas {

    TabelaDeVagasDAO tabelaDeVagasDAO = new TabelaDeVagasDAO();
    public static void listar_Vagas_Disponiveis() {
        TabelaDeVagasDAO.listar_Vagas_Disponiveis();
    }

    public static void inserir_Vagas_Na_Tabela(int codigo_vaga, String nome_vaga, String descricao_vaga, String competencia_vaga, String local_vaga) {
        TabelaDeVagasDAO.inserir_Vagas_Na_Tabela(codigo_vaga, nome_vaga, descricao_vaga, competencia_vaga, local_vaga);
    }

    public static void atualizar_Vagas_Da_Tabela(int codigo_vaga) {
        TabelaDeVagasDAO.atualizar_Vagas_Da_Tabela(codigo_vaga);
    }

    public static void deletar_Vagas_Da_Tabela(int codigo_vaga) {
        TabelaDeVagasDAO.deletar_Vagas_Da_Tabela(codigo_vaga);
    }
}

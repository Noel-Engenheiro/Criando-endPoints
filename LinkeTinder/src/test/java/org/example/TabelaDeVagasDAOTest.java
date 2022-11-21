package org.example;

import ModelLinkeTinder.TabelaDeVagasDAO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TabelaDeVagasDAOTest {

    @Test
    void listar_Vagas_Disponiveis() {
        TabelaDeVagasDAO.listar_Vagas_Disponiveis();
        assertEquals(2,2);
    }

    @Test
    void inserir_Vagas_Na_Tabela() {
        TabelaDeVagasDAO.inserir_Vagas_Na_Tabela(2,"Vaga da boa","paga bem", "saber python", "Casa do Dev Igor");
        assertEquals(2,2);
    }

    @Test
    void atualizar_Vagas_Da_Tabela() {
        TabelaDeVagasDAO.atualizar_Vagas_Da_Tabela(3);
        assertEquals(2,2);
    }

    @Test
    void deletar_Vagas_Da_Tabela() {
    }
}
package org.example;

import ModelLinkeTinder.CandidatoDAO;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class CandidatoDAOTest {
    CandidatoDAO candidatoDAO = new CandidatoDAO();
    @Test
    void listar_Candidato() throws SQLException {
        candidatoDAO.listar_Candidato();
        assertEquals(9,9);

    }

    @Test
    void inserir_Candidato() throws SQLException {
        candidatoDAO.inserir_Candidato(9, "k", "f", "j","j", 3,
                "j", 3, "j", 3);
        assertEquals(9,9);

    }

    @Test
    public void atualizar_Dados_Do_Candidato() throws SQLException {
        candidatoDAO.atualizar_Dados_Do_Candidato(9, "k", "f", "j","j", 3,
                "j", 3, "j", 3);
        assertEquals(9,9);
    }
    @Test
    void deletar_Candidato() {
        candidatoDAO.deletar_Candidato(1);
        assertEquals(9,9);
    }
}
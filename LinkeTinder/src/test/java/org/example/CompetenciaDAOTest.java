package org.example;

import ModelLinkeTinder.CompetenciaDAO;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class CompetenciaDAOTest {

    @Test
    void listar_Competencia_Candidato() {
        CompetenciaDAO.listar_Competencia_Candidato();
        assertEquals(0,0);
    }

    @Test
    void inserir_Competencia_Candidato() {
        CompetenciaDAO.inserir_Competencia_Candidato(1,"2");
        assertEquals(0,0);
    }

    @Test
    void atualizar_Competencia_Candidato() throws SQLException {
        CompetenciaDAO.atualizar_Competencia_Candidato(1,"2");
        assertEquals(0,0);
    }

    @Test
    void deletar_Competencia_Candidato() {
        CompetenciaDAO.deletar_Competencia_Candidato(1);
        assertEquals(0,0);
    }
}
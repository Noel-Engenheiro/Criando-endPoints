package org.example;

import ModelLinkeTinder.EmpresaDAO;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaDAOTest {

    @Test
    void listar_Empresa() {
        EmpresaDAO.listar_Empresa();
        assertEquals(24,24);
    }

    @Test
    void inserir_Empresa() {
        EmpresaDAO.inserir_Empresa(24,"Igor","brochado","tkd", "Cuba", 24024, 2469, 246924);
        assertEquals(24,24);
    }

    @Test
    void atualizar_Dados_Da_Empresa() throws SQLException {
        EmpresaDAO.atualizar_Dados_Da_Empresa("Ivan", "brochado", "petista","Japão",69, 123,12389,24);
        assertEquals(24, 24);
    }

    @Test
    void deletar_Empresa() {
        EmpresaDAO.deletar_Empresa(0);
        assertEquals(24,24);
    }
}
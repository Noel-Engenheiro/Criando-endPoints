package ControllerLinkeTinder;

import ModelLinkeTinder.CompetenciaDAO;

import java.sql.SQLException;

public class ControllerCompetencia {    
     static CompetenciaDAO competenciaDAO = new CompetenciaDAO();
    public static void listar_Competencia_Candidato(){
        competenciaDAO.listar_Competencia_Candidato();
    }
    public static void inserir_Competencia_Candidato(int cod_competencia_candidato, String descricao) {
        competenciaDAO.inserir_Competencia_Candidato(cod_competencia_candidato, descricao);
    }
    public static void atualizar_Competencia_Candidato(int codigo_competencia_candidato, String descricao) throws SQLException {
        competenciaDAO.atualizar_Competencia_Candidato(codigo_competencia_candidato, descricao);
    }
    public static void deletar_Competencia_Candidato(int codigo_competencia_candidato) {
        competenciaDAO. deletar_Competencia_Candidato(codigo_competencia_candidato);
    }
}

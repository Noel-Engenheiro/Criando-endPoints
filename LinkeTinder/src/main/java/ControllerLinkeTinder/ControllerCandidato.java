package ControllerLinkeTinder;


import ModelLinkeTinder.CandidatoDAO;

import java.sql.SQLException;

public class ControllerCandidato {
    static CandidatoDAO candidatoDAO = new CandidatoDAO();

    public static void listar_Candidato() {
        candidatoDAO.listar_Candidato();
    }
    public static void inserir_Candidato(int codigo_candidato, String nome, String sobrenome, String data_de_nascimento, String e_mail, int cpf, String pais, int cep, String descricao_pessoal, int senha) {
        candidatoDAO.inserir_Candidato(codigo_candidato, nome, sobrenome, data_de_nascimento, e_mail,cpf, pais, cep, descricao_pessoal, senha);
    }

    public static void atualizar_Dados_Do_Candidato(int codigo_candidato, String nome, String sobrenome, String data_de_nascimento, String e_mail, int cpf, String pais, int cep, String descricao_pessoal, int senha) throws SQLException {
        candidatoDAO.atualizar_Dados_Do_Candidato(codigo_candidato, nome, sobrenome, data_de_nascimento, e_mail, cpf, pais, cep, descricao_pessoal, senha);
    }
    public static void deletar_Candidato(int codigo_candidato){
        candidatoDAO.deletar_Candidato(codigo_candidato);
    }
}
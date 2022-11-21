package ControllerLinkeTinder;

import ModelLinkeTinder.EmpresaDAO;

import java.sql.SQLException;

public class ControllerEmpresa {
    static EmpresaDAO empresaDAO = new EmpresaDAO();

    public static void listar_Empresa(){
        empresaDAO.listar_Empresa();
    }

    public static void inserir_Empresa(int codigo_empresa, String nome, String e_mail, String descricao_pessoal, String pais_empresa, int cep, int senha, int cnpj) {
        empresaDAO.inserir_Empresa(codigo_empresa, nome, e_mail, descricao_pessoal, pais_empresa, cep, senha, cnpj);
    }
    public static void atualizar_Dados_Da_Empresa(String nome, String e_mail, String descricao_pessoal, String pais_empresa, int cep, int senha, int cnpj, int codigo_empresa) throws SQLException {
        empresaDAO.atualizar_Dados_Da_Empresa(nome, e_mail, descricao_pessoal, pais_empresa, cep, senha, cnpj, codigo_empresa);
    }
    public static void deletar_Empresa(int codigo_empresa) {
        empresaDAO.deletar_Empresa(codigo_empresa);
    }
}

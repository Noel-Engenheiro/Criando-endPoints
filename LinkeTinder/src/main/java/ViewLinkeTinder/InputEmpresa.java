package ViewLinkeTinder;

import ControllerLinkeTinder.ControllerEmpresa;

import java.sql.SQLException;
import java.util.Scanner;

public class InputEmpresa {
    static Scanner teclado = new Scanner(System.in);

    static void inserir_Empresa() {

        System.out.println("Informe o código da empresa : ");
        int codigo_empresa = teclado.nextInt();
        System.out.println("Informe o nome da empresa : ");
        teclado.nextLine();
        String nome = teclado.nextLine();
        System.out.println("Informe o e-mail da empresa : ");
        String e_mail = teclado.nextLine();
        System.out.println("Desrição pessoal esperada pela empresa : ");
        String descricao_pessoal = teclado.nextLine();
        System.out.println("Informe o país da empresa : ");
        String pais_empresa = teclado.nextLine();
        System.out.println("Informe o cep da empresa : ");
        int cep = teclado.nextInt();
        System.out.println("Informe a senha : ");
        int senha = teclado.nextInt();
        System.out.println("Informe o cnpj da empresa : ");
        int cnpj = teclado.nextInt();

        ControllerEmpresa.inserir_Empresa(codigo_empresa, nome, e_mail, descricao_pessoal, pais_empresa, cep, senha, cnpj);
    }

    static void atualizar_Dados_Da_Empresa() throws SQLException {
        System.out.println(" Informe o código da empresa ");
        int codigo_empresa = teclado.nextInt();
        System.out.println("Informe o nome da empresa : ");
        teclado.nextLine();
        String nome = teclado.nextLine();
        System.out.println("Informe o e-mail da empresa : ");
        String e_mail = teclado.nextLine();
        System.out.println("Desrição pessoal esperada pela empresa : ");
        String descricao_pessoal = teclado.nextLine();
        System.out.println("Informe o país da empresa : ");
        String pais_empresa = teclado.nextLine();
        System.out.println("Informe o cep da empresa : ");
        int cep = teclado.nextInt();
        System.out.println("Informe a senha : ");
        int senha = teclado.nextInt();
        System.out.println("Informe o cnpj da empresa : ");
        int cnpj = teclado.nextInt();

        ControllerEmpresa.atualizar_Dados_Da_Empresa(nome, e_mail, descricao_pessoal,
                pais_empresa, cep, senha, cnpj, codigo_empresa);
    }
        static void deletar_Empresa() {
            System.out.println("Código da empresa : ");
            int codigo_empresa = teclado.nextInt();

        ControllerEmpresa.deletar_Empresa(codigo_empresa);

        }
    }

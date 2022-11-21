package ViewLinkeTinder;

import ControllerLinkeTinder.ControllerCandidato;
import java.sql.SQLException;
import java.util.Scanner;
public class InputCandidato {
    static Scanner teclado = new Scanner(System.in);
    static void inserir_Candidato() {
        System.out.println("Informe o código do Candidato : ");
        final int codigo_candidato = teclado.nextInt();
        System.out.println("Informe o nome do Candidato : ");
        teclado.nextLine();
        final String nome = teclado.nextLine();
        System.out.println("Informe sobrenome do Candidato : ");
        final String sobrenome = teclado.nextLine();
        System.out.println("Informe a data de nascimento do Candidato : ");
        final String data_de_nascimento = teclado.nextLine();
        System.out.println("Informe o e-mail do Candidato : ");
        final String e_mail = teclado.nextLine();
        System.out.println("Informe o CPF do Candidato : ");
        final int cpf = teclado.nextInt();
        System.out.println("Informe o país do Candidato : ");
        teclado.nextLine();
        final String pais = teclado.nextLine();
        System.out.println("Informe o CEP do Candidato : ");
        final int cep = teclado.nextInt();
        System.out.println("Informe a descrição pessoal do Candidato : ");
        teclado.nextLine();
        final String descricao_pessoal = teclado.nextLine();
        System.out.println("Informe a senha do Candidato  : ");
        final int senha = teclado.nextInt();

        ControllerCandidato.inserir_Candidato(codigo_candidato,nome,sobrenome,data_de_nascimento,e_mail,
                cpf,pais,cep,descricao_pessoal,senha);
    }
    static void atualizar_Dados_Do_Candidato() throws SQLException {
        System.out.println("Informe o código do candidato");
        int codigo_candidato = teclado.nextInt();
        System.out.println("Informe o nome do Candidato : ");
        teclado.nextLine();
        String nome = teclado.nextLine();
        System.out.println("Informe sobrenome do Candidato : ");
        String sobrenome = teclado.nextLine();
        System.out.println("Informe a data de nascimento do Candidato : ");
        String data_de_nascimento = teclado.nextLine();
        System.out.println("Informe o e-mail do Candidato : ");
        String e_mail = teclado.nextLine();
        System.out.println("Informe o CPF do Candidato : ");
        int cpf = teclado.nextInt();
        System.out.println("Informe o país do Candidato : ");
        teclado.nextLine();
        String pais = teclado.nextLine();
        System.out.println("Informe o CEP do Candidato : ");
        int cep = teclado.nextInt();
        System.out.println("Informe a descrição pessoal do Candidato : ");
        teclado.nextLine();
        String descricao_pessoal = teclado.nextLine();
        System.out.println("Informe a senha do Candidato  : ");
        int senha = teclado.nextInt();

        ControllerCandidato.atualizar_Dados_Do_Candidato(codigo_candidato, nome, sobrenome, data_de_nascimento,
                e_mail, cpf, pais, cep, descricao_pessoal, senha);
    }
    static void deletar_Candidato() {
        System.out.println("Código do candidato : ");
        int codigo_candidato = teclado.nextInt();

        ControllerCandidato.deletar_Candidato(codigo_candidato);
    }
}
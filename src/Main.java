import java.util.Scanner;

import modelos.Equipamento;

import java.util.ArrayList;
import services.GerenciadorAluno;
import services.GerenciadorProfessor;
import services.GerenciadorEquipamento;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, bem vindo ao sistema de cadastro de alunos e professores!");
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar alunos");
            System.out.println("2 - Cadastrar professores");
            System.out.println("3 - Cadastrar equipamentos");
            System.out.println("4 - Sair");
            opcao = sc.nextInt();

            sc.nextLine();
            switch (opcao) {
                case 1:
                    GerenciadorAluno cadAluno = criarAluno(sc);
                    break;
                case 2:
                    GerenciadorProfessor cadProfessor = criarProfessor(sc);
                    break;
                case 3:
                    GerenciadorEquipamento cadEquipamento = criarEquipamento(sc);
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        sc.close();
    }

    public static GerenciadorAluno criarAluno(Scanner sc) {
        System.out.println("Quantos alunos a ser cadastrado?");
        int novosAlunos = sc.nextInt();
        sc.nextLine(); //limpar buffer
        GerenciadorAluno cadAluno = new GerenciadorAluno(novosAlunos);
        for(int i= 0; i< novosAlunos; i++) {
            cadAluno.cadastrarAluno(sc);
        }
        cadAluno.imprimirAlunos();
        return cadAluno;
    }
    public static GerenciadorProfessor criarProfessor(Scanner sc) {
        System.out.println("Quantos professores a ser cadastrado?");
        int novosProfessores = sc.nextInt();
        sc.nextLine(); //limpar buffer
        GerenciadorProfessor cadProfessor = new GerenciadorProfessor(novosProfessores);
        for(int i= 0; i< novosProfessores; i++) {
            cadProfessor.cadastrarProfessor(sc);
        }
        cadProfessor.imprimirProfessores();
        return cadProfessor;
    }
    public static GerenciadorEquipamento criarEquipamento(Scanner sc) {
        System.out.println("Quantos equipamentos a ser cadastrado?");
        int novosEquipamentos = sc.nextInt();

        sc.nextLine(); //limpar buffer
        
        GerenciadorEquipamento cadEquipamento = new GerenciadorEquipamento();
        for(int i= 0; i< novosEquipamentos; i++) {
            cadEquipamento.cadastrarEquipamento(sc);
        }
        cadEquipamento.imprimirEquipamentos();
        return cadEquipamento;

    }
}

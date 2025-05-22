import java.util.Scanner;
import services.GerenciadorAluno;
import services.GerenciadorEquipamento;
import services.GerenciadorFuncionarios;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, bem vindo ao sistema de cadastro de alunos e professores!");
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("Escolha uma opção:");
            System.out.printf("1 - Cadastrar alunos\n2 - Cadastrar professores\n3 - Cadastrar equipamentos\n4 - Sair\n");
            opcao = sc.nextInt();

            sc.nextLine();
            switch (opcao) {
                case 1:
                    GerenciadorAluno cadAluno = criarAluno(sc);
                    break;
                case 2:
                    GerenciadorFuncionarios cadProfessor = criarProfessor(sc);
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

    public static GerenciadorFuncionarios criarProfessor(Scanner sc) {
        System.out.println("Quantos funcionarios a ser cadastrado?");
        int novosFuncionarios = sc.nextInt();
        sc.nextLine(); //limpar buffer
        GerenciadorFuncionarios cadProfessor = new GerenciadorFuncionarios();
        for(int i= 0; i< novosFuncionarios; i++) {
            cadProfessor.cadastrarProfessor(sc);
        }
        cadProfessor.listarProfessores();
        return cadProfessor;
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

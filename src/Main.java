import java.util.Scanner;
import services.GerenciadorAluno;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, bem vindo ao sistema de cadastro de alunos e professores!");
        int opcao = 0;
        while (opcao != -1) {     
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Professor");
            opcao = sc.nextInt();
            if(opcao == 1) {
                GerenciadorAluno cadAluno = criarAluno(sc);
            } else if(opcao == 2) {
                System.out.println("Em desenvolvimento...");
                return;
            }
            sc.nextLine();
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
}

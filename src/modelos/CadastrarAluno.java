package modelos;
import java.util.Scanner;

public class CadastrarAluno {
    private Aluno[] alunos;
    private int indice = 0;

    public CadastrarAluno(int maxAlunos) {
        this.alunos = new Aluno[maxAlunos];
    }

    public void cadastrarAluno(Aluno aluno) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = sc.nextLine();
        System.out.println("Digite a idade do aluno: ");
        int idadeAluno = sc.nextInt();
        System.out.println("Digite a altura do aluno: ");
        float alturaAluno = sc.nextFloat();
        System.out.println("Digite o peso do aluno: ");
        float pesoAluno = sc.nextFloat();

        // Limpar buffer
        sc.nextLine();

        Aluno a = new Aluno(nomeAluno, idadeAluno, alturaAluno, pesoAluno);
        this.alunos[this.indice] = a;
        this.indice++;
        System.out.println("Aluno cadastrado com sucesso!");

        sc.close();
    }
    public void imprimirAlunos() {
        if (this.indice == 0) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }else{
            System.out.println("Alunos cadastrados:");
            for (int i = 0; i < this.indice; i++) {
                this.alunos[i].imprimirAluno();
                System.out.println();
            }
        }
    }
}

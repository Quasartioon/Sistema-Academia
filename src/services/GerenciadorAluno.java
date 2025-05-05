package services;

import java.util.Scanner;
import modelos.Aluno;

public class GerenciadorAluno {
    private Aluno[] alunos;
    private int indice = 0;

    public GerenciadorAluno(int maxAlunos) {
        this.alunos = new Aluno[maxAlunos];
    }

    public void cadastrarAluno(Scanner sc) {
        System.out.print("Digite o CPF do aluno: ");
        String cpfAluno = sc.nextLine();
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = sc.nextLine();
        System.out.print("Digite a idade do aluno: ");
        int idadeAluno = sc.nextInt();
        System.out.print("Digite a altura do aluno: ");
        float alturaAluno = sc.nextFloat();
        System.out.print("Digite o peso do aluno: ");
        float pesoAluno = sc.nextFloat();

        // Limpar buffer
        sc.nextLine();

        Aluno a = new Aluno(cpfAluno,nomeAluno, idadeAluno, alturaAluno, pesoAluno);
        this.alunos[this.indice] = a;
        this.indice++;
        System.out.println("Aluno cadastrado com sucesso!");
        System.out.println("-".repeat(30));

    }
    public void imprimirAlunos() {
        if (this.indice == 0) {
            System.out.println("Nenhum aluno cadastrado.");
        }else{
            System.out.println("Alunos cadastrados:");
            for (int i = 0; i < this.indice; i++) {
                this.alunos[i].imprimirAluno();
                System.out.println("-".repeat(30));
            }
        }
        System.out.println("Pressione Enter para continuar.");
    }
}

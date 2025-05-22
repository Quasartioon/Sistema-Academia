package services;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelos.Aluno;
public class GerenciadorAluno {
    private List<Aluno> alunosList = new ArrayList<>();

    public GerenciadorAluno() {
        this.alunosList = new ArrayList<>();
    }

    public void cadastrarAluno(Scanner sc) {
        System.out.print("Digite o CPF do aluno: ");
        String cpf = sc.nextLine();
        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Digite a idade do aluno: ");
        int idade = sc.nextInt();
        System.out.print("Digite a altura do aluno: ");
        float alturaAluno = sc.nextFloat();
        System.out.print("Digite o peso do aluno: ");
        float pesoAluno = sc.nextFloat();

        // Limpar buffer
        sc.nextLine();

        Aluno a = new Aluno(cpf,nome, idade, alturaAluno, pesoAluno);
        this.alunosList.add(a);
        System.out.println("Aluno cadastrado com sucesso!");
        System.out.println("-".repeat(30));  // Função .repeat() só funciona a partir do Java 11

    }
    public List<Aluno> listarAlunos() {
        System.out.println("\nALUNOS CADASTRADOS: ");
        for(Aluno a : this.alunosList) {
            a.imprimirPessoa();
            System.out.println("-".repeat(30));  
        }
        return this.alunosList;
    }
}

package services;

import java.util.Scanner;
import modelos.Professor;
public class GerenciadorProfessor {
    private Professor[] professores;
    private int indice = 0;

    public GerenciadorProfessor(int maxProfessores) {
        this.professores = new Professor[maxProfessores];
    }

    public void cadastrarProfessor(Scanner sc) {
        System.out.print("Digite o CPF do professor: ");
        String cpf = sc.nextLine();
        System.out.print("Digite o nome do professor: ");
        String nome = sc.nextLine();
        System.out.print("Digite a idade do professor: ");
        int idade = sc.nextInt();
        System.out.print("Digite o salário do professor: ");
        double salario = sc.nextDouble();
        System.out.print("Digite a especialidade do professor: ");
        String especialidade = sc.nextLine();


        Professor p = new Professor(cpf, nome, idade, salario, especialidade);
        this.professores[this.indice] = p;
        this.indice++;
        System.out.println("Professor cadastrado com sucesso!");
        System.out.println("-".repeat(30)); // Função .repeat() só funciona a partir do Java 11
    }

    public void imprimirProfessores() {
        if (this.indice == 0) {
            System.out.println("Nenhum professor cadastrado.");
        }else{
            System.out.println("Professores cadastrados:");
            for (int i = 0; i < this.indice; i++) {
                this.professores[i].imprimirPessoa();
                System.out.println("-".repeat(30));  // Função .repeat() só funciona a partir do Java 11
            }
        }
    }
}

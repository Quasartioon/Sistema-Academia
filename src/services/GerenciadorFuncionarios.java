package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelos.Gerente;
import modelos.Professor;

public class GerenciadorFuncionarios {
    private List<Professor> professores = new ArrayList<>();
    private List<Gerente> gerente = new ArrayList<>();

    // Construtor:
    public GerenciadorFuncionarios() {
        this.professores = new ArrayList<>();
        this.gerente = new ArrayList<>();
    }

    // Métodos Professor:
    public void cadastrarProfessor(Scanner sc) {
        System.out.print("Digite o CPF do professor: ");
        String cpf = sc.nextLine();
        System.out.print("Digite o nome do professor: ");
        String nome = sc.nextLine();
        System.out.print("Digite a idade do professor: ");
        int idade = sc.nextInt();
        System.out.print("Digite o salário do professor: ");
        double salario = sc.nextDouble();
        System.out.print("Digite a carga horária do professor: ");
        int cargaHoraria = sc.nextInt();

        sc.nextLine(); // Limpar buffer

        System.out.print("Digite a especialidade do professor: ");
        String especialidade = sc.nextLine();
        
        Professor p = new Professor(cpf, nome, idade, salario, cargaHoraria, "Professor", especialidade);
        this.professores.add(p);
        System.out.println("Professor cadastrado com sucesso!");
        System.out.println("-".repeat(30));  
    }
    public List<Professor> listarProfessores() {
        System.out.println("\nPROFESSORES CADASTRADOS: ");
        for(Professor p : this.professores) {
            p.imprimirPessoa();
            System.out.println("-".repeat(30));  
        }
        return this.professores;
    }

    //Métodos Recepcionista:
    public void cadastrarGerente(Scanner sc) {
        System.out.print("Digite o CPF do gerente: ");
        String cpf = sc.nextLine();
        System.out.print("Digite o nome do gerente: ");
        String nome = sc.nextLine();
        System.out.print("Digite a idade do gerente: ");
        int idade = sc.nextInt();
        System.out.print("Digite o salário do gerente: ");
        double salario = sc.nextDouble();
        System.out.print("Digite a carga horária do gerente: ");
        int cargaHoraria = sc.nextInt();
        System.out.print("Digite o bonus de gerente (Em %): ");
        double bonus = sc.nextDouble();
        double novoSalario = salario + ( salario * (bonus / 100));

        sc.nextLine(); // Limpar buffer
        System.out.print("Digite a alocação do gerente: ");
        String alocacao = sc.nextLine();

        Gerente g = new Gerente(cpf, nome, idade, novoSalario, cargaHoraria, "Gerente", bonus, alocacao);
        this.gerente.add(g);
        System.out.println("Gerente cadastrado com sucesso!");
        System.out.println("-".repeat(30));
    }
    public List<Gerente> listarGerentes() {
        System.out.println("\nTODOS OS GERENTES: ");
        for(Gerente r : this.gerente) {
            r.imprimirPessoa();
            System.out.println("-".repeat(30));  
        }
        return this.gerente;
    }

}

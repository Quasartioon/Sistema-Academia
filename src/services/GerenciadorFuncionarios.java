package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelos.Professor;
import modelos.Recepcionista;

public class GerenciadorFuncionarios {
    private List<Professor> professores = new ArrayList<>();
    private List<Recepcionista> recepcionistas = new ArrayList<>();

    // Construtor:
    public GerenciadorFuncionarios() {
        this.professores = new ArrayList<>();
        this.recepcionistas = new ArrayList<>();
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
        for(Professor p : this.professores) {
            p.imprimirPessoa();
            System.out.println("-".repeat(30));  
        }
        return this.professores;
    }

    //Métodos Recepcionista:
    public void cadastrarRecepcionista(Scanner sc) {
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
        System.out.print("Qual o código do recepcionista: ");
        int codAtendimento = sc.nextInt();
        sc.nextLine(); // Limpar buffer
        System.out.print("Local de atendimento: ");
        String tipoAtendimento = sc.nextLine();

        Recepcionista r = new Recepcionista(cpf, nome, idade, salario, cargaHoraria, "Recepcionista", codAtendimento, tipoAtendimento);
        this.recepcionistas.add(r);
        System.out.println("Recepcionista cadastrado com sucesso!");
        System.out.println("-".repeat(30));
    }
    public List<Recepcionista> listarRecepcionistas() {
        for(Recepcionista r : this.recepcionistas) {
            r.imprimirPessoa();
            System.out.println("-".repeat(30));  
        }
        return this.recepcionistas;
    }

}

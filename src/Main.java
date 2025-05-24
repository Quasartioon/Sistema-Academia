import java.util.Scanner;
import services.GerenciadorAluno;
import services.GerenciadorAula;
import services.GerenciadorEquipamento;
import services.GerenciadorFuncionarios;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        GerenciadorAluno gerenciadorAluno = new GerenciadorAluno();
        GerenciadorFuncionarios gerenciadorFuncionarios = new GerenciadorFuncionarios();
        GerenciadorEquipamento gerenciadorEquipamento = new GerenciadorEquipamento();
        GerenciadorAula gerenciadorAula = new GerenciadorAula();
        
        System.out.println("Olá, bem vindo ao sistema de gestão acadêmica!");
        int opcao = 0;
        do{
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("1 - Gerenciar Alunos");
            System.out.println("2 - Gerenciar Professores/Funcionários");
            System.out.println("3 - Gerenciar Equipamentos");
            System.out.println("4 - Gerenciar Aulas/Treinos");
            System.out.println("5 - Sair");
            System.out.print("\nEscolha uma opção: ");
            
            opcao = sc.nextInt();
            sc.nextLine(); // Limpar buffer
            
            switch (opcao) {
                case 1:
                    menuAlunos(sc, gerenciadorAluno);
                    break;
                case 2:
                    menuFuncionarios(sc, gerenciadorFuncionarios);
                    break;
                case 3:
                    menuEquipamentos(sc, gerenciadorEquipamento);
                    break;
                case 4:
                    menuAulas(sc, gerenciadorAula, gerenciadorEquipamento);
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 5);
        sc.close();
    }
    public static void menuAlunos(Scanner sc, GerenciadorAluno gerenciador) {
        int opcao;
        do {
            System.out.println("\nGERENCIAMENTO DE ALUNOS");
            System.out.println("1 - Cadastrar novo aluno");
            System.out.println("2 - Listar todos os alunos");
            System.out.println("3 - Voltar ao menu principal");
            System.out.print("\nEscolha uma opção: ");
            
            
            opcao = sc.nextInt();
            sc.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.print("Quantos alunos deseja cadastrar? ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < quantidade; i++) {
                        gerenciador.cadastrarAluno(sc);
                    }
                    break;
                case 2:
                    gerenciador.listarAlunos();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 3);
    }
     public static void menuFuncionarios(Scanner sc, GerenciadorFuncionarios gerenciador) {
        int opcao;
        char escolha;
        do {
            System.out.println("\nGERENCIAMENTO DE FUNCIONÁRIOS");
            System.out.println("1 - Cadastrar novo funcionário");
            System.out.println("2 - Listar todos os funcionários");
            System.out.println("3 - Voltar ao menu principal");
            System.out.print("\nEscolha uma opção: ");
            
            opcao = sc.nextInt();
            sc.nextLine();
            
            switch (opcao) {
                case 1:
                    do { 
                        System.out.println("Deseja cadastrar um gerente? (S/N)");
                        escolha = sc.nextLine().toUpperCase().charAt(0);
    
                        if(escolha == 'S'){
                            System.out.print("Digite quantos gerentes a serem cadastrado: ");
                            int quantidade = sc.nextInt();
                            sc.nextLine();
                            for (int i = 0; i < quantidade; i++) {
                                gerenciador.cadastrarGerente(sc);
                            }                        
                        } else if (escolha == 'N'){
                            System.out.print("Digite quantos professores a serem cadastrado: ");
                            int quantidade = sc.nextInt();
                            sc.nextLine();
                            for (int i = 0; i < quantidade; i++) {
                                gerenciador.cadastrarProfessor(sc);
                            }
                        } else {
                            System.out.println("Escolha inválida");
                        }
                    } while (escolha != 'S' && escolha != 'N');
                    
                    break;
                case 2:
                    do{
                        System.out.print("Digite qual lista deseja visualizar (G = Gernetes; P = Professores): ");
                        escolha = sc.nextLine().toUpperCase().charAt(0);

                        if(escolha == 'G'){
                            gerenciador.listarGerentes();
                        } else if(escolha == 'P'){
                            gerenciador.listarProfessores();
                        } else {
                            System.out.println("ENTRADA INVÁLIDA!");
                        }
                    }while(escolha != 'G' && escolha != 'P');

                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 3);
    }

    // Submenu para Equipamentos
    public static void menuEquipamentos(Scanner sc, GerenciadorEquipamento gerenciador) {
        int opcao;
        do {
            System.out.println("\nGERENCIAMENTO DE EQUIPAMENTOS");
            System.out.println("1 - Cadastrar novo equipamento");
            System.out.println("2 - Listar todos os equipamentos");
            System.out.println("3 - Voltar ao menu principal");
            System.out.print("\nEscolha uma opção: ");
            
            opcao = sc.nextInt();
            sc.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.print("Quantos equipamentos deseja cadastrar? ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < quantidade; i++) {
                        gerenciador.cadastrarEquipamento(sc);
                    }
                    break;
                case 2:
                    gerenciador.imprimirEquipamentos();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 3);
    }

    // Submenu para Aulas/Treinos (com integração de equipamentos)
    public static void menuAulas(Scanner sc, GerenciadorAula gerenciadorAula, GerenciadorEquipamento gerenciadorEquipamento) {
        int opcao;
        do {
            System.out.println("\nGERENCIAMENTO DE AULAS/TREINOS");
            System.out.println("1 - Agendar nova aula/treino");
            System.out.println("2 - Listar todas as aulas/treinos");
            System.out.println("3 - Adicionar equipamento a um treino");
            System.out.println("4 - Ver equipamentos de um treino");
            System.out.println("5 - Voltar ao menu principal");
            System.out.print("\nEscolha uma opção: ");
            
            opcao = sc.nextInt();
            sc.nextLine();
            
            switch (opcao) {
                case 1:
                    gerenciadorAula.agendarAula(sc);
                    break;
                case 2:
                    gerenciadorAula.listarAulas();
                    break;
                case 3:
                    gerenciadorAula.adicionarEquipamentoAoTreino(sc, gerenciadorEquipamento);
                    break;
                case 4:
                    gerenciadorAula.verEquipamentosDoTreino(sc);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);
    }
}

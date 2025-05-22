package services;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelos.Aula;
import modelos.Equipamento;
import modelos.Treino;

public class GerenciadorAula {
    private List<Aula> aulas = new ArrayList<>();
    
    public void agendarAula(Scanner sc){
        System.out.print("É um treino? (S/N): ");
        boolean isTreino = sc.next().equalsIgnoreCase("S");
        sc.nextLine(); // Limpar buffer

        System.out.print("Digite a data (dd/mm/aaaa): ");
        String data = sc.nextLine();
    
        System.out.print("Digite a hora: ");
        String hora = sc.nextLine();

        if (isTreino) {
            System.out.print("Tipo do treino: ");
            String tipoTreino = sc.nextLine();
        
            System.out.print("Duração (minutos): ");
            int duracao = sc.nextInt();
            sc.nextLine(); // Limpar buffer

            Treino treino = new Treino(hora, data, tipoTreino, duracao);
            aulas.add(treino);
            System.out.println("Treino agendado com sucesso!");
        } else {
            Aula aula = new Aula(hora, data);
            aulas.add(aula);
            System.out.println("Aula agendada com sucesso!");
        }
        System.out.println("-".repeat(30));
    }

    public void listarAulas() {
        if (aulas.isEmpty()) {
            System.out.println("Nenhuma aula/treino agendado.");
        } else {
            System.out.println("\n-AULAS/TREINOS AGENDADOS-");
            for (int i = 0; i < aulas.size(); i++) {
                System.out.println("ÍNDICE "+ i + ": ");
                if (aulas.get(i) instanceof Treino) {
                    ((Treino) aulas.get(i)).imprimirTreino();
                } else {
                    aulas.get(i).imprimirAula();
                }
                System.out.println("\n" + "-".repeat(30));
            }   
        }
    }

    public void cancelarAula(Scanner sc) {
        listarAulas();
        if (!aulas.isEmpty()) {
            System.out.print("Digite o índice da aula a cancelar: ");
            int indice = sc.nextInt();
            if (indice >= 0 && indice < aulas.size()) {
                aulas.remove(indice);
                System.out.println("Aula cancelada com sucesso!");
            }else {
                System.out.println("Índice inválido!");
            }
        }
        System.out.println("-".repeat(30));
    }

    private void editarAulaBasica(Scanner sc, Aula aula) {
        System.out.print("Nova data (" + aula.getData() + "): ");
        String novaData = sc.nextLine();
        if (!novaData.isEmpty()) {
            aula.setData(novaData);
        }
    
        System.out.print("Nova hora (" + aula.getHora() + "): ");
        String novaHoraStr = sc.nextLine();
        if (!novaHoraStr.isEmpty()) {
            aula.setHora(novaHoraStr);
        }
        System.out.println("Aula atualizada com sucesso!");
    }
    private void editarTreino(Scanner sc, Treino treino) {
        editarAulaBasica(sc, treino);
    
        System.out.print("Novo tipo de treino (" + treino.getTipoTreino() + "): ");
        String novoTipo = sc.nextLine();
        if (!novoTipo.isEmpty()) {
            treino.setTipoTreino(novoTipo);
        }
    
        System.out.print("Nova duração (" + treino.getduracaoTreino() + "): ");
        String novaDuracaoStr = sc.nextLine();
        if (!novaDuracaoStr.isEmpty()) {
            treino.setduracaoTreino(Integer.parseInt(novaDuracaoStr));
        }
        System.out.println("Treino atualizado com sucesso!");
    }

    public void adicionarEquipamentoAoTreino(Scanner sc, GerenciadorEquipamento gerenciadorEquipamento) {
        listarAulas();
        System.out.print("Digite o índice do treino: ");
        int indiceTreino = sc.nextInt();
        sc.nextLine();
    
        if (indiceTreino >= 0 && indiceTreino < aulas.size() && 
            aulas.get(indiceTreino) instanceof Treino) {
        
            Treino treino = (Treino) aulas.get(indiceTreino);
            gerenciadorEquipamento.imprimirEquipamentos();
        
            System.out.print("Digite o índice do equipamento a adicionar: ");
            int indiceEquip = sc.nextInt();
            sc.nextLine();
        
            try {
                Equipamento equip = gerenciadorEquipamento.getEquipamento(indiceEquip);
                treino.adicionarEquipamento(equip);
                System.out.println("Equipamento adicionado ao treino!");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Índice de equipamento inválido!");
            }
        } else {
            System.out.println("Índice inválido ou não é um treino!");
        }
        System.out.println("-".repeat(30));
    }
    public void verEquipamentosDoTreino(Scanner sc) {
        listarAulas();
        System.out.print("Digite o índice do treino: ");
        int indice = sc.nextInt();
        sc.nextLine();
    
        if (indice >= 0 && indice < aulas.size() && 
            aulas.get(indice) instanceof Treino) {
        
            Treino treino = (Treino) aulas.get(indice);
            System.out.println("Equipamentos para este treino:");
            for (Equipamento equip : treino.getEquipamentosNecessarios()) {
                equip.imprimirEquipamento();
            }
        } else {
            System.out.println("Índice inválido ou não é um treino!");
        }
    }
}

package services;
import java.util.ArrayList;
import java.util.Scanner;
import modelos.Equipamento;

public class GerenciadorEquipamento {
    private ArrayList <Equipamento> lista = new ArrayList<>();

    public void cadastrarEquipamento(Scanner sc) {
        System.out.print("Digite o nome do equipamento: ");
        String nomeEquipamento = sc.nextLine();
        System.out.print("Digite a quantidade do equipamento: ");
        int quantidadeEquipamento = sc.nextInt();
        System.out.print("Digite o valor do equipamento: ");
        float valorEquipamento = sc.nextFloat();

        float valorTotalEquipamento = quantidadeEquipamento * valorEquipamento;

        sc.nextLine();// Limpar buffer

        lista.add(new Equipamento(nomeEquipamento, quantidadeEquipamento, valorEquipamento, valorTotalEquipamento));

        System.out.println("Equipamento cadastrado com sucesso!");
        System.out.println("-".repeat(80)); // Função .repeat() funciona a partir do Java 11
    }

    public void imprimirEquipamentos() {
        if (this.lista.size() == 0) {
            System.out.println("Nenhum equipamento cadastrado.");
        }else{
            // Cabeçalho
            System.out.printf("%-20s | %-15s | %-20s | %-20s\n", "Equipamento", "Quantidade", "Valor por unidade", "Valor Total");
            System.out.println("-".repeat(80)); // Função .repeat() funciona a partir do Java 11
            for (Equipamento eq : this.lista) {
                eq.imprimirEquipamento();
            }
        }
        System.out.println("-".repeat(80)); // Função .repeat() funciona a partir do Java 11
    }

    public Equipamento getEquipamento(int indice) throws IndexOutOfBoundsException {
        return this.lista.get(indice);
    }
}

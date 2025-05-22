package services;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelos.Aula;

public class GerenciadorAula {
    private List<Aula> aulas = new ArrayList<>();
    
    public void agendarAula(Scanner sc){
        System.out.print("Digite a data da aula (dd/mm/aaaa): ");
        String data = sc.next();
        System.out.print("Digite a hora da aula: ");
        int hora = sc.nextInt();
        sc.nextLine();


        Aula a = new Aula(hora, data);
        this.aulas.add(a);
        System.out.println("Aula agendada com sucesso!");
        System.out.println("-".repeat(30));
    }

    public List<Aula> listarAulas() {
        for (Aula a : this.aulas) {
            a.imprimirAula();
            System.out.println("-".repeat(30));
        }
        return this.aulas;
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
}

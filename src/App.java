import java.util.Scanner;
import modelos.Aluno;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        Aluno a1 = setAluno(sc);
        a1.imprimirAluno();

        sc.close();
    }
    public static Aluno setAluno(Scanner sc) {
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
        return new Aluno(nomeAluno, idadeAluno, alturaAluno, pesoAluno);
    }
}

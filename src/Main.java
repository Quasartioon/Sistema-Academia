import java.util.Scanner;
import modelos.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos a ser cadastrado?");
        int novosAlunos = sc.nextInt();

        CadastrarAluno cadAluno = new CadastrarAluno(novosAlunos);
        cadAluno.cadastrarAluno();
        cadAluno.imprimirAlunos();

        sc.close();
    }
}

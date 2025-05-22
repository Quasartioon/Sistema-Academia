package modelos;
public class Professor extends Funcionario{
    private String especialidade;

    // Constructor
    public Professor(String cpf, String nome, int idade, double salario, int cargaHoraria, String cargo, String especialidade) {
        super(cpf, nome, idade, salario, cargaHoraria, cargo);
        this.especialidade = especialidade;
    }

    @Override
    public void imprimirPessoa() {
        super.imprimirPessoa();
        System.out.printf("Especialidade: %s\n", 
                         this.especialidade);
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        if (especialidade == null || especialidade.trim().isEmpty()) {
            System.out.println("specialidade não informada. Será definido como 'Indefinido'.");
            this.especialidade = "Indefinido";
        } else {
            this.especialidade = especialidade;
        }
    }
}

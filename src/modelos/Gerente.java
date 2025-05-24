package modelos;

public class Gerente extends Funcionario {
    private double bonus;
    private String alocacao;

    public Gerente(String cpf, String nome, int idade, double salario, int cargaHoraria, String cargo, double bonus, String alocacao) {
        super(cpf, nome, idade, salario, cargaHoraria, cargo);
        this.bonus = bonus;
        this.alocacao = alocacao;
    }

    @Override
    public void imprimirPessoa() {
        super.imprimirPessoa();
        System.out.printf("Bonus: %.2f\nAlocação da academia: %s",
                                this.bonus, this.alocacao);
    }
    public double getBonus(){
        return bonus;
    }
}

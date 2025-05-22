package modelos;
public class Funcionario extends Pessoa{
    protected double salario;
    protected int cargaHoraria;
    protected String cargo;

    public Funcionario(String cpf, String nome, int idade, double salario, int cargaHoraria, String cargo) {
        super(cpf, nome, idade);
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
        this.cargo = cargo;
    }
    @Override
    public void imprimirPessoa() {
        super.imprimirPessoa();
        System.out.printf("Salário: %.2f\nHoras Trabalhadas: %d\nCargo: %s\n", 
                         this.salario, this.cargaHoraria, this.cargo);
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        if (salario > 1000){
            this.salario = salario;
        } else if (salario > 0) {
            System.out.println("O salário é um valor muito baixo, tem certeza?");
        } else {
            System.out.println("O salário deve ser maior que zero!");
            return;
        }
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}

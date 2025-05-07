package modelos;
public class Professor extends Pessoa{
    private double salario;
    private String especialidade;

    // Constructor
    public Professor(String cpf, String nome, int idade, double salario, String especialidade){
        super(cpf, nome, idade);
        this.salario = salario;
        this.especialidade = especialidade;
    }
    @Override
    public void imprimirPessoa() {
        super.imprimirPessoa();
        System.out.printf("Salario: %.2f\nEspecialidade: %s\n", 
                         this.salario, this.especialidade);
    }

    public String getEspecialidade(){
        return this.especialidade;
    }
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
}

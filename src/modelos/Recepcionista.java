package modelos;

public class Recepcionista extends Funcionario {
    private int codAtendimento;
    private String tipoAtendimento;

    public Recepcionista(String cpf, String nome, int idade, double salario, int cargaHoraria, String cargo, int codAtendimento, String tipoAtendimento) {
        super(cpf, nome, idade, salario, cargaHoraria, cargo);
        this.codAtendimento = codAtendimento;
        this.tipoAtendimento = tipoAtendimento;
    }

    @Override
    public void imprimirPessoa() {
        super.imprimirPessoa();
        System.out.printf("Código de Atendimento: %d\nTipo de Atendimento: %s\n", this.codAtendimento, this.tipoAtendimento);
    }

    public int getCodAtendimento() {
        return codAtendimento;
    }

    public void setCodAtendimento(int codAtendimento) {
        this.codAtendimento = codAtendimento;
    }

    public String getTipoAtendimento(){
        return tipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }
}

package modelos;

public class Pessoa {
    protected String cpfPessoa;
    protected String nomePessoa;
    protected int idadePessoa;
    protected float alturaPessoa;
    protected float pesoPessoa;

    public Pessoa(String nomePessoa, String cpfPessoa, int idadePessoa, float alturaPessoa, float pesoPessoa) {
        this.cpfPessoa = cpfPessoa;
        this.nomePessoa = nomePessoa;
        this.idadePessoa = idadePessoa;
        this.alturaPessoa = alturaPessoa;
        this.pesoPessoa = pesoPessoa;
    }
    public void imprimirPessoa() {
        System.out.printf("CPF: %s\nNome: %s\nIdade: %d anos\nAltura: %.2f M\nPeso: %.2f Kg\n", 
                          this.cpfPessoa, this.nomePessoa, this.idadePessoa, this.alturaPessoa, this.pesoPessoa);
    }
}

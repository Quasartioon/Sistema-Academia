package modelos;

public class Pessoa {
    protected String cpf;
    protected String nome;
    protected int idade;

    public Pessoa(String cpf, String nome, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }
    public void imprimirPessoa() {
        System.out.printf("CPF: %s\nNome: %s\nIdade: %d anos\n", 
                         this.cpf, this.nome, this.idade);
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null && !cpf.trim().isEmpty()){
            this.cpf = cpf;
        } else{
            System.out.println("O CPF deve ser preenchido!");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome != null && !nome.trim().isEmpty()){
            this.nome = nome;
        } else{
            System.out.println("O nome deve ser preenchido!");
        }
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if(idade > 0){
            this.idade = idade;
        } else{
            System.out.println("A idade deve ser maior que zero!");
            return;
        }
    }
}

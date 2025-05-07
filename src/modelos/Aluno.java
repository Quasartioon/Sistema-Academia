package modelos;
public class Aluno extends Pessoa{
    private float alturaAluno;
    private float pesoAluno;

    // Construtor
    public Aluno(String cpf, String nome, int idade, float alturaAluno, float pesoAluno) {
        super(cpf, nome, idade);
        this.alturaAluno = alturaAluno;
        this.pesoAluno = pesoAluno;
    }
    public void imprimirAluno(){
        System.out.printf("Altura: %.2f M\nPeso: %.2f Kg\n", 
                          this.alturaAluno, this.pesoAluno);
    }
    
    public float getAlturaAluno() {
        return this.alturaAluno;
    }
    public void setAlturaAluno(float alturaAluno) {
        this.alturaAluno = alturaAluno;
    }
    public float getPesoAluno() {
        return this.pesoAluno;
    }
    public void setPesoAluno(float pesoAluno) {
        this.pesoAluno = pesoAluno;
    }

    @Override
    public void imprimirPessoa() {
        super.imprimirPessoa();
        System.out.printf("Altura: %.2f M\nPeso: %.2f Kg\n", 
                          this.alturaAluno, this.pesoAluno);
    }
}

package modelos;

public class Aluno {
    private String nomeAluno;
    private int idadeAluno;
    private float alturaAluno;
    private float pesoAluno;

    // Construtor
    public Aluno(String nomeAluno, int idadeAluno, float alturaAluno, float pesoAluno) {
        this.nomeAluno = nomeAluno;
        this.idadeAluno = idadeAluno;
        this.alturaAluno = alturaAluno;
        this.pesoAluno = pesoAluno;
    }
    public void imprimirAluno(){
        System.out.printf("Nome: %s\nIdade: %d\nAltura: %.2f\nPeso: %.2f\n", 
        this.nomeAluno, this.idadeAluno, this.alturaAluno, this.pesoAluno);
    }

    public String getNomeAluno() {
        return this.nomeAluno;
    }
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    public int getIdadeAluno() {
        return this.idadeAluno;
    }
    public void setIdadeAluno(int idadeAluno) {
        this.idadeAluno = idadeAluno;
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
}

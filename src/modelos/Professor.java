package modelos;

public class Professor {
    private String cpfProfessor;
    private String nomeProfessor;
    private int idadeProfessor;
    private float alturaProfessor;
    private float pesoProfessor;

    // Constructor
    public Professor(String cpfProfessor, String nomeProfessor, int idadeProfessor, float alturaProfessor, float pesoProfessor) {
        this.cpfProfessor = cpfProfessor;
        this.nomeProfessor = nomeProfessor;
        this.idadeProfessor = idadeProfessor;
        this.alturaProfessor = alturaProfessor;
        this.pesoProfessor = pesoProfessor;
        
    }

    public void imprimirProfessor() {
        System.out.printf("CPF: %s\nNome: %s\nIdade: %d anos\nAltura: %.2f M\nPeso: %.2f Kg\n", 
                          this.cpfProfessor, this.nomeProfessor, this.idadeProfessor, this.alturaProfessor, this.pesoProfessor);
    }

    public String getCpfProfessor() {
        return this.cpfProfessor;
    }

    public void setCpfProfessor(String cpfProfessor) {
        this.cpfProfessor = cpfProfessor;
    }
    public String getNomeProfessor() {
        return this.nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public int getIdadeProfessor() {
        return this.idadeProfessor;
    }

    public void setIdadeProfessor(int idadeProfessor) {
        this.idadeProfessor = idadeProfessor;
    }

    public float getAlturaProfessor() {
        return this.alturaProfessor;
    }        

    public void setAlturaProfessor(float alturaProfessor) {
        this.alturaProfessor = alturaProfessor;
    }

    public float getPesoProfessor() {
        return this.pesoProfessor;
    }

    public void setPesoProfessor(float pesoProfessor) {
        this.pesoProfessor = pesoProfessor;
    }
}

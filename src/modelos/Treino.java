package modelos;
public class Treino extends Aula{
    private String tipoTreino;
    private int duracaoTreino;

    public Treino(int hora, String data, String tipoTreino, int duracaoTreino) {
        super(hora, data);
        this.tipoTreino = tipoTreino;
        this.duracaoTreino = duracaoTreino;
    }

    public void imprimirTreino(){
        super.imprimirAula();
        System.out.printf("Duração do treino: %d\nTipo de treino: %s",
                         this.duracaoTreino, this.tipoTreino);
    }

    public String getTipoTreino() {
        return this.tipoTreino;
    }

    public void setTipoTreino(String tipoTreino) {
        this.tipoTreino = tipoTreino;
    }

    public int getduracaoTreino() {
        return this.duracaoTreino;
    }
    public void setduracaoTreino(int duracaoTreino) {
        this.duracaoTreino = duracaoTreino;
    }
}

package modelos;

import java.util.ArrayList;
import java.util.List;
public class Treino extends Aula{
    private String tipoTreino;
    private int duracaoTreino;
    private List<Equipamento> equipamentosNecessarios = new ArrayList<>();

    public Treino(String hora, String data, String tipoTreino, int duracaoTreino) {
        super(hora, data);
        this.tipoTreino = tipoTreino;
        this.duracaoTreino = duracaoTreino;
    }

    public void adicionarEquipamento(Equipamento equipamento) {
        this.equipamentosNecessarios.add(equipamento);
    }

    public void removerEquipamento(Equipamento equipamento) {
        this.equipamentosNecessarios.remove(equipamento);
    }

    public List<Equipamento> getEquipamentosNecessarios() {
        return this.equipamentosNecessarios;
    }

    public void imprimirTreino(){
        super.imprimirAula();
        System.out.printf("\nDuração do treino: %d\nTipo de treino: %s",
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

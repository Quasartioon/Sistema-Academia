package modelos;
public class Treino extends Equipamento{
    private String tipoTreino;
    private int duracaoTreino;

    public Treino(String nomeEquipamento, int quantidadeEquipamento, float valorEquipamento, float valorTotalEquipamento, String tipoTreino, int duracaoTreino){
        super(nomeEquipamento, quantidadeEquipamento, valorEquipamento, valorTotalEquipamento);
        this.duracaoTreino = duracaoTreino;
        this.tipoTreino = tipoTreino;
    }


    public void imprimirTreino(){
        super.imprimirNomeEquipamento();
        System.out.printf("Duração do treino: %d\nTipo de treino: %s",
                         this.duracaoTreino, this.tipoTreino);
    }
}

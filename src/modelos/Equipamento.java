package modelos;

public class Equipamento {
    private String nomeEquipamento;
    private int quantidadeEquipamento;
    private float valorEquipamento;

    public Equipamento(String nomeEquipamento, int quantidadeEquipamento, float valorEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
        this.quantidadeEquipamento = quantidadeEquipamento;
        this.valorEquipamento = valorEquipamento;
    }
    public void imprimirEquipamento(){
        System.out.printf("%-20s | %-15d | R$ %.2f\n", this.nomeEquipamento, this.quantidadeEquipamento, this.valorEquipamento);
    }

    public String getNomeEquipamento() {
        return nomeEquipamento;
    }

    public void setNomeEquipamento(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }

    public int getQuantidadeEquipamento() {
        return quantidadeEquipamento;
    }

    public void setQuantidadeEquipamento(int quantidadeEquipamento) {
        this.quantidadeEquipamento = quantidadeEquipamento;
    }

    public float getValorEquipamento() {
        return valorEquipamento;
    }

    public void setValorEquipamento(float valorEquipamento) {
        this.valorEquipamento = valorEquipamento;
    }
}

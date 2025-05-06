package modelos;

public class Equipamento {
    private String nomeEquipamento;
    private int quantidadeEquipamento;
    private float valorEquipamento;
    private float valorTotalEquipamento;


    public Equipamento(String nomeEquipamento, int quantidadeEquipamento, float valorEquipamento, float valorTotalEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
        this.quantidadeEquipamento = quantidadeEquipamento;
        this.valorEquipamento = valorEquipamento;
        this.valorTotalEquipamento = valorTotalEquipamento;
    }
    public void imprimirEquipamento(){
        System.out.printf("%-20s | %-15d | R$ %-17.2f | R$ %-10.2f\n", 
                          this.nomeEquipamento, this.quantidadeEquipamento, this.valorEquipamento, this.valorTotalEquipamento);
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

    public float getValorTotalEquipamento() {
        return valorTotalEquipamento;
    }

    public void setValorTotalEquipamento(float valorTotalEquipamento) {
        this.valorTotalEquipamento = valorTotalEquipamento;
    }
}

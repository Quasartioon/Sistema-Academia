package modelos;

public class Aula {
    protected int hora;
    protected String data;

    public Aula(int hora, String data) {
        this.hora = hora;
        this.data = data;
    }

    public void imprimirAula(){
        System.out.printf("Hora da aula:\n Data da aula: \n",
                            this.hora, this.data);
    }

    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
}

package modelos;

public class Aula {
    protected String hora;
    protected String data;

    public Aula(String hora, String data) {
        this.hora = hora;
        this.data = data;
    }

    public void imprimirAula(){
        System.out.printf("Hora da aula: %s\nData da aula: %s",
                            this.hora, this.data);
    }

    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
}

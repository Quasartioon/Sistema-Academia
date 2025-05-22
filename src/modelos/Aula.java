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
}

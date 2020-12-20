public class Gasto {
    String nombreGasto;
    int valor;
    Boolean pagado;S
    public Gasto() {

    }

    public Gasto(String nombreGasto, int valor, boolean pagado) {
        valor = valor;
        nombreGasto=nombreGasto;
        pagado=pagado;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setNombreGasto(String nombreGasto) {
        this.nombreGasto = nombreGasto;
    }

    public String getNombreGasto() {
        return nombreGasto;
    }
}

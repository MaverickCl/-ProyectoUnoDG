public class Gasto {
    String nombreGasto;
    int Valor;
    Boolean pagado;
    public Gasto() {

    }

    public Gasto(String nombreGasto, int valor, boolean pagado) {
        Valor = valor;
        nombreGasto=nombreGasto;
        pagado=pagado;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int valor) {
        this.Valor = valor;
    }

    public void setNombreGasto(String nombreGasto) {
        this.nombreGasto = nombreGasto;
    }

    public String getNombreGasto() {
        return nombreGasto;
    }
}

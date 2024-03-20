public class Temperatura {
    private double valor;
    private char unidad;
    p color;

    public Temperatura(double valor, char unidad, color){
        this.valor = valor;
        this.unidad = unidad;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public char getUnidad(){
        return unidad;
    }

    public void setUnidad(char unidad){
        this.unidad = unidad == 'F' || unidad == 'C' || unidad == 'K' ? unidad:'C'; 
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}

package abstraccion;
import javax.swing.JOptionPane;


public class Arreglo1Cl {
    private int longitud;  
    private int entrada;
    private int divisor;
    private int contador = 0;
    private int mayor = 0;
    private int menor = 0;
    private int [] salida = new int [50];
    private int [] mayorPromedio = new int [50];
    private int suma = 0;
    private double promedio = 0;
    
    
   
    public void multiplo(){
        contador = 0;
        for(int i = 0; i<longitud;i++){
            entrada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            if(entrada%divisor ==0){
                salida[contador] = entrada;
                contador++;
            }
        }
    }
    
    public int mayor(){
        mayor = salida [0];
        for(int i = 0; i<longitud;i++){
            if(salida[i]>mayor){
                mayor = salida [i];
            }
        }
        return mayor;
    }
    
    public int menor(){
        menor = salida [0];
        for(int i = 0; i<contador;i++){
            if(salida[i]<menor){
                menor = salida [i];
            }
        }
        return menor;
    }
    
    public double promedio(){
        for(int i = 0; i<contador;i++){
            suma += salida[i];
        }
        promedio = suma/contador;
        return promedio;
    }

    public void mayorQueProm(){
        int x =0;
        for(int i = 0; i<contador;i++){
            if(salida[i]>promedio){
                mayorPromedio[x] = salida [i];
                x++;
            }
        }
    }

    public int[] getMayorPromedio() {
        return mayorPromedio;
    }

    public void setMayorPromedio(int[] mayorPromedio) {
        this.mayorPromedio = mayorPromedio;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }
    
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public int[] getSalida() {
        return salida;
    }

    public void setSalida(int[] salida) {
        this.salida = salida;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    
    
    
    
}

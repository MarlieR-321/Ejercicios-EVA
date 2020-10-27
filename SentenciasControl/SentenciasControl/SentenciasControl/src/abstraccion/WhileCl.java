package abstraccion;

public class WhileCl {
    private String cad1;
    private double num1 = 0;
    private int contador = 0;
    private double total = 0;
    private double deuda = 950;
  
    
    
    public int numeroLetras(){
        int vocales = 0;
        contador =0;
        while(contador<(cad1.length())){
            if((cad1.charAt(contador) == 'a')||(cad1.charAt(contador) == 'e')||(cad1.charAt(contador) == 'i')||(cad1.charAt(contador) == 'o')||(cad1.charAt(contador) == 'u')||(cad1.charAt(contador) == 'A')||(cad1.charAt(contador) == 'E')||(cad1.charAt(contador) == 'I')||(cad1.charAt(contador) == 'O')||(cad1.charAt(contador) == 'U')){
                vocales++;
            }
            contador++;
        }
        cad1 = "";
        return vocales;
    }
    
    public double sumarDecimales(){
        total+=num1;
        return total;
    }
    
    public boolean perfecto(){
        total = 0;
        boolean p = false;
        contador = 1;
        
        while(contador<= num1/2){
            if(num1%contador == 0){
                total +=contador;
            }
            contador++;
        }
        if(total == num1){
            p = true;
        }
        
        return p;
    }
    
    public int sumarCalificaciones(){
        if(num1>=60){
            contador++;
        }
        return contador;
    }
    
    public int sumarCuotas(){
               
        if(deuda > 0){
            deuda -= num1;
            contador++;
        }
        return contador;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }
    
    
    public String getCad1() {
        return cad1;
    }

    public void setCad1(String cad1) {
        this.cad1 = cad1;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
}

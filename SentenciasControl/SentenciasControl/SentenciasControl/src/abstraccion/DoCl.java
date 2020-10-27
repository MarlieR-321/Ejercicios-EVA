package abstraccion;
import javax.swing.JOptionPane;

public class DoCl {
    private int num1;
    private int num2;
    private String cad1;
    private String cad2;
    private String cad3;
    private double promedio;
    private int contador;
    private int [] num3 = {0,1,1,2,3,5};

    public double promedioDesdeUno(){
        promedio = 0;
        contador = 1;
        do{
            promedio +=contador;
            ++contador;
        }
        while(contador <=num1);
        
        double entre;
        entre = num1;
        promedio = promedio/entre;
        
        return promedio;
    }
    
    public double promedioEntreDos(){
        contador = num1;
        promedio = 0;
        
        do{
           promedio +=  contador;
           ++contador;
        }
        while(contador<=num2);
        
        double entre = num2-num1+1;
        promedio = promedio/(entre);
        return promedio;
    }
    
    public String numeroCompuesto(){
        contador =2;
        do{
            if(num1%contador==0){
                cad1= "Es compuesto";
                break;
            }
            else{
                cad1 = "No es compuesto";
            }
            ++contador;
        }
        while(contador<num1);
        return cad1;
        }
        
    public String contrasena(){
        contador=0;
        cad2 = "abc.123";
      
        do{
            if(cad1.charAt(contador) == cad2.charAt(contador)){
                cad3 = "Contraseña Correcta";
            }
            else{
                cad3 = "Contraseña Incorrecta";
                break;
            }
            ++contador;
        }
        while(contador<=6);
        return cad3;
    }

    //suma de numero de impares desde 2 a 200
    public int sumasDesdeDos(){
        contador = 2;
        num1 = 0;
        do{
            if(contador %2==0){
                num1+= contador;
            }
            ++contador;
        }
        while(contador<=200);
        return num1;
    }
    //Fibonacci
    
    public String seisTerminos(){
        cad1 = "";
        int i =0;
        do{
            cad1 +=num3[i]+"\n";
            i++;
        }
        while(i <6);
        return cad1;
    }
    
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setCad1(String cad1) {
        this.cad1 = cad1;
    }

    public void setCad2(String cad2) {
        this.cad2 = cad2;
    }

    public void setCad3(String cad3) {
        this.cad3 = cad3;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    
    
    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getCad1() {
        return cad1;
    }
    
}

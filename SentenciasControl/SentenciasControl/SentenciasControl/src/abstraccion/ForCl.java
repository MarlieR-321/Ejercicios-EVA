package abstraccion;

import javax.swing.JOptionPane;

public class ForCl {
    private int num1;
    private int num2;
    private int num3;
    private int total;
    public String estado;
    public int num4[]={0,1,1,2,3,5};
    private double calificacion;
    

    public int UnoAN(){
        total = 0;
        for(int i=1;i<=num1;i++){
            total +=i;
        }
        return total;
    }
    
    public int cicloAEleccion(){
        total = 0;
        for(int i = num1;i<=num2;i++){
            total +=i;
        }
        return total;
    }
    
    public String numeroPrimo(){
        for(int i = 2;i<num1;i++){
            if(num1%i != 0){
                estado= "Es primo";
            }
            else{
                estado = "No es primo";
                break;
            }
        }
        return estado;
    }
    
    public double sumaDeCalificaciones(){
        double suma = 0;
        for(int i=1;i<=num1;i++){
             setCalificacion(Double.parseDouble(JOptionPane.showInputDialog(null,"Inserte un número",
                            "Ingresar",JOptionPane.QUESTION_MESSAGE)));
             suma +=calificacion;
        }
        
        double promedio = suma / num1;
        
        return promedio;
    }
    
    
    public int sumaPares(){
        total = 0;
        for(int i=0;i<=100;i++){
            if(i%2==0){
                total+=i;
            }
        }
        
        return total;
    }

    public String seisTerminos(){
        estado = "";
        for(int i =0;i<6;i++){
            estado +=num4[i]+"\n";
        }
        return estado;
    }
    
    //Primeros 6 terminos de la secuencia de Fibonacci
    /*
    public String Fibonacci(int i){
        estado ="";
        for(i=0;i<=6;i++){
            if(i<=0){
                num1= 0;
            }
            else{
                if(i==1){
                    num1= 1;
                }
                else{
                   num1= Integer.parseInt(Fibonacci(i-1)+Fibonacci(i-2)); 
                }
                estado+= num1+"\n";
            }
        }
        return estado;
    
    
    Lo intente, no entendi la formula, sorry
    
    }*/
    
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}

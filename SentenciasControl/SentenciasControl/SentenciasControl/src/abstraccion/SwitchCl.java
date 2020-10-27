package abstraccion;
import javax.swing.JOptionPane;

public class SwitchCl {
    private String mes;
    private String regresar = "";
    private String temporal = "";
    private int num1;
    public int sig;
    private double num2;
    private double raiz;
    private double num3;
    private double menor;
    private double total;
    private boolean op1;
    private boolean op2;
    private boolean op3;
    private double mientras;
    
    
    public int diaMes(){
        switch(mes){
                case "abril":
                case "junio":
                case "septiembre":
                case "noviembre":
                case "Abril":
                case "Junio":
                case "Septiembre":
                case "Noviembre":{
                    sig = 30;
                    break;
                }
                case "febrero":
                case "Febrero":{
                    sig = 28;
                    break;
                    }
                case "enero":
                case "marzo":
                case "mayo":
                case "julio":
                case "agosto":
                case "octubre":
                case "diciembre":
                case "Enero":
                case "Marzo":
                case "Mayo":
                case "Julio":
                case "Agosto":
                case "Octubre":
                case "Diciembre":{
                    sig = 31;
                    break;
                }
    }
        return sig;
    }
    
    public String epocaDeMes(){
        switch(num1){
                case 12:
                case 1:
                case 2:{
                    temporal = "Verano en Hemisferio Sur";
                    break;
                }
                case 3:
                case 4:
                case 5:{
                    temporal = "Es Ototño en el Hemisferio Sur";
                    break;
                }
                case 6:
                case 7:
                case 8:{
                    temporal = "Es invierno en el Hemisferio Sur";
                    break;
                }
                case 9:
                case 10:
                case 11:{
                    temporal = "Es primavera en el Hemisferio Sur";
                    break;
                }
                default:{
                    temporal = "Ingrese un número de mes valido";
                }
            }
        regresar = temporal;
        temporal = "";
        return regresar;
    }
    
    public int diaMesNumero(){
        sig = 0;
        switch(num1){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:{
                sig = 31;
                break;
                }
            case 2:{
                sig = 28;
                break;
                }
            case 4:
            case 6:
            case 9:
            case 11:{
                sig = 30;
                break;
                }
        }

        return sig;
    }
    
    public String operaciones(){
        regresar ="";

        switch(String.valueOf(op1)){
            
            case "true":{
                
                total = Math.sqrt(raiz);
                temporal = "La raiz cuadrada es: "+total+"\n";
                regresar += temporal;
                temporal = "";
                total = 0;
                break;
            }
        }
        
        switch(String.valueOf(op2)){
            case "true":{
                double residuo = num2 % num3;
                temporal = "El residuo es: "+residuo+"\n";
                regresar += temporal;
                temporal = "";
                residuo = 0;
                break;
            }
        }
        
        switch(String.valueOf(op3)){
            case "true":{
                setMientras(Double.parseDouble(JOptionPane.showInputDialog(null,"Inserte número",
                    "Menor",JOptionPane.INFORMATION_MESSAGE)));
                
                menor = mientras;
                
                
                for(int i =0;i<num1-1;i++){
                    
                    
                    String prueba = (JOptionPane.showInputDialog(null,"Inserte número","Menor",JOptionPane.INFORMATION_MESSAGE));
                    mientras = Double.parseDouble(prueba);
                   
                    
                    if(mientras<menor){
                        menor = mientras;
                    }
                }
                temporal = "El menor es: "+menor;
                regresar += temporal;
                temporal="";
            }
        }
        
        return regresar;
    }
    
    public String paresEImpares(){
        
        switch(num1%2){
            case 0:{
            temporal = "Es Par";
            break;
        }
            case 1: {
                temporal = "Es impar";
                break;
            }
        }
        regresar = temporal;
        temporal = "";
        return regresar;
    }

    public double getMientras() {
        return mientras;
    }

    public void setMientras(double mientras) {
        this.mientras = mientras;
    }

    public double getMenor() {
        return menor;
    }

    public void setMenor(double menor) {
        this.menor = menor;
    }
    

    public String getTemporal() {
        return temporal;
    }

    public void setTemporal(String temporal) {
        this.temporal = temporal;
    }

    public double getRaiz() {
        return raiz;
    }

    public void setRaiz(double raiz) {
        this.raiz = raiz;
    }

    
    public double getNum3(){
        return num3;
    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }

    public int getSig() {
        return sig;
    }

    public void setSig(int sig) {
        this.sig = sig;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getRegresar() {
        return regresar;
    }

    public void setRegresar(String regresar) {
        this.regresar = regresar;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public boolean getOp1() {
        return op1;
    }

    public void setOp1(boolean op1) {
        this.op1 = op1;
    }

    public boolean getOp2() {
        return op2;
    }

    public void setOp2(boolean op2) {
        this.op2 = op2;
    }

    public boolean getOp3() {
        return op3;
    }

    public void setOp3(boolean op3) {
        this.op3 = op3;
    }
    
    
}

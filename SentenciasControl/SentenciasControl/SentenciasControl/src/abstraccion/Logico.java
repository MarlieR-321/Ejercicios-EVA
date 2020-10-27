package abstraccion;

public class Logico {
    private double num1;
    private double num2;
    private char char1;
    private char char2;
    private String cad1;
    private String cad2;
    
    public boolean verificarNumerosIguales(){
        if(num1 == num2){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean mayorNumero(){
        if(num1 > num2){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean  menorNumero(){
        if(num1 < num2){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean mayorOIgual(){
        if(num1 >= num2){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean menorOIgual(){
        if(num1 <= num2){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean caracteresIguales(){
        if(char1 == char2){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean caracteresDiferentes(){
        if(char1 != char2){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean igualarCadenas(){
        if(cad1.equals(cad2)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean longitudCadenas(){
        if(cad1.length()<= cad2.length()){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean negativoOPositivo(){
        if(num1<0){
            return true;
        }
        else{
            return false;
        }
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public char getChar1() {
        return char1;
    }

    public void setChar1(char char1) {
        this.char1 = char1;
    }

    public char getChar2() {
        return char2;
    }

    public void setChar2(char char2) {
        this.char2 = char2;
    }

    public String getCad1() {
        return cad1;
    }

    public void setCad1(String cad1) {
        this.cad1 = cad1;
    }

    public String getCad2() {
        return cad2;
    }

    public void setCad2(String cad2) {
        this.cad2 = cad2;
    }
    
    
    
}

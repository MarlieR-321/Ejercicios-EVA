package abstraccion;

public class Aritmetico {
    private double num1;
    private double num2;
    private double num3;
    private double num4;
    private double num5;
    private double total;
    
    public boolean multiplos(){
        if(num1%num2==0){
            return true;
        }
        else{
            return false;
        }
    }

    public double expresionSParentesis(){
        
        total = num1 + num2 - num3*num4 / num5;
        return total;
    }
    
    public double expresionCParentesis(){
        
         total = (num1 + num2) * num3 - (num4 / num5);
        return total;
    }
    
    public double potenciaCuadrada(){
        total = Math.pow(num1, num2);
        return total;
    }
    
    public double expresionCPotencia(){
        total = Math.pow(num1, num2);
        total = total*num2/num3;
        return total;
    }

    
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
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

    public double getNum3() {
        return num3;
    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }

    public double getNum4() {
        return num4;
    }

    public void setNum4(double num4) {
        this.num4 = num4;
    }

    public double getNum5() {
        return num5;
    }

    public void setNum5(double num5) {
        this.num5 = num5;
    }
    
    
    
}

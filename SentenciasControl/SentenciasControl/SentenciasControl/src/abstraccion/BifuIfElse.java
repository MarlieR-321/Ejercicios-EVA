package abstraccion;
  
public class BifuIfElse {
    private boolean op1;
    private boolean op2;
    private boolean op3;
    private boolean op4;
    private double num1;
    private double num2;
    private double num3;
    private double num4;
    private double num5;
    private String ingreso;
    private String ultimo="";
    private String regresar = "";

    public String estadoCivil(){
        if(op1 == true){
              ultimo = "soltero";  
            }
            else{
                if(op2 == true){
                    ultimo = "casado";
                }
                else{
                    if(op3== true){
                        ultimo = "no especificado";
                    }
                }
            }
        regresar = ultimo;
        ultimo = "";
        return regresar;
    }
    
    public String viajes(){
        
        if(op1 == true){
            ultimo+=" Ometepe\n";
        }
        if(op2 == true){
            ultimo+="La Laguna de Apoyo\n";
        }
        if(op3 == true){
            ultimo+="Corn Island\n";
        }
        if(op4 == true){
            ultimo+="Rio San Juan\n";
        }
        regresar = ultimo;
        ultimo = "";
        return regresar;
    }
    
    public boolean opcion(){
        if(op1 == true){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean mayoriaDeEdad(){
        if(num1 <=21){
            return false;
        }
        else{
            return true;
        }
    }
    
    public String nota(){
        if(num1 >=60){
            return ultimo = "Aprobado";
        }
        else{
            return ultimo = "Reprobado";
        }
    }
    
    public boolean calificacionValida(){
        if(num1 >=0 && num1<=100){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean anoBisiesto(){
        if(num1 % 4 ==0){
            return true;
        }
        else{
            return false;
        }
    }

    public Double mayor(){
        
        if(num5<=num1){
               num5 = num1;
           }
        
        if(num5<=num2){
              num5 = num2;
           }
        
        if(num5<=num3){
              num5 = num3;
           }
        
        if(num5<=num4){
               num5 = num4;
           }
        return num5;
    }
    
    public int diasDeMes(){
        if(ingreso.equalsIgnoreCase("Enero")||ingreso.equalsIgnoreCase("Marzo")||ingreso.equalsIgnoreCase("Mayo")||ingreso.equalsIgnoreCase("Julio")||ingreso.equalsIgnoreCase("Agosto")||ingreso.equalsIgnoreCase("Octubre")||ingreso.equalsIgnoreCase("Diciembre")){
            return 31;
        }
        else{
            if(ingreso.equalsIgnoreCase("Febrero")){
                return 28;
            }
            else{
                return 30;
            }
        }
    }
    
    public String calificacionLetra(){
        if(ingreso.equalsIgnoreCase("E")){
             ultimo = "Excelente";
        }
        else{
            if(ingreso.equalsIgnoreCase("MB")){
                 ultimo ="Muy Bueno";
            }
            else{
                if(ingreso.equalsIgnoreCase("B")){
                     ultimo ="Bueno";
                }
                else{
                    if(ingreso.equalsIgnoreCase("D")){
                         ultimo ="Decente";
                    }
                }
            }
        }
        regresar = ultimo;
        ultimo = "";
        return regresar;
    }

    
    
    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    } 
    
    public double getNum5() {
        return num5;
    }

    public void setNum5(double num5) {
        this.num5 = num5;
    }

    public String getUltimo() {
        return ultimo;
    }

    public void setUltimo(String ultimo) {
        this.ultimo = ultimo;
    }

    public String getRegresar() {
        return regresar;
    }

    public void setRegresar(String regresar) {
        this.regresar = regresar;
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

    public boolean getOp4() {
        return op4;
    }

    public void setOp4(boolean op4) {
        this.op4 = op4;
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
}

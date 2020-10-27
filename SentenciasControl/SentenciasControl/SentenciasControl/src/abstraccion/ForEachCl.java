package abstraccion;

public class ForEachCl {
    private String[] nombres ={"Juan","María","Miguel","Susana"};
    private int[] arreglo ={5,8,3,7,9,0,3,2,1,4,6};
    private String regresar= "";
    
    public String cantidadDeLetras(){
        for(String numero:nombres){
            int cantidad = numero.length();
            regresar += numero+ "------------" + cantidad+"\n";
            
        }
        return regresar;
    }
    
    public int menorDeLosNum(){
        int menor = arreglo[0];
        
        for(int numero:arreglo){
            if(menor>numero){
                menor = numero;
            }
        }
        return menor;
    }
}

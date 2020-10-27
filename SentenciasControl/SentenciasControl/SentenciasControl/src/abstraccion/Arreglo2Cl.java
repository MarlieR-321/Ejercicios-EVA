package abstraccion;

public class Arreglo2Cl {
    private int A[][]={{10,15,20},{-3,12,4},{0,5,-4}};
    private int B[][]={{25,-5,10},{-10,21,54},{10,-55,-25}};
    private int K;
    private String salida;

    public String multEscalar(){
        salida = "";
        for(int i = 0;i<3;i++){
            salida += "{ ";
            for(int j = 0; j <3;j++){
                salida += K * A[i][j]+", ";
            }
            salida += " }, ";
        }
        
        return salida;
    }
    
    public String sumarMatrices(){
        salida = "";
        for(int i = 0; i < 3;i++){
            salida+="{ ";
            for(int j = 0; j<3;j++){
                salida += A[i][j] + B[i][j] + ", ";
            }
            salida+=" }";
        }
        return salida;
    }
    
    public int[][] getA() {
        return A;
    }

    public void setA(int[][] A) {
        this.A = A;
    }

    public int[][] getB() {
        return B;
    }

    public void setB(int[][] B) {
        this.B = B;
    }

    public int getK() {
        return K;
    }

    public void setK(int K) {
        this.K = K;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }
}

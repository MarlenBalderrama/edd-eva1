/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_5_paso_parametros;

/**
 *
 * @author marle
 */
public class EVA_1_5_PASO_PARAMETROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 5;
        System.out.println("Valor de i = " + i);
        incrementar(i);
        System.out.println("Valor de i (despues de incrementar) = " + i);
        //AHORA PASO POR REFERENCIA
        Prueba prueba= new Prueba();
        System.out.println("Valor de prueba.y = " + prueba.y);
        incrementarObj(prueba);
        System.out.println("Valor de prueba.y (despues de incrementar) = " + prueba.y);
        
    }//MAIN
        
    public static void incrementar (int valor){//PASO POR VALOR (RECIBO UNA COPIA)
    valor++;
    }//incrementar
    public static void incrementarObj (Prueba objeto){
    objeto.y++;
    }
    
}//FIN

class Prueba {
int y = 5;

}//class prueba
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_7_arreglos_size;

import java.util.Arrays;

/**
 *
 * @author marle
 */
public class EVA_1_7_ARREGLOS_SIZE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] original = new int [10]; {
                for (int i=0; i< original.length; i++) { //llenar con datos aleatorios
                original [i] = (int)(Math.random() *100);
                }
                for (int i=0; i<original.length; i++){//imprimir arreglo "modificado"
                    System.out.println("[" + original [i] + "]");
                                }
                System.out.println("");
                //CAMBIA EL TAMAÑO (NO SE PUEDE)
                //original = new int [5];//AQUI DESCONECTAMOS EL ARREGLO 10 Y LO REEMPLAZAMOS
                
                
                int[] copia= original; // COPIO LA DIRECCIÓN DEL ARREGLO ORIGINAL
               // original = Arrays.copyOf(original, 5);
                System.out.println(original);
                //TRANSFERIR LA INFORMACIÓN
                for (int i= 0; i < original.length; i++){
                original [i] = copia[i];
                }
                for (int i=0; i<original.length; i++){//imprimir arreglo "modificado"
                  System.out.println("[" + original [i] + "]");
                  
                    }//for
                }
    }//main
    
}//fin

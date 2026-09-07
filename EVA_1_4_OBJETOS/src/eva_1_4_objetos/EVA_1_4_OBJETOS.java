/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_4_objetos;

/**
 *
 * @author marle
 */
public class EVA_1_4_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prueba prueba = new Prueba();
        System.out.println(prueba);
        //ELIMINAR prueba:
        //Terminar el programa -->garbage collector (libera memoria automaticamente)
        //Eliminar "directamente" el objeto:
        prueba= null; //(una variable no tiene conexion) (el objeto queda huerfano)
              
    }//MAIN
}//FIN CLASS
    class Prueba{
      }


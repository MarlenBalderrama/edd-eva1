/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_12_primos;

/**
 *
 * @author marle
 */
public class EVA_1_12_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n2=90;
        int n=7;
        for (int i=2; i<= n -1; i++){
        
            if (n% i==0){
                System.out.println("no es primo");
                return ;
            }
        }
        System.out.println("es primo");
        return;
        
         
        /*for (int i=2; i<= sqrt(n2); i++){
        
            if (n% i==0){
                System.out.println("no es primo");
                return ;
            }
        }
        System.out.println("es primo");
        return;
        */
        
    }
    
}


        
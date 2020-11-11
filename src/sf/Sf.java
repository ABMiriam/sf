/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sf;
import java.util.Scanner;
/**
 *
 * @author vespertino
 */
public class Sf {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada= new Scanner(System.in);
    
    int numToros=0;
        int velocidad=0;
        int velocidadMaxima=0;
        
        System.out.println ("Introduce la información de toros y velocidades:");
        numToros=entrada.nextInt();
        
        while (numToros>0){
            
            for (int i=1; i<=numToros;i++){
                velocidad=entrada.nextInt();
                    if (velocidad>velocidadMaxima){
                    velocidadMaxima=velocidad;
                    }
                
            }
            
            System.out.println ("La velocidad máxima del corredor debe ser:"+ velocidadMaxima);
            velocidadMaxima=0;
            System.out.println ("Introduce la información de toros y velocidades:");
            numToros=entrada.nextInt();
        }
        
        
        System.out.println ("Fin del programa.");
    }//cierre1
    
}//cierre2

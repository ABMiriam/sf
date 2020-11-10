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
    
    int ntoros=0, velmax=0, veli=0, veli2=0, velocidadess=0;
   
    
    System.out.println ("¿Cuántos toros corrieron?");
    ntoros=entrada.nextInt();
    
    System.out.println ("Introduce las velocidades");
    //falta leer string de números e imprimir el resultado
    for (int i=0;i!=ntoros;i++){
    veli=entrada.nextInt();    
        if (veli>velmax){
            velmax=veli;
        }
    }
    
    System.out.println ("La velocidad máxima debe ser: "+velmax);
    }//cierre1
    
}//cierre2

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_califas;

import java.util.Scanner;

/**
 *
 * @author flac3
 */
public class EVA1_12_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //EVALUAR SI ACREDITAS (MAYOR O IGUAL A 70)
        //O NO ACREDITA (NA----)MENOR A 70)
       int califa;
       Scanner captu = new Scanner(System.in);
        System.out.println("califa");  
        califa = captu.nextInt();
        if (califa >=70)
           System.out.println("NA");
        else{
           System.out.println("acredita!!"); 
        }
        
        
        
        
    }
    
}

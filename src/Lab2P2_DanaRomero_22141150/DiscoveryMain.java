/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2P2_DanaRomero_22141150;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dana Romero
 */
public class DiscoveryMain {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        
        
        System.out.println("* * * R E G I S T R O  A N I M A L E S * * *");
        
        int opcion;
        
        do{
            System.out.println("---M E N Ú---");
            System.out.println("1 - Registrar\n2 - Eliminar\n3 - Editar");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("---Registrar---");
                    System.out.println("Ingrese nombre científico: ");
                    String nombreCient = leer.nextLine();
                    break;
                case 2:
                    break;
            }
            
        }while (opcion!=5);
    }
    
}

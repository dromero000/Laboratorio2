/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2P2_DanaRomero_22141150;

import java.util.Scanner;

/**
 *
 * @author Dana Romero
 */
public class DiscoveryMain {
    
    
    public static void main(String[] args) {
        AnimalApoyo proceso = new AnimalApoyo();
        Scanner leer = new Scanner (System.in);
        System.out.println("* * * R E G I S T R O  A N I M A L E S * * *");
        
        int opcion;
        
        do{
            System.out.println("---M E N Ú---");
            System.out.println("1 - Registrar\n2 - Eliminar\n3 - Editar\n4 - Ver Datos");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("---Registrar---");
                    proceso.registrar();
                    break;
                case 2:
                    proceso.eliminar();
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("---Alimentar---");
                    proceso.alimentar();
                    break;
                case 5:
                    System.out.println("---Ver Datos---");
                    System.out.println("1 - Imprimir por posición de la lista\n" +
                    "2 - Imprimir lista completa\n" +
                    "3 - Imprimir por nombre científico");
                    System.out.print("Seleccione una opción: ");
                    int opcion2=leer.nextInt();
                    switch (opcion2){
                        case 1:
                            proceso.imprimirPosicion();
                            break;
                        case 2:
                            proceso.imprimirTodos();
                            break;
                        case 3:
                            proceso.imprimirNomCien();
                            break;
                    }
                    break;
            }
            
        }while (opcion!=5);
    }
    
    


    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2P2_DanaRomero_22141150;

/**
 *
 * @author Dana Romero
 */
public class Animal {
    
    //Atributos
    String nombreCient,nombreComun, habitat, alimento, rasgos, distGeo;
    int vida;
    
    //Constructor
    public Animal(String nombreCient, String nombreComun, String habitat, String alimento, String rasgos, String distGeo, int vida){
        this.nombreCient=nombreCient;
        this.nombreComun = nombreComun;
        this.habitat = habitat;
        this.alimento = alimento;
        this.rasgos=rasgos;
        this.distGeo=distGeo;
        this.vida = vida;                
    }
    
    //Funciones
    
    //Función para imprimir los atributos
    public void imprimir(){
        System.out.println("[Nombre Científico: "+ nombreCient+", Nombre Común: "+ nombreComun+", Hábitat: "+
                habitat+", Alimentación: "+alimento+", Descripción de Rasgos: "+rasgos+", Distribución Geográfica: "+
                distGeo+", Vida: "+vida);
    }
    
    
    
}

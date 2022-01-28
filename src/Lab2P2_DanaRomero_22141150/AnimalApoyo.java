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
public class AnimalApoyo {
    Scanner leer = new Scanner (System.in);
    ArrayList<Animal> animalLista = new ArrayList<Animal>();
    
    //Constructor
    public AnimalApoyo(){
    animalLista.add(new Animal("Pionus Senilis", "Loro Corona Blanca","Bosques, plantaciones","Frutos y semillas","Tamaño medio, falta de plumaje alrededor de los ojos","Entre Panamá y México", 40));
    animalLista.add(new Animal("Ateles fusciceps", "Mono Araña de Cabeza Negra","Bosque húmedo tropical y subtropical ","Frutos, hojas tieranas y semillas","Mide 40 cm y pesa 9kg","Ecuador", 20));
    animalLista.add(new Animal("Litoria caerulea", "Rana arborícola de White","Aguas tranquilas ","Insectos y arañas","Mide 10 cm, color marrón y café","Noroeste Australia", 16));
    }
    
    

    
    //Función para registrar un nuevo animal
    public void registrar(){
        System.out.print("Ingrese nombre científico: ");
        String nombreCient = leer.nextLine();
        if (nombreUnico(nombreCient)==null){
            System.out.print("Ingrese nombre común: ");
            String nombreComun = leer.nextLine();
            System.out.print("Ingrese hábitat: ");
            String habitat = leer.nextLine();
            System.out.print("Ingrese alimentación: ");
            String alimento = leer.nextLine();
            System.out.print("Ingrese descripción de rasgos: ");
            String rasgos = leer.nextLine();
            System.out.print("Ingrese distribución geográfica: ");
            String distGeo = leer.nextLine();
            System.out.print("Ingrese vida: ");
            int vida=leer.nextInt();
            animalLista.add(new Animal(nombreCient, nombreComun, habitat, alimento, rasgos, distGeo, vida));
        }else{
            System.out.println("El nombre científico ingresado no es único. No se puede registrar");
        }
            
    }
    
    //Función para imprimir todos los datos de los animales
    public void imprimirPosicion(){
        System.out.print("La lista tiene "+animalLista.size()+" posiciones. Ingrese la posición a imprimir: ");
        int posicion = leer.nextInt();
        animalLista.get(posicion).imprimir();
    }
    
    //Función para imprimir lista completa
    public void imprimirTodos(){
        for(Animal animal: animalLista){
            animal.imprimir();
        }
    }
    
    //Función para imprimir por nombre Científico
    public void imprimirNomCien(){
        System.out.print("Ingrese el nombre científico: ");
        String nombreCient = leer.nextLine();
        Animal animal = nombreUnico(nombreCient);
        if (animal!=null){
            animal.imprimir();
        }else 
            System.out.println("El nombre ingresado no está registrado.");
        
    }
    
    //Función para verificar si ya existe un nombre Científico
    public Animal nombreUnico(String nombre){
        for(Animal animal: animalLista){
            if (animal.nombreCient.equals(nombre))
                //Retornar animal porque ya existe ese nombre
                return animal;
        }
        //Si no existe el nombre, retornar null
        return null;
    }
    
    //Función para poder elimiar un animal por su nombre científico
    public boolean eliminar(){
        System.out.println("Ingrese nombre científico a eliminar: ");
        String nombreCient=leer.nextLine();
        Animal animal = nombreUnico(nombreCient);
        if (animal!=null){
            animalLista.remove(animalLista.indexOf(animal));
            return true;
        }
        System.out.println("El nombre científico ingresado no esta registrado");
        return false;
    }
    
    //Función para editar
    
    //Función de alimentación
    public void alimentar(){
        System.out.print("Seleccione la posición del animal que se alimentará: ");
        int posicionA= leer.nextInt();
        System.out.println("Seleccione la posición del animal que será devorado: ");
        int posicionD= leer.nextInt();
        animalLista.get(posicionA).vida+=animalLista.get(posicionD).vida;
        animalLista.remove(posicionD);
    }
}

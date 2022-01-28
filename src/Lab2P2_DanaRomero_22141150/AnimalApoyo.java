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
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
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
        String nombreCient = leer.next();
        if (nombreUnico(nombreCient)==null){
            System.out.print("Ingrese nombre común: ");
            String nombreComun = leer.next();
            System.out.print("Ingrese hábitat: ");
            String habitat = leer.next();
            System.out.print("Ingrese alimentación: ");
            String alimento = leer.next();
            System.out.print("Ingrese descripción de rasgos: ");
            String rasgos = leer.next();
            System.out.print("Ingrese distribución geográfica: ");
            String distGeo = leer.next();
            int vida;
            do{
            System.out.print("Ingrese vida: ");
            vida=leer.nextInt();
            if (vida<=0)
                    System.out.println("El valor de vida debe ser mayor a 0. Intente de nuevo");
            }while(vida<=0);
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
        String nombreCient = leer.next();
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
        String nombreCient=leer.next();
        Animal animal = nombreUnico(nombreCient);
        if (animal!=null){
            animalLista.remove(animalLista.indexOf(animal));
            return true;
        }
        System.out.println("El nombre científico ingresado no está registrado");
        return false;
    }
    
    //Función para editar por atributo
    public void editarTodo(){
        System.out.println("Ingrese nombre científico a editar: ");
        String nombreCient=leer.next();
        Animal animal = nombreUnico(nombreCient);
        int posicion=animalLista.indexOf(animal);
        if (animal!=null){
            System.out.print("Ingrese nombre científico: ");
            animalLista.get(posicion).nombreCient=leer.next();
            System.out.print("Ingrese nombre común: ");
            animalLista.get(posicion).nombreComun= leer.next();
            System.out.print("Ingrese hábitat: ");
            animalLista.get(posicion).habitat= leer.next();
            System.out.print("Ingrese alimentación: ");
            animalLista.get(posicion).alimento= leer.next();
            System.out.print("Ingrese descripción de rasgos: ");
            animalLista.get(posicion).rasgos= leer.next();
            System.out.print("Ingrese distribución geográfica: ");
            animalLista.get(posicion).distGeo= leer.next();
            System.out.print("Ingrese vida: ");
            int vida =leer.nextInt();
            if (vida>0){
                animalLista.get(posicion).vida= vida;
            }else{
                System.out.println("Vida tiene que ser mayor que 0. El valor ingresado no será guardado");
            }
        }else{
            System.out.println("El nombre científico ingresado no existe");
        }
        

    }
    
    //Función para editar solo un atributo
    public void editarAtributo(){
        System.out.println("Ingrese nombre científico a editar: ");
        String nombreCient=leer.next();
        Animal animal = nombreUnico(nombreCient);
        int posicion=animalLista.indexOf(animal);
        if (animal!=null){
            System.out.println("Atributos:\n1 - Nombre Científico\n2 - Nombre Común\n3 - Hábitat\n4 - Alimentación\n5 - Descripción de Rasgos\n6 - Distribución Geográfica\n7 - Vida");
            System.out.print("Seleccionar una opción: ");
            int opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.print("Ingrese nombre científico: ");
                    animalLista.get(posicion).nombreCient= leer.next();
                    break;
                case 2:
                    System.out.print("Ingrese nombre común: ");
                    animalLista.get(posicion).nombreComun= leer.next();
                    break;
                case 3:
                    System.out.print("Ingrese hábitat: ");
                    animalLista.get(posicion).habitat= leer.next();
                    break;
                case 4:
                    System.out.print("Ingrese alimentación: ");
                    animalLista.get(posicion).alimento= leer.next();
                    break;
                case 5:
                    System.out.print("Ingrese descripción de rasgos: ");
                    animalLista.get(posicion).rasgos= leer.next();
                    break;
                case 6:
                    System.out.print("Ingrese distribución geográfica: ");
                    animalLista.get(posicion).distGeo= leer.next();
                    break;
                case 7:
                    System.out.print("Ingrese vida: ");
                    int vida =leer.nextInt();
                    if (vida>0){
                        animalLista.get(posicion).vida= vida;
                    }else{
                        System.out.println("Vida tiene que ser mayor que 0. El valor ingresado no será guardado");
                    }
                    break; 
            }
        }else{
            System.out.println("El nombre científico ingresado no existe");
        }
    }
    
    //Función de alimentación
    public void alimentar(){
        System.out.print("Seleccione la posición del animal que se alimentará: ");
        int posicionA= leer.nextInt();
        System.out.print("Seleccione la posición del animal que será devorado: ");
        int posicionD= leer.nextInt();
        animalLista.get(posicionA).vida+=animalLista.get(posicionD).vida;
        animalLista.remove(posicionD);
    }
    
}

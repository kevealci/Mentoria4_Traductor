package mentoria_4.Entidades;

import mentoria_4.Util.CrearOpciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Traductor {

    Diccionario diccionario;

    public Traductor() {
        iniciarTraductor();
    }

    private void iniciarTraductor(){
        diccionario = new Diccionario();
        ArrayList<Opcion> opciones = CrearOpciones.obtenerOpciones();
        Menu menu = new Menu(opciones);
        int opcion = 0;
        while(opcion != 4){
            menu.mostrarMenu();
            opcion = pedirOpcion();
            ejecutarOpcion(opcion);
        }
    }

    private int pedirOpcion(){
        Scanner scOpcion = new Scanner(System.in);
        System.out.print("Elegir una opción: ");
        int opcion = scOpcion.nextInt();
        //scOpcion.close();
        return opcion;
    }

    private void ejecutarOpcion(int opcion){
        switch (opcion) {
            case 1:
                String palabraSpanish = pedirPalabra("Español");
                String palabraEnglish = pedirPalabra("Inglés");
                diccionario.registrarPalabra(palabraSpanish, palabraEnglish);
                break;
            case 2:
                diccionario.consultarDiccionario();
                break;
            case 3:
                String palabraConsultar = pedirPalabra("Español");
                diccionario.consultarPalabra(palabraConsultar);
                break;
            case 4:
                opcion = 4;
                System.out.println("\nGracias por usar el traductor!");
                break;
            default:
                System.out.println("Elegir una opcion correcta");
        }
    }

    private String pedirPalabra(String idioma){
        Scanner scPalabra = new Scanner(System.in);
        System.out.print("\nIngrese palabra en " + idioma +": ");
        String palabra = scPalabra.next();
        //scPalabra.close();
        return palabra;
    }

}

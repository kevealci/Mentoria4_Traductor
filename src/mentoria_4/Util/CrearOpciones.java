package mentoria_4.Util;

import mentoria_4.Entidades.Opcion;

import java.util.ArrayList;

public class CrearOpciones {

  public static ArrayList<Opcion> obtenerOpciones(){

    ArrayList<Opcion> opciones = new ArrayList<Opcion>();

    Opcion opcion1 = new Opcion("1","Registrar palabra.");
    Opcion opcion2 = new Opcion("2","Consultar diccionario.");
    Opcion opcion3 = new Opcion("3","Consultar término.");
    Opcion opcion4 = new Opcion("4","Salir");

    opciones.add(opcion1);
    opciones.add(opcion2);
    opciones.add(opcion3);
    opciones.add(opcion4);

    return opciones;
  }

}

package mentoria_4.Test;

import mentoria_4.Util.CrearOpciones;
import mentoria_4.Entidades.Opcion;

import java.util.ArrayList;

public class CrearOpcionesTest {
  public static void main(String[] args) {
    ArrayList<Opcion> opciones = CrearOpciones.obtenerOpciones();
    opciones.forEach(System.out::println);
  }
}

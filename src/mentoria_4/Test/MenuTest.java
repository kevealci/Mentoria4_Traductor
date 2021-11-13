package mentoria_4.Test;

import mentoria_4.Entidades.Menu;
import mentoria_4.Entidades.Opcion;
import mentoria_4.Util.CrearOpciones;

import java.util.ArrayList;

public class MenuTest {
  public static void main(String[] args) {
    ArrayList<Opcion> opciones = CrearOpciones.obtenerOpciones();
    Menu menu = new Menu(opciones);
    menu.mostrarMenu();
  }
}

package mentoria_4.Entidades;

import java.util.ArrayList;

public class Menu {

  private ArrayList<Opcion> opciones;
  private String menu ="";

  public Menu(ArrayList<Opcion> opciones) {
    this.opciones = opciones;
  }

  public String getMenu() {
    return menu;
  }

  public void mostrarMenu(){
    System.out.println("\n----------Bienvenidos al Traductor----------");
    opciones.forEach(opcion -> System.out.println(opcion));
  }

}

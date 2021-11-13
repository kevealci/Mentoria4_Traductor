package mentoria_4.Test;

import mentoria_4.Entidades.Opcion;

public class OpcionTest {

  public static void main(String[] args) {
    Opcion opcion1 = new Opcion("1","Registrar palabra.");
    Opcion opcion2 = new Opcion("2","Consultar diccionario.");
    Opcion opcion3 = new Opcion("3","Consultar término.");
    Opcion opcion4 = new Opcion("Elegir una opcion: ");

    System.out.println(opcion1);
    System.out.println(opcion2);
    System.out.println(opcion3);
    System.out.println(opcion4);
  }
}

package mentoria_4.Test;

import mentoria_4.Entidades.Diccionario;

public class DiccionarioTest {
  public static void main(String[] args) {
    Diccionario diccionario = new Diccionario();
    System.out.println("\nConsultando el diccionario completo");
    diccionario.consultarDiccionario();
    System.out.println("\nProbando una palabra que si esta en el diccionario");
    diccionario.consultarPalabra("casa");
    System.out.println("\nProbando una palabra que no esta en el diccionario");
    diccionario.consultarPalabra("prueba");
    System.out.println("\nRegistrando nueva palabra");
    diccionario.registrarPalabra("ciudad","city");
    System.out.println("\nConsultando nueva palabra");
    diccionario.consultarPalabra("ciudad");
  }
}

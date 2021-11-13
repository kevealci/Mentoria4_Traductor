package mentoria_4.Entidades;

import mentoria_4.Util.Escritura;

public class Registrar {
  private String palabraSpanish;
  private String palabraEnglish;

  public Registrar(String palabraSpanish, String palabraEnglish) {
    this.palabraSpanish = palabraSpanish;
    this.palabraEnglish = palabraEnglish;
  }

  public void guardarPalabra(){
    Escritura.escribirArchivo(palabraSpanish,palabraEnglish);
    System.out.println("\nPalabra registrada!");
  }
}

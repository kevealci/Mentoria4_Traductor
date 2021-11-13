package mentoria_4.Entidades;

public class Opcion {

  private String opcion;
  private String numeroOpcion;

  public Opcion(String opcion ) {
    this.opcion=opcion;
  }

  public Opcion(String numeroOpcion, String opcion ) {
    this.opcion=opcion;
    this.numeroOpcion=numeroOpcion;
  }

  @Override
  public String toString() {
    return numeroOpcion + ".- "+ opcion;
  }
}


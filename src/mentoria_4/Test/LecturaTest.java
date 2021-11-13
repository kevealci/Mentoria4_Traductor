package mentoria_4.Test;

import mentoria_4.Util.Lectura;

import java.util.HashMap;

public class LecturaTest {
  public static void main(String[] args) {
    HashMap<String,String > diccionario = Lectura.leerArchivo();
    diccionario.forEach((key,value) -> System.out.println(key+"="+value));
  }
}

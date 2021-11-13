package mentoria_4.Entidades;

import java.util.HashMap;

public class Consultar {
  private String palabraSpanish;
  private HashMap<String,String> diccionario;

  public Consultar(HashMap<String,String> diccionario) {
    this.diccionario = diccionario;
  }

  public Consultar(String palabraSpanish, HashMap<String,String> diccionario) {
    this.palabraSpanish = palabraSpanish;
    this.diccionario = diccionario;
  }

  public void obtenerDiccionario(){
    if(diccionario.isEmpty()){
      System.out.println("\n---------------Diccionario Vacio---------------");
    }else{
      System.out.println("\n---------------Diccionario---------------");
      diccionario.forEach((key,value) -> System.out.println("Español: " + key.toLowerCase() + " - Inglés: " + value.toLowerCase()));
    }
  }

  public void obtenerPalabra(String palabraSpanish){
    if (diccionario.containsKey(palabraSpanish)){
      String palabraEnglish = diccionario.get(palabraSpanish);
      System.out.println("\nEspañol: " + palabraSpanish + " - Inglés: " + palabraEnglish);
    }else{
      System.out.println("\nLa palabra no se encuentra en el diccionario");
    }
  }
}

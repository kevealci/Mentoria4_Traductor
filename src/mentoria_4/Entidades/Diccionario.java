package mentoria_4.Entidades;

import mentoria_4.Util.Lectura;
import java.util.HashMap;

public class Diccionario {

  private HashMap<String,String> diccionario;

  public Diccionario() {
    iniciarDiccionario();
  }

  private void iniciarDiccionario(){
    diccionario = Lectura.leerArchivo();
  }

  public void registrarPalabra(String palabraSpanish, String palabraEnglish){
    diccionario.put(palabraSpanish,palabraEnglish);
    Registrar registro = new Registrar(palabraSpanish,palabraEnglish);
    registro.guardarPalabra();
  }

  public void consultarDiccionario(){
    Consultar consulta = new Consultar(diccionario);
    consulta.obtenerDiccionario();
  }

  public void consultarPalabra(String palabraSpanish){
    Consultar consulta = new Consultar(palabraSpanish,diccionario);
    consulta.obtenerPalabra(palabraSpanish);
  }
}

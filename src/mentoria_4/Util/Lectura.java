package mentoria_4.Util;

import java.io.*;
import java.util.HashMap;

public class Lectura {
  public static HashMap<String,String> leerArchivo(){
    File file = null;
    FileReader archivo = null;
    BufferedReader bufferedReader = null;
    String linea;
    String[] palabras;
    HashMap<String,String> diccionario = new HashMap<String,String>();
    try{
      file = new File("PersistenciaDeDatos/diccionario.txt");
      archivo = new FileReader(file);
      bufferedReader = new BufferedReader(archivo);
      while((linea = bufferedReader.readLine()) != null){
        palabras = linea.split(",");
        diccionario.put(palabras[0],palabras[1]);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }catch (IOException e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if (archivo != null) {
          archivo.close();
        }
      } catch (IOException e) {
        System.out.println(e.getMessage());
      }
    }
    return diccionario;
  }
}

package mentoria_4.Util;

import java.io.*;

public class Escritura{

  public static void escribirArchivo(String palabraSpanish, String palabraEnglish){
    File file = null;
    FileWriter archivo = null;
    BufferedWriter bufferedWriter = null;
    PrintWriter salida = null;
    try{
      file = new File("PersistenciaDeDatos/diccionario.txt");
      archivo = new FileWriter(file, true);
      bufferedWriter = new BufferedWriter(archivo);
      salida = new PrintWriter(bufferedWriter);
      salida.write(palabraSpanish + "," + palabraEnglish + "\n");
    }catch(IOException ex){
      System.out.println("Error: "+ex);
    }finally{
      try {
        salida.close();
        bufferedWriter.close();
        archivo.close();
      } catch (IOException e) {
        System.out.println("Error en el Finally con el Close(): "+ e);
      }
    }

  }

}

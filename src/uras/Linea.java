package uras;

import java.io.BufferedReader;
import java.io.FileReader;

public class Linea 
{
      public String lee (int n)
      {
        String [] mi_array = new String[3];
   try
      {
         FileReader fr = new FileReader("C:\\passwords/contraseñas.txt");
          BufferedReader br = new BufferedReader(fr);
          String texto = br.readLine();
          mi_array[0]=texto;
           texto = br.readLine();
          mi_array[1]=texto;
           texto = br.readLine();
          mi_array[2]=texto;

   br.close();
   
} 
catch(Exception e)

{ System.out.println("Error de lectura del fichero");}
        

     return mi_array[n];
  }
}
 

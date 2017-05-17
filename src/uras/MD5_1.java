package uras;


import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

public class MD5_1 {
    
     static String secretKey = "urasFerreteria"; //llave para encriptar datos
        
    /////////////////
    public String Encriptar(String texto) {
 
        String base64EncryptedString = "";
 
        try {
 
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
 
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher cipher = Cipher.getInstance("DESede");
            cipher.init(Cipher.ENCRYPT_MODE, key);
 
            byte[] plainTextBytes = texto.getBytes("utf-8");
            byte[] buf = cipher.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buf);
            base64EncryptedString = new String(base64Bytes);
 
            } 
        catch (Exception ex)
        {
            System.err.println("Error al Encriptar: "+ex.getMessage());
        }
        return base64EncryptedString;
    }
 
    public String Desencriptar(String textoEncriptado) throws Exception {
 
        String base64EncryptedString = "";
 
        try {
            byte[] message = Base64.decodeBase64(textoEncriptado.getBytes("utf-8"));
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
 
            Cipher decipher = Cipher.getInstance("DESede");
            decipher.init(Cipher.DECRYPT_MODE, key);
 
            byte[] plainText = decipher.doFinal(message);
 
            base64EncryptedString = new String(plainText, "UTF-8");
 
        } 
        catch (Exception ex)
        {
            System.err.println("Error Desencriptar: "+ex.getMessage());
        }
        return base64EncryptedString;
        
    }
    

     public static void main(String []arg)
        {
            try
            {
                MD5_1 crypto = new MD5_1();
                String encriptar = crypto.Encriptar("Prueba de encriptar");
                System.out.println("Encriptado: "+encriptar);
                String desencriptar = crypto.Desencriptar(encriptar);
                System.out.println("Desencriptado: "+desencriptar);
            }
            catch(Exception ex)
            {
                
            }
        }
}



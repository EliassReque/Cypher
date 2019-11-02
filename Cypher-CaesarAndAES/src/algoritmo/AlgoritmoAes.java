
package algoritmo;

import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class AlgoritmoAes {
    public static SecretKey keygenKeyGeneration(int keySize){
        SecretKey sKey = null;
        if(keySize == 128 || keySize == 192 || keySize == 256){
            try{
                KeyGenerator kgen = KeyGenerator.getInstance("AES");
                kgen.init(keySize);
                sKey = kgen.generateKey();
            
            }catch(NoSuchAlgorithmException e){
                System.out.println("Generador no disponible");
            
            }
        
        }
        return sKey;
    }
    
    //Otro metodo para encriptar ecb
    public static byte[] encryptData(SecretKey sKey, byte[] data){
        byte[] encryptedData = null;
        try{
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5padding");
            cipher.init(Cipher.ENCRYPT_MODE,sKey);
            encryptedData = cipher.doFinal(data);
            
        }catch(Exception ex){
            System.out.println("Error cifrando  los datos:" +ex);
        }
        return encryptedData;
    
    
    }
    //Otro metodo para desencriptar ecb
    public static byte[] deEncryptData(SecretKey sKey, byte[] data){
        byte[] encryptedData = null;
        try{
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5padding");
            cipher.init(Cipher.DECRYPT_MODE,sKey);
            encryptedData = cipher.doFinal(data);
            
        }catch(Exception ex){
            System.out.println("Error descifrando los datos..: " +ex);
        }
        return encryptedData;
    
    
    }
    //Convertir array bytes en hexadecimal
    public static String byteToHex(byte[] data){
        BigInteger bin = new BigInteger(1, data);
        return String.format("%0"+(data.length<<1) + "X",bin);
    }
    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                                 + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }
    
}

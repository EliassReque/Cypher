
package algoritmo;

import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class AlgoritmoAes {
    //Necesario para los métodos que usan CBC
    public static final byte[] IV_PARAM = {
        0x00, 0x01, 0x02, 0x03,
        0x04, 0x05, 0x06, 0x07,
        0x08, 0x09, 0x0A, 0x0B,
        0x0C, 0x0D, 0x0E, 0x0F
    };
    
    //Generador de keys para los métodos de ECB
    public static SecretKey keygenKeyGenerationEcb(int keySize){
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
     //Generador de keys para los métodos de CBC
    public static SecretKey keygenKeyGenerationCbc(int keySize) {
        SecretKey sKey = null;
        if (keySize == 128 || keySize == 192 || keySize == 256) {
            try {
                KeyGenerator kgen = KeyGenerator.getInstance("AES");
                kgen.init(keySize);
                sKey = kgen.generateKey();

            } catch (NoSuchAlgorithmException e) {
                System.out.println("Generador no disponible");

            }

        }
        return sKey;
    }
    //------------------------------------------------------------------------->
    //Encriptar cbc
    public static byte[] encryptDataCBC(SecretKey sKey, byte[] data) {
        byte[] encryptedData = null;
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            IvParameterSpec iv = new IvParameterSpec(IV_PARAM);
            cipher.init(Cipher.ENCRYPT_MODE, sKey, iv);
            encryptedData = cipher.doFinal(data);
        } catch (Exception ex) {
            System.err.println("Error cifrando los datos: " + ex);
        }
        return encryptedData;
    }
    //desencriptar cbc
    public static byte[] deCryptDataCBC(SecretKey sKey, byte[] data) {
        byte[] encryptedData = null;
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            IvParameterSpec iv = new IvParameterSpec(IV_PARAM);
            cipher.init(Cipher.DECRYPT_MODE, sKey, iv);
            encryptedData = cipher.doFinal(data);
        } catch (Exception ex) {
            System.err.println("Error descifrando, se está usando otra key" );
        } 
        return encryptedData;
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
            System.out.println("Error descifrando, se está usando otra key");
        }
        return encryptedData;
    
    
    }
    
    //------------------------------------------------------------------------->
    //Metodos de array bytes a hex y viceversa
    //Convertir array bytes en hexadecimal
    public static String byteToHex(byte[] data){
        BigInteger bin = new BigInteger(1, data);
        return String.format("%0"+(data.length<<1) + "X",bin);
    }
    //Convertir string hexadecimal a array bytes
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

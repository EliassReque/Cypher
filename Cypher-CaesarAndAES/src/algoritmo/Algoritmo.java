package algoritmo;

import java.util.ArrayList;

public class Algoritmo {
    //Cesar codificar
    public static String codificarCesar(String texto, int clave, String alfabeto) {
        char inputChar;
        int charValue;
        int newCharValue;
        texto = texto.toUpperCase();
        StringBuilder encriptado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            inputChar = texto.charAt(i);
            charValue = alfabeto.indexOf(inputChar);
            newCharValue = (charValue + clave) % alfabeto.length();
            encriptado.append(alfabeto.charAt(newCharValue));
        }
        return encriptado.toString();
    }
    //Cesar decodificar
    public static String deCodificarCesar(String texto, int clave, String alfabeto) {
        char inputChar;
        int charValue;
        int newCharValue;
        texto = texto.toUpperCase();
        StringBuilder encriptado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            inputChar = texto.charAt(i);
            charValue = alfabeto.indexOf(inputChar);
            newCharValue = (charValue - clave) % alfabeto.length();

            if (newCharValue < 0) {
                newCharValue += alfabeto.length();
            }

            encriptado.append(alfabeto.charAt(newCharValue));
        }
        return encriptado.toString();
    }
    //Cesar bruto
    public static ArrayList<String> deCodificarCesarBruto(String texto, String alfabeto) {
        char inputChar;
        int charValue;
        int newCharValue;
        texto = texto.toUpperCase();
        StringBuilder encriptado = new StringBuilder();
        ArrayList<String> resultado = new ArrayList<>();

        for (int clave = 1; clave < alfabeto.length(); clave++) {
            for (int i = 0; i < texto.length(); i++) {
                inputChar = texto.charAt(i);
                charValue = alfabeto.indexOf(inputChar);
                newCharValue = (charValue - clave) % alfabeto.length();

                if (newCharValue < 0) {
                    newCharValue += alfabeto.length();
                }

                encriptado.append(alfabeto.charAt(newCharValue));
            }
            resultado.add(encriptado.toString());
            encriptado.setLength(0);
        }
        return resultado;

    }
}

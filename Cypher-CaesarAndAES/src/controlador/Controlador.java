
package controlador;

import algoritmo.Algoritmo;
import algoritmo.AlgoritmoAes;
import cesarui.CesarGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import util.Alfabeto;
import util.CommandName;
import colors.Colors;
import java.nio.charset.StandardCharsets;
import javax.crypto.SecretKey;


public class Controlador implements ActionListener{
    
    private final CesarGUI userInterface;
    SecretKey sKey2 = AlgoritmoAes.keygenKeyGeneration(256);
    
    public Controlador(CesarGUI userInterface){
        this.userInterface = userInterface;
    }
    
    public static Controlador fromUserInterface(CesarGUI userInterface){
        return new Controlador(userInterface);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        CommandName comando = CommandName.valueOf(e.getActionCommand());

        if (comando == CommandName.CODIFICAR_BTN) {
            System.out.println(Colors.ANSI_YELLOW +"Se ha clicado boton de Codificar"+Colors.ANSI_RESET);
            codificarActionPerformed();
        } else if (comando == CommandName.DECODIFICAR_BTN) {
            System.out.println(Colors.ANSI_YELLOW + "Se ha clicado boton de Decodificar" + Colors.ANSI_RESET );
            // implementar
            decodificarActionPerformed();
        } else if (comando == CommandName.FUERZABRUTA_BTN){
            System.out.println(Colors.ANSI_YELLOW +"Se ha clicado boton de Fuerza Bruta" + Colors.ANSI_RESET );
            cesarBrutoActionPerformed();
        }else if(comando == CommandName.CODIFICARECB_BTN){
            System.out.println(Colors.ANSI_YELLOW +"Se ha clicado boton de Codificar ECB" + Colors.ANSI_RESET );
            codifEcbActionPerformed();
        }else if(comando == CommandName.DECODIFICARECB_BTN){
            System.out.println(Colors.ANSI_YELLOW +"Se ha clicado boton de Descodificar ECB" + Colors.ANSI_RESET );
            decodifEcbActionPerformed();
        }
    }

    private void codificarActionPerformed() {
        String texto = userInterface.getTxtAEntrada().getText();
        int clave = (int) userInterface.getjClave().getValue();
        int valorAlfabeto = userInterface.getSelAlfabeto().getSelectedIndex();
        String alfabeto = "";
        switch (valorAlfabeto) {
            case 0:
                alfabeto = Alfabeto.ENGLISH.toString();
                break;
            case 1:
                alfabeto = Alfabeto.CUSTOM.toString();
                break;
            case 2:
                System.out.println("Funciona combo3 codificar");;
                break;
            case 3:
                System.out.println("Funciona combo4 codificar");;
                break;    
        }
        String resultado = Algoritmo.codificarCesar(texto, clave, alfabeto);
        userInterface.getTxtAResultado().setText(resultado);
    }
    
    private void decodificarActionPerformed(){
        String texto = userInterface.getTxtAEntrada().getText();
        int clave = (int) userInterface.getjClave().getValue();
        int valorAlfabeto = userInterface.getSelAlfabeto().getSelectedIndex();
        String alfabeto = "";
        switch (valorAlfabeto) {
            case 0:
                alfabeto = Alfabeto.ENGLISH.toString();
                break;
            case 1:
                alfabeto = Alfabeto.CUSTOM.toString();
                break;
            case 2:
                System.out.println("Funciona combo3 decodificar");;
                break;
            case 3:
                System.out.println("Funciona combo4 decodificar");;
                break;    
        }
        String resultado2 = Algoritmo.deCodificarCesar(texto, clave, alfabeto);
        userInterface.getTxtAResultado().setText(resultado2);
    
    }
    
    private void cesarBrutoActionPerformed(){
        String texto = userInterface.getTxtAEntrada().getText();
        
        int valorAlfabeto = userInterface.getSelAlfabeto().getSelectedIndex();
        String alfabeto = "";
        switch (valorAlfabeto) {
            case 0:
                
                alfabeto = Alfabeto.ENGLISH.toString();
                break;
            case 1:
                
                alfabeto = Alfabeto.CUSTOM.toString();
                break;
        }
        String resultadoBruto = Algoritmo.deCodificarCesarBruto(texto, alfabeto).toString();
        
        userInterface.getTxtAResultado().setText(resultadoBruto);
    
    
    }
    
    private void codifEcbActionPerformed(){
        String texto = userInterface.getTxtAEntrada().getText();
        
        //Pasamos el mensaje a bytes
        byte[] dataMensaje = texto.getBytes(StandardCharsets.UTF_8);
        
       
        
        byte[] encriptado = AlgoritmoAes.encryptData(sKey2, dataMensaje);
        //System.out.println("Clave encriptada es: "+new String(encriptado));
        //System.out.println("Clave encriptada en hexadecimal: " + AlgoritmoAes.byteToHex(encriptado));
        
        //String resultadoBruto = Algoritmo.deCodificarCesarBruto(texto, alfabeto).toString();
        String resultadoEcb = AlgoritmoAes.byteToHex(encriptado);
        userInterface.getTxtAResultado().setText(resultadoEcb);
    
    }
    private void decodifEcbActionPerformed(){
        String texto = userInterface.getTxtAEntrada().getText();
        
        byte[] resultadoEcb = AlgoritmoAes.hexStringToByteArray(texto);
        byte[] desencriptado2 = AlgoritmoAes.deEncryptData(sKey2, resultadoEcb);
        
        userInterface.getTxtAResultado().setText(new String(desencriptado2));
    
    }
    
    
    
}

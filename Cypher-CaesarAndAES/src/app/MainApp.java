
package app;
import cesarui.CesarGUI;
import javax.swing.SwingUtilities;

//Ilyass Rezquellah-DAM 2
//Ultimo edit -->03/11/2019
public class MainApp {
     public static void main(String args[]) {
        SwingUtilities.invokeLater( new Runnable(){
            @Override
            public void run(){
                new CesarGUI().setVisible(true);
            }
        });

     }
}     

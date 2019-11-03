package cesarui;
import algoritmo.Algoritmo;
import util.Alfabeto;
import  controlador.Controlador;
import util.CommandName;
        

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CesarGUI extends javax.swing.JFrame {
    
    private Controlador controlador;

    public CesarGUI() {
        initComponents();
        myInitComponentes();
        initControlador();
    }
    
    private void myInitComponentes(){
        controlador = Controlador.fromUserInterface(this);
    }

    private void initControlador(){
        //Controlador boton codificar Cesar.
        btnCodificar.setActionCommand(CommandName.CODIFICAR_BTN.toString());
        btnCodificar.addActionListener(controlador);
        //Controlador boton descodificar Cesar
        btnDecodificar.setActionCommand(CommandName.DECODIFICAR_BTN.toString());
        btnDecodificar.addActionListener(controlador);
        //Controlador boton fuerza bruta Cesar
        btnFuerza.setActionCommand(CommandName.FUERZABRUTA_BTN.toString());
        btnFuerza.addActionListener(controlador);
        
        //Controlador boton codificar usando Algoritmo AES-ECB
        btnCodificarEcb.setActionCommand(CommandName.CODIFICARECB_BTN.toString());
        btnCodificarEcb.addActionListener(controlador);
        //Controlador boton descodificar usando Algoritmo AES-ECB
        btnDescodificarEcb.setActionCommand(CommandName.DECODIFICARECB_BTN.toString());
        btnDescodificarEcb.addActionListener(controlador);
        
        //Controlador boton codificar usando Algoritmo AES-CBC
        btnCodificarCbc.setActionCommand(CommandName.CODIFICARCBC_BTN.toString());
        btnCodificarCbc.addActionListener(controlador);
        //Controlador boton descodificar usando Algoritmo AES-CBC
        btnDecodificarCbc.setActionCommand(CommandName.DECODIFICARCBC_BTN.toString());
        btnDecodificarCbc.addActionListener(controlador);
        
    }

    public JSpinner getjClave() {
        return jClave;
    }

    public JComboBox<String> getSelAlfabeto() {
        
        return selAlfabeto;
    }

    public JTextArea getTxtAResultado() {
        return txtAResultado;
    }
 /*
    public JTextField getTxtFAlfabetoCustom() {
        return txtFAlfabetoCustom;
    }
*/
    public JTextArea getTxtAEntrada() {
        return txtAEntrada;
    }
 
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAEntrada = new javax.swing.JTextArea();
        selAlfabeto = new javax.swing.JComboBox<>();
        jClave = new javax.swing.JSpinner();
        btnCodificar = new javax.swing.JButton();
        btnDecodificar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAResultado = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnFuerza = new javax.swing.JButton();
        btnCodificarEcb = new javax.swing.JButton();
        btnDescodificarEcb = new javax.swing.JButton();
        btnCodificarCbc = new javax.swing.JButton();
        btnDecodificarCbc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAEntrada.setColumns(20);
        txtAEntrada.setRows(5);
        jScrollPane1.setViewportView(txtAEntrada);

        selAlfabeto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "Custom" }));

        btnCodificar.setText("Codificar");

        btnDecodificar.setText("Decodificar");

        txtAResultado.setColumns(20);
        txtAResultado.setRows(5);
        jScrollPane2.setViewportView(txtAResultado);

        jLabel1.setText("Ingresar texto:");

        jLabel2.setText("Resultado:");

        jLabel3.setText("Clave");

        jLabel4.setText("Alfabeto");

        btnFuerza.setText("Fuerza Bruta (no key)");

        btnCodificarEcb.setText("Codificar ECB");

        btnDescodificarEcb.setText("Descodificar ECB");

        btnCodificarCbc.setText("Codificar CBC");

        btnDecodificarCbc.setText("Descodificar CBC");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnCodificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDecodificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFuerza))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(124, 124, 124)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(selAlfabeto, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnCodificarEcb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDecodificarCbc)
                                    .addComponent(btnDescodificarEcb)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCodificarCbc))))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selAlfabeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCodificar)
                    .addComponent(btnDecodificar)
                    .addComponent(btnFuerza))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCodificarEcb)
                    .addComponent(btnDescodificarEcb))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCodificarCbc)
                    .addComponent(btnDecodificarCbc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCodificar;
    private javax.swing.JButton btnCodificarCbc;
    private javax.swing.JButton btnCodificarEcb;
    private javax.swing.JButton btnDecodificar;
    private javax.swing.JButton btnDecodificarCbc;
    private javax.swing.JButton btnDescodificarEcb;
    private javax.swing.JButton btnFuerza;
    private javax.swing.JSpinner jClave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> selAlfabeto;
    private javax.swing.JTextArea txtAEntrada;
    private javax.swing.JTextArea txtAResultado;
    // End of variables declaration//GEN-END:variables
}

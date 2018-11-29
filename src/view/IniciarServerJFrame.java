/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.net.ServerSocket;
import javax.swing.JTextField;
import model.Servidor;

/**
 *
 * @author willi
 */
public class IniciarServerJFrame extends javax.swing.JFrame {

    /**
     * Creates new form EntrarJFrame
     */
    public IniciarServerJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        iniciarJButton = new javax.swing.JButton();
        cancelarJButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        portaJTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat Cliente");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/LogoChat1.png")).getImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        iniciarJButton.setBackground(new java.awt.Color(0, 153, 102));
        iniciarJButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        iniciarJButton.setForeground(new java.awt.Color(255, 255, 255));
        iniciarJButton.setText("Iniciar");
        iniciarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarJButtonActionPerformed(evt);
            }
        });
        iniciarJButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                iniciarJButtonKeyPressed(evt);
            }
        });

        cancelarJButton.setBackground(new java.awt.Color(0, 153, 102));
        cancelarJButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cancelarJButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelarJButton.setText("Cancelar");
        cancelarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarJButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Configuração", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Porta*");

        portaJTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        portaJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                portaJTextFieldKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel10.setText("* Campo obrigatório");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(portaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(portaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Communication_100px_1.png"))); // NOI18N
        jLabel1.setText(" Chat : Servidor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(iniciarJButton)
                            .addGap(18, 18, 18)
                            .addComponent(cancelarJButton))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iniciarJButton)
                    .addComponent(cancelarJButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(448, 305));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarJButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelarJButtonActionPerformed

    private void portaJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_portaJTextFieldKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            iniciarJButton.requestFocus();
        }
    }//GEN-LAST:event_portaJTextFieldKeyPressed

    private void iniciarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarJButtonActionPerformed
        aguardarCon();
    }//GEN-LAST:event_iniciarJButtonActionPerformed

    private void iniciarJButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iniciarJButtonKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            aguardarCon();
        }
    }//GEN-LAST:event_iniciarJButtonKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarJButton;
    private javax.swing.JButton iniciarJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField portaJTextField;
    // End of variables declaration//GEN-END:variables

    public void aguardarCon() {

        if (portaJTextField.getText().isEmpty()) {
            MensagensClass.mensagem("Preencha o campo porta");
        } else if (ValidaNumero(portaJTextField)) {
            Servidor.setPortaServidor(Integer.parseInt(portaJTextField.getText()));
            if (iniciarServidor()) {
                try {
                    MensagensClass.mensagemInformacao("Por favor aguade a conexão com o cliente", "Aguarde");
                    Servidor.setConexao(Servidor.getServer().accept());
                    this.dispose();
                    ChatServidorJFrame chat = new ChatServidorJFrame();
                    chat.show();
                } catch (IOException ex) {
                    MensagensClass.mensagem("Erro ao iniciar servidor");
                } catch (NumberFormatException e) {
                    MensagensClass.mensagem("Digite apenas numeros no campo");
                }

            } else {
                MensagensClass.mensagem("Falha ao iniciar o servidor");
            }

        }
    }

    public boolean iniciarServidor() {
        try {
            Servidor.setServer(new ServerSocket(Servidor.getPortaServidor()));
            return true;
        } catch (IOException ex) {
            MensagensClass.mensagem("Impossivel iniciar o servidor");
            return false;
        }
    }

    public boolean ValidaNumero(JTextField Numero) {
        long valor;
        if (Numero.getText().length() != 0) {
            try {
                valor = Long.parseLong(Numero.getText());
                return true;
            } catch (NumberFormatException ex) {
                MensagensClass.mensagemInformacao("O campo porta só aceita números", "Informação");
                Numero.grabFocus();
                return false;
            }
        }
        return false;
    }
}

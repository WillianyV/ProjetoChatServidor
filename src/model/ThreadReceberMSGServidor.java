/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import view.MensagensClass;

/**
 *
 * @author willi
 */
public class ThreadReceberMSGServidor implements Runnable{

    private Scanner msgScanner;
    private JTextArea areaDeMSGJTextArea;
    int msgRecebidas = 0;
    JLabel contRecebidasjLabel;

    public ThreadReceberMSGServidor(Scanner msgScanner, JTextArea areaDeMSGJTextArea, JLabel contRecebidasjLabel) {
        this.msgScanner = msgScanner;
        this.areaDeMSGJTextArea = areaDeMSGJTextArea;
        this.contRecebidasjLabel = contRecebidasjLabel;  
        
    }
 
    @Override
    public void run() {
        String linha ;
        try {
            while(msgScanner.hasNext()){
                linha = msgScanner.nextLine();
                areaDeMSGJTextArea.append(linha + "\n");
                msgRecebidas+=1;
                contRecebidasjLabel.setText(msgRecebidas+"");
            }
            MensagensClass.mensagem("Cliente saiu da conversa!\nTente se conectar mais tarde.\nO sistema irá encerrar");
            Servidor.getConexao().close();
            System.exit(0);
            
        } catch (IOException ex) {
        }
    }
}

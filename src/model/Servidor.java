/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.net.ServerSocket;
import java.net.Socket;



/**
 *
 * @author willi
 */
public class Servidor {
    private static int portaServidor; 
    private static ServerSocket server;
    private static Socket conexao;
       
    public static int getPortaServidor() {
        return portaServidor;
    }

    public static void setPortaServidor(int portaServidor) {
        Servidor.portaServidor = portaServidor;
    }

    public static ServerSocket getServer() {
        return server;
    }

    public static void setServer(ServerSocket server) {
        Servidor.server = server;
    }

    public static Socket getConexao() {
        return conexao;
    }

    public static void setConexao(Socket conexao) {
        Servidor.conexao = conexao;
    }

    
}

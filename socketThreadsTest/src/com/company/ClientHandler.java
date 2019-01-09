package com.company;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler implements Runnable {
   Socket clientSocket;
   DataInputStream is = null;
   DataOutputStream os = null;
   String message = null;

   public ClientHandler(Socket clientSocket) {
       this.clientSocket = clientSocket;
   }

    @Override
    public void run() {
       try {
           is = new DataInputStream(clientSocket.getInputStream());
           os = new DataOutputStream(clientSocket.getOutputStream());

           while(true) {
               message = is.readUTF();
               os.writeUTF(message);
           }
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}

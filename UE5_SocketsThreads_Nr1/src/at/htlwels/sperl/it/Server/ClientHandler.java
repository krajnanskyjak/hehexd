package at.htlwels.sperl.it.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Property of Markus Sperl
 *
 * Kein Kopieren !
 * Nur Lernen !
 * */


public class ClientHandler implements Runnable {
    Socket client;

    public ClientHandler(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try (DataOutputStream os = new DataOutputStream(client.getOutputStream());
             DataInputStream is = new DataInputStream(client.getInputStream())) {

            String message = is.readUTF();
            System.out.println("Die empfangene Nachricht vom Client: " + message);

            os.writeUTF(message);
            System.out.println("Die Nachricht wurde wieder an den Client geschickt!");


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

package at.htlwels.sperl.it.Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Property of Markus Sperl
 *
 * Kein Kopieren !
 * Nur Lernen !
 * */


public class Client {
    public static void main(String[] args) {
        Socket mySocket = null;

        try {
            mySocket = new Socket("localhost", 5000);
            System.out.println("Socket erstellt");
        } catch (UnknownHostException e) {
            System.out.println("Unknown Host...");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream is = new DataInputStream(mySocket.getInputStream());
             DataOutputStream os = new DataOutputStream(mySocket.getOutputStream())) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Geben Sie die Nachricht ein:");
            String message = scanner.nextLine();
            scanner.close();

            os.writeUTF(message);
            System.out.println("Die Nachricht wurde zum Server gesendet!");


            System.out.println("Die empfangene Nachricht vom Server: " + is.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (mySocket != null) {
                try {
                    mySocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

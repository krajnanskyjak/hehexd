package at.htlwels.sperl.it.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Property of Markus Sperl
 *
 * Kein Kopieren !
 * Nur Lernen !
 * */


public class Server {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Socket client = null;

        try (ServerSocket serverSocket = new ServerSocket(5000)) {

            System.out.println("Server started");

            for (;;) {

                client = serverSocket.accept();

                System.out.println("Client connected");

                executorService.execute(new ClientHandler(client));

            }

        } catch (UnknownHostException e) {
            System.out.println("Unknown Host...");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (client != null) {
                try {
                    client.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

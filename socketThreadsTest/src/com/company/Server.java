package com.company;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    public static void main(String[] args) {
        String message;
        ExecutorService es = Executors.newCachedThreadPool();
	try(ServerSocket serverSocket = new ServerSocket(5000)) {
	    Socket clientSocket;


	    while(true) {
            clientSocket = serverSocket.accept();

            es.execute(new ClientHandler(clientSocket));
        }

    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}

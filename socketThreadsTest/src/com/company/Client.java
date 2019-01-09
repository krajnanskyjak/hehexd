package com.company;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Socket clientSocket = null;
        DataInputStream is = null;
        DataOutputStream os = null;
        String message;
        Scanner s;
        try {
            clientSocket = new Socket("localhost", 5000);
            is = new DataInputStream(clientSocket.getInputStream());
            os = new DataOutputStream(clientSocket.getOutputStream());

            while(true) {
                s = new Scanner(System.in);
                os.writeUTF(s.nextLine());

                message = is.readUTF();
                System.out.println(message);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } finally {
            if(clientSocket != null) {
                try {
                    clientSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }




    }
}

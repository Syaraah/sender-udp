package org.example.client;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class UDPSender {
    public void sendMessage() throws IOException {
        DatagramSocket socket = new DatagramSocket();

        String message = "Hello, Server!";
        byte[] buffer = message.getBytes();

        InetAddress address = InetAddress.getByName( "192.168.25.133");
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 12345);

        socket.send(packet);
        socket.receive(packet);

        System.out.println("Received: " + new String(packet.getData()));
        socket.close();
    }

}
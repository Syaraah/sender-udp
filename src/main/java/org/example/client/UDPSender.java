package org.example.client;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class UDPSender {
    public void sendMessage() throws IOException {
        DatagramSocket socket = new DatagramSocket();

        //Joystick
        String joystickMessage = "111010000000100000000000111100111001111100011000000000011110010101110000000000000000000000000000";
        byte[] joystickBuffer = joystickMessage.getBytes();
        InetAddress joystickAddress = InetAddress.getByName("192.168.225.133");
        DatagramPacket joystickPacket = new DatagramPacket(joystickBuffer, joystickBuffer.length, joystickAddress, 9876);
        socket.send(joystickPacket);

        //SystemTarget
        String systemTargetMessage = "1111110000001000000000000010110000110011110000000010000010000000110101111111010111110111000001111010101001001110010111001101001110011111110110000010111100100010001110010101010000110101001101010011010111001010";
        byte[] systemTargetBuffer = systemTargetMessage.getBytes();
        InetAddress systemTargetAddress = InetAddress.getByName( "192.168.225.133");
        DatagramPacket systemTargetPacket = new DatagramPacket(systemTargetBuffer, systemTargetBuffer.length, systemTargetAddress, 9876);
        socket.send(systemTargetPacket);

        System.out.println("Received: " + new String(packet.getData()));
        socket.close();
    }

}

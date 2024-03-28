package org.example;

import java.io.IOException;
import org.example.client.UDPSender;

public class Main {
    public static void main(String[] args) {
        try {
            UDPSender udpSender = new UDPSender();
            udpSender.sendMessage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
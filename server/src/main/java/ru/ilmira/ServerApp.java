package ru.ilmira;

public class ServerApp {
    public static void main(String[] args) throws InterruptedException {
        new NettyServer().start();
    }
}

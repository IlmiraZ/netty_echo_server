package ru.ilmira;

public class ClientApp {
    public static void main(String[] args) throws Exception {
        new NettyClient("localhost", 9000).run();
    }
}

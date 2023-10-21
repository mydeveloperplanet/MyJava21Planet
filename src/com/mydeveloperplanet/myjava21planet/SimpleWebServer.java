package com.mydeveloperplanet.myjava21planet;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.file.Path;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.SimpleFileServer;

public class SimpleWebServer {

    public static void main(String[] args) {
        startFileServer();
        customFileServerHandler();
    }

    private static void startFileServer() {
        System.out.println("""
                ********************************************
                * Simple Web Server start programmatically *
                ********************************************""");
        var server = SimpleFileServer.createFileServer(new InetSocketAddress(8080),
                Path.of("<absolute path to this directory>/MyJava21Planet/httpserver"),
                SimpleFileServer.OutputLevel.VERBOSE);
        server.start();
    }

    private static void customFileServerHandler() {
        System.out.println("""
                ******************************
                * Custom File Server Handler *
                ******************************""");
        try {
            var server = HttpServer.create(new InetSocketAddress(8081), 0);
            server.createContext("/custom", new MyHttpHandler());
            server.start();
        } catch (IOException ioe) {
            System.out.println("IOException occured");
        }
    }

}

class MyHttpHandler implements com.sun.net.httpserver.HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        if ("GET".equals(exchange.getRequestMethod())) {
            OutputStream outputStream = exchange.getResponseBody();
            String response = "It works!";
            exchange.sendResponseHeaders(200, response.length());
            outputStream.write(response.getBytes());
            outputStream.flush();
            outputStream.close();
        }
    }
}

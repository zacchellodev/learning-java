import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;

public class API {
  public static void main(String[] args) throws IOException {
    int port = 3000;
    HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
    server.createContext("/api/hello", (exchange -> {
      String resp = "Sup bro";
      exchange.sendResponseHeaders(200, resp.getBytes().length);
      OutputStream output = exchange.getResponseBody();
      output.write(resp.getBytes());
      output.flush();
      exchange.close();
    }));
    server.setExecutor(null);
    server.start();
    System.out.println("Server running!");
  }
}

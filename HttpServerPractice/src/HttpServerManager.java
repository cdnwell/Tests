import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HttpServerManager {
    private final String DEFAULT_HOSTANME = "0.0.0.0";
    private final int DEFAULT_PORT = 8050;
    private final int DEFAULT_BACKLOG = 0;
    private HttpServer server;

    /**
     * 생성자
     * @throws IOException
     */
    public HttpServerManager() throws IOException {
        createServer(DEFAULT_HOSTANME, DEFAULT_PORT);
    }
    public HttpServerManager(int port) throws IOException {
        createServer(DEFAULT_HOSTANME, port);
    }
    public HttpServerManager(String host, int port) throws IOException {
        createServer(host, port);
    }

    /**
     * 서버 생성
     * @param host 호스트 이름
     * @param port 포트 번호
     * @throws IOException
     */
    private void createServer(String host, int port) throws IOException {
        // HTTP Server 생성
        this.server = HttpServer.create(new InetSocketAddress(host, port), DEFAULT_BACKLOG);
        server.createContext("/", new RootHandler());
    }

    /**
     * 서버 실행
     */
    public void start() {
        server.start();
    }

    /**
     * 서버 중지
     * @param delay
     */
    public void stop(int delay) {
        server.stop(delay);
    }

    public static void main(String[] args) {
        HttpServerManager httpServerManager = null;

        try {
            System.out.printf(
                    "[%s][HTTP SERVER][START]%n"
                    , new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
            );

            httpServerManager = new HttpServerManager("localhost", 3000);
            httpServerManager.start();

            Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.printf(
                    "[%s][HTTP SERVER][STOP]%n"
                    , new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
            )));

            System.out.print("Please press 'Enter' to stop the server.");
            System.in.read();

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            // 종료
            httpServerManager.stop(0);
        }

    }

}
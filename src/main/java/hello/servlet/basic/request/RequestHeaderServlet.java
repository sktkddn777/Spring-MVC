package hello.servlet.basic.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "requestHeaderServlet", urlPatterns = "/request-header")
public class RequestHeaderServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        printStartLine(req);
        printHeaders(req);
    }

    private void printHeaders(HttpServletRequest req) {
        System.out.println("---HEADER - start ---");
        req.getHeaderNames().asIterator()
                .forEachRemaining(headerName -> System.out.println(headerName + ": " + req.getHeader(headerName)));
        System.out.println("---HEADER - end ---");
        System.out.println();
    }

    private void printStartLine(HttpServletRequest req) {
        System.out.println("--- REQUEST-LINE - start ---");
        System.out.println("request.getMethod() = " + req.getMethod()); //GET
        System.out.println("request.getProtocol() = " + req.getProtocol()); //HTTP/1.1
        System.out.println("request.getScheme() = " + req.getScheme()); // http://localhost:8080/request-header
        System.out.println("request.getRequestURL() = " + req.getRequestURL());// /request-header
        System.out.println("request.getRequestURI() = " + req.getRequestURI());//username=hi
        System.out.println("request.getQueryString() = " + req.getQueryString());
        System.out.println("request.isSecure() = " + req.isSecure()); //https 사용 유무
        System.out.println("--- REQUEST-LINE - end ---");
        System.out.println();
    }

    // host 이름, 쿠키 정보, 언어 등등의 정보도 조회할 수 있다.
}

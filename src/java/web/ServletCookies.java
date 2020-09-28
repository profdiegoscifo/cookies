package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletCookies", urlPatterns = {"/servlet-cookies"})
public class ServletCookies extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();

        PrintWriter printWriter = response.getWriter();
        if (cookies == null || cookies.length == 0) {
            printWriter.println("No hay cookies asignadas...");
        } else {
            for (Cookie cookie : cookies) {
                System.out.println(cookie.getName().concat(" => ").concat(cookie.getValue()));
                printWriter.println(cookie.getName().concat(" => ").concat(cookie.getValue()));
            }

        }

    }

}

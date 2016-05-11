package project.SkyLights;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Hashtable;

/**
 * Created by lewis on 5/9/16.
 */
@WebServlet(name = "ServletSky", urlPatterns = "/SkyTime")
public class ServletSky extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Hashtable<String, SkyBean01> skymap = new Hashtable<>();
        SkyBean01 sky1 = new SkyBean01();
        SkyBean01 sky2 = new SkyBean01();
        SkyBean01 sky3 = new SkyBean01();
        SkyBean01 sky4 = new SkyBean01();
        skymap.putIfAbsent("signapore", sky1 );
        skymap.putIfAbsent("weisbaten", sky2 );
        skymap.putIfAbsent("cayman", sky3 );
        skymap.putIfAbsent("paris", sky4 );
        request.setAttribute("skymap", skymap);
        request.getRequestDispatcher("/SkyType.jsp").forward(request,response);
        System.out.println(skymap.get("paris").getMorningSky());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 doPost(request, response);

    }

}

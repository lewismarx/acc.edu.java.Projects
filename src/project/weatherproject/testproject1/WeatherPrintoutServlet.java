package project.weatherproject.testproject1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by lewis on 5/9/16.
 */
@WebServlet(name = "WeatherPrintoutServlet", urlPatterns = "/Information")
public class WeatherPrintoutServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    RegionBean regionBean = new RegionBean(68, 72, 66);
    ArrayList<Integer> temperaturewest = new ArrayList<Integer>();
        ArrayList<Integer> temperaturereal = new ArrayList<Integer>();
        ArrayList<ArrayList> arraylist = new ArrayList<ArrayList>();


        temperaturewest.add(regionBean.westCoast.getMorningWeather());
        temperaturereal.add(regionBean.realCoast.getNoonWeather());
        arraylist.add(temperaturereal);
        arraylist.add(temperaturewest);
        request.setAttribute("templist", arraylist);



        request.getRequestDispatcher("/DataOutput.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request, response);
    }
}

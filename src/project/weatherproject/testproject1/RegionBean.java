package project.weatherproject.testproject1; /**
 *
 */

import java.io.Serializable;
import java.util.Random;

/**
 * @param eastCoast
 * @param westCoast
 * @param realCoast
 * @author lewis
 */
public class RegionBean implements Serializable {
    /**
     *
     */
    Random ran = new Random();
    int morningWeather = ran.nextInt(34) + 40;
    int noonWeather = ran.nextInt(60) + 40;
    int eveningWeather = ran.nextInt(20) + 40;
    WeatherBean eastCoast = new WeatherBean();
    WeatherBean westCoast = new WeatherBean();
    WeatherBean realCoast = new WeatherBean();


    public RegionBean() {
       Random ran = new Random();
        WeatherBean eastCoast = new WeatherBean(ran.nextInt(34) + 40, ran.nextInt(60) + 40, ran.nextInt(20) + 40);
        WeatherBean westCoast = new WeatherBean(ran.nextInt(34) + 40, ran.nextInt(60) + 40, ran.nextInt(20) + 40);
        WeatherBean realCoast = new WeatherBean(ran.nextInt(34) + 40, ran.nextInt(60) + 40, ran.nextInt(20) + 40);

    }

    public RegionBean(int eastCoast, int westCoast, int realCoast) {
        Random ran = new Random();

        this.eastCoast = new WeatherBean(ran.nextInt(34) + eastCoast, ran.nextInt(60) + eastCoast, ran.nextInt(20) + eastCoast);
        this.westCoast = new WeatherBean(ran.nextInt(34) + westCoast, ran.nextInt(60) + westCoast, ran.nextInt(20) + westCoast);
        this.realCoast = new WeatherBean(ran.nextInt(34) + realCoast, ran.nextInt(60) + realCoast, ran.nextInt(20) + realCoast);

    }

    public int getMorningWeather() {
        return morningWeather;
    }

    public void setMorningWeather(int morningWeather) {
        this.morningWeather = morningWeather;
    }

    public int getNoonWeather() {
        return noonWeather;
    }

    public void setNoonWeather(int noonWeather) {
        this.noonWeather = noonWeather;
    }

    public int getEveningWeather() {
        return eveningWeather;
    }

    public void setEveningWeather(int eveningWeather) {
        this.eveningWeather = eveningWeather;
    }
}

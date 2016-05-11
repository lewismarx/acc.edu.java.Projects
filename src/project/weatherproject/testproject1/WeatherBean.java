package project.weatherproject.testproject1;

import java.io.Serializable;

public class WeatherBean implements Serializable {


    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private int morningWeather;
    private int noonWeather;
    private int eveningWeather;

    public WeatherBean() {
        this.morningWeather = 0;
        this.noonWeather = 0;
        this.eveningWeather = 0;
    }

    public WeatherBean(int morningWeather, int noonWeather, int eveningWeather) {
        this.morningWeather = morningWeather;
        this.noonWeather = noonWeather;
        this.eveningWeather = eveningWeather;
    }

    /**
     * @return the morningWeather
     */
    public final int getMorningWeather() {
        return morningWeather;
    }

    /**
     * @param morningWeather the morningWeather to set
     */
    public void setMorningWeather(int morningWeather) {
        this.morningWeather = morningWeather;
    }

    /**
     * @return the noonWeather
     */
    public final int getNoonWeather() {
        return noonWeather;
    }

    /**
     * @param noonWeather the noonWeather to set
     */
    public void setNoonWeather(int noonWeather) {
        this.noonWeather = noonWeather;
    }

    /**
     * @return the eveningWeather
     */
    public final int getEveningWeather() {
        return eveningWeather;
    }

    /**
     * @param eveningWeather the eveningWeather to set
     */
    public void setEveningWeather(int eveningWeather) {
        this.eveningWeather = eveningWeather;
    }


}

	
	
	
	
	


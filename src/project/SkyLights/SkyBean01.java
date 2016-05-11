package project.SkyLights;

import java.util.Random;

/**
 * Created by lewis on 5/9/16.
 */
public class SkyBean01 {
    enum CLOUDS {cirrus, cirrostratus, cirrocumulus, altostratus, altocumulus, nimbostratus, cumulus, stratus, cumulonimbus, stratocumulus}


    private CLOUDS morningSky;
    private CLOUDS noonSky;
    private CLOUDS nightSky;

    public SkyBean01() {
        this.morningSky = randomnum();
        this.noonSky = randomnum();
        this.nightSky = randomnum();
    }

    public SkyBean01(CLOUDS morningSky, CLOUDS noonSky, CLOUDS nightSky) {
        this.morningSky = morningSky;
        this.nightSky = nightSky;
        this.noonSky = noonSky;

    }

    private CLOUDS randomnum() {
    Random ran = new Random();
        CLOUDS[] listcloud = CLOUDS.values();
                 int numval = ran.nextInt(CLOUDS.values().length);
        switch(numval) {
            case 1:
                return listcloud[0];

            case 2:
                return listcloud[1];
            case 3:
                return listcloud[2];
            case 4:
                return listcloud[3];
            case 5:
                return listcloud[4];
            case 6:
                return listcloud[5];
            case 7:
                return listcloud[6];
            case 8:
                return listcloud[7];
            case 9:
                return listcloud[8];
            case 10:
                return listcloud[9];
        }
    return null;



    }



    public CLOUDS getMorningSky() {
        return morningSky;
    }

    public void setMorningSky(CLOUDS morningSky) {
        this.morningSky = morningSky;
    }

    public CLOUDS getNoonSky() {
        return noonSky;
    }

    public void setNoonSky(CLOUDS noonSky) {
        this.noonSky = noonSky;
    }

    public CLOUDS getNightSky() {
        return nightSky;
    }

    public void setNightSky(CLOUDS nightSky) {
        this.nightSky = nightSky;
    }
}












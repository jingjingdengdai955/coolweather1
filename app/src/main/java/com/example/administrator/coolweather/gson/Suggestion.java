package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Admin
 * @version $Rev$
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDes ${TODO}
 */
public class Suggestion {
    @SerializedName("comf")
    public Comfort confort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;

    private class Comfort {
        @SerializedName("txt")
        public String info;
    }

    private class CarWash {
        @SerializedName("txt")
        public String info;
    }

    private class Sport {
        @SerializedName("txt")
        public String info;
    }
}

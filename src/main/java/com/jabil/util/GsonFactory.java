package com.jabil.util;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonFactory {
    private GsonFactory(){}

    /**
     *
     * @return
     */
    public static Gson getDefaultDateFormatGson(){
        return new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
    }

    public static Gson getDefaultDateTimeFormatGson(){
        return new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
    }

    /**
     *
     * @return
     */
    public static Gson getDefaultTimeFormatGson(){ return new GsonBuilder().setDateFormat("HH:mm:ss").create();}

    /**
     *
     * @return
     */
    public static Gson getYearMonthFormatGson(){
        return new GsonBuilder().setDateFormat("yyyy-MM").create();
    }
}

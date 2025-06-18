package com.example.lib;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Sample {

    public static void main(String[] args){
     //   position = 53806
    //    progressBar = {Rect@36642} "Rect(23, 20 - 679, 28)"
    //    scrubPosition = 981505
       System.out.println(formattedTime(2345760));
       System.out.println(  formattedTime(876084));
    }
    public static String formattedTime(long millis) {
        if (millis < 1) {
            return "00:00:00";
        }
        return String.format(Locale.getDefault(), "%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(millis), TimeUnit.MILLISECONDS.toMinutes(millis) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)), TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
    }
}

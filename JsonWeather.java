package sk.kosickaakademia.regex.json;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class JsonWeather {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            Reader reader = new FileReader("C:\\Git\\projectRegex\\resource\\weather.json");
            JSONObject jsonObject = (JSONObject)parser.parse(reader);

            JSONObject main = (JSONObject) jsonObject.get("main");
            System.out.println(main);

            Double temp = (Double) main.get("temp");
            System.out.println("Teplota: " + (temp-273.15)+ " °C");

            Long pressure = (Long) main.get("pressure");
            System.out.println("Tlak: " + (pressure)+" hPa");

            Long humidity = (Long) main.get("humidity");
            System.out.println("Vlhkost: " + (humidity)+ " %");

            Long visibility = (Long) jsonObject.get("visibility");
            System.out.println("Viditelnost: " + (visibility)+" m");

            JSONObject sys = (JSONObject) jsonObject.get("sys");
            Long sunrise = (Long) sys.get("sunrise");
            Long sunset = (Long) sys.get("sunset");
            System.out.println(sunrise);
            System.out.println(sunset);
            sunriseAndSunset(sunrise,sunset);


        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (ParseException e){
            e.printStackTrace();
        }
    }

    public static void sunriseAndSunset(Long sunrise, Long sunset){
        //vychod slnka
        while (sunrise>(24*3600)){
            sunrise = sunrise - (24*3600);
        }
        int hour = (int)(sunrise/3600);
        sunrise = sunrise - hour*3600;
        int minute = (int)(sunrise/60);
        System.out.println("Vychod: " + hour + ":" + minute);
        //zapad slnka
        while (sunset>(24*3600)){
            sunset = sunset - (24*3600);
        }
        hour = (int)(sunset/3600);
        sunset = sunset - hour*3600;
        minute = (int)(sunset/60);
        System.out.println("Zapad: " + hour + ":" + minute);
    }
}

package enums_practice;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        //Color enum
        Color color1 = Color.BLUE;
        System.out.println("\n" + color1 + "\n");

        // Calling values()
        Color[] colorValue = Color.values();

        // enum with loop
        for (Color col : colorValue) {
            // Calling ordinal() to find index
            System.out.println(col + " at index " + col.ordinal());
        }

        //Getting the weather
        Day weather = new Day(Days.MONDAY);
        System.out.println();
        System.out.println(weather.currentDaysWeather(weather.getCurrentDay()));




        //**************************************************************************
        //Vehicle Enums
        Ford ford = Ford.MUSTANG;
        GMC gmc = GMC.YUKON;

    }




    //Declaring vehicle enums inside a class
    enum Ford {
        MUSTANG,
        F150,
        F250,
        ESCAPE,
        BRONCO
    }
    enum GMC {
        SIERRA,
        YUKON,
        ACADIA,
        TERRAIN
    }
}

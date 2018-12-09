import java.util.ArrayList;

public class SolarSystem {

    private final String SYSTEM_NAME;
    private final double STAR_BRIGHTNESS;
    ArrayList<String> planetList = new ArrayList<>(); //Setting up an array list for storing planet objects.

    public SolarSystem(String name, double luminosity){//System constructor.
        this.SYSTEM_NAME = name;
        this.STAR_BRIGHTNESS = luminosity;
    }

    public void addPlanet(String name, double mass, double distance){//Adding a planet object.
        //planets.add(new Planets(name, mass, distance));
        Planets planet = new Planets(name, mass, distance);
        planet.ishabitable(mass, distance, STAR_BRIGHTNESS ); //Running a method to check if the planet is habitable.
        planetList.add(planet.toString());
    }


    public String toString() {//Converting the value from HEX to a readable String.
        String outputString;

        outputString = SYSTEM_NAME + "\n";

        for(String i : planetList){//Going through each element of the array list.
            outputString = outputString + i;//Concatenating the element to the String that is going to be outputted.
            outputString = outputString + "\n";
        }
            return outputString;

    }
}

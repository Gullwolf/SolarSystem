import java.util.ArrayList;

public class SolarSystem {

    private String systemName;
    private double starBrightness;
    ArrayList<String> planetList = new ArrayList<>();

    public SolarSystem(String name, double luminosity){
        this.systemName = name;
        this.starBrightness = luminosity;
    }

    public void addPlanet(String name, double mass, double distance){
        //planets.add(new Planets(name, mass, distance));
        Planets planet = new Planets(name, mass, distance);
        planet.ishabitable(mass, distance, starBrightness );
        planetList.add(planet.toString());
    }


    public String toString() {//Converting the value from HEX to a readable String.
        String temp;

        temp = systemName + "\n";
        for(int i = 0; i >= planetList.size(); i++) {
            temp = temp + planetList.get(i) + "\n";
        }
            return temp;

    }
}

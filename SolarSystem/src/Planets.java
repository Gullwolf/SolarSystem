import java.text.DecimalFormat;

public class Planets {

    private final String PLANET_NAME;
    private final double PLANET_MASS;
    private final double PLANET_DISTANCE;
    private final double ORBIT_PERIOD_DOUBLE;
    private String habitable;

    DecimalFormat df = new DecimalFormat("0.0##");//Setting up the format for the decimal numbers.

    public Planets(String name, double mass, double distance){//Planet constructor.
        this.PLANET_NAME = name;
        this.PLANET_MASS = mass;
        this.PLANET_DISTANCE = distance;
        ORBIT_PERIOD_DOUBLE = calculateOrbit(PLANET_DISTANCE);
    }

    public double calculateOrbit(double planetDistance){//Calculating orbit period.
        return Math.sqrt(planetDistance*planetDistance*planetDistance);
    }

    public void ishabitable(double planetMass, double planetDistance, double luminosity){//The is habitable method.
        double distanceCalculationMin;
        double distanceCalculationMax;

        distanceCalculationMin = 0.75 * Math.sqrt(luminosity);
        distanceCalculationMax = 2 * Math.sqrt(luminosity);

        if (planetMass >= 0.6 && planetMass <= 7.0 && planetDistance >= distanceCalculationMin && planetDistance <= distanceCalculationMax){
            habitable = "yes";
        }else{
            habitable = "no";
        }

    }

    public String toString() {//Converting the value from HEX to a readable String.
        return "Planet " + PLANET_NAME + " has a mass of " + PLANET_MASS + " Earths, is "+ PLANET_DISTANCE + "AU from its star, and orbits in " + df.format(ORBIT_PERIOD_DOUBLE) + " years: could be habitable? " + habitable;
    }

}

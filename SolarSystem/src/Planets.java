import java.text.DecimalFormat;

public class Planets {

    private String planetName;
    private double planetMass;
    private double planetDistance;
    private double orbitPeriodDouble;
    private String habitable;

    DecimalFormat df = new DecimalFormat("#.###");

    public Planets(String name, double mass, double distance){
        this.planetName = name;
        this.planetMass = mass;
        this.planetDistance = distance;
        orbitPeriodDouble = calculateOrbit(planetDistance);
    }

    public double calculateOrbit(double planetDistance){
        return Math.sqrt(planetDistance*planetDistance*planetDistance);
    }

    public void ishabitable(double planetMass, double planetDistance, double luminosity){
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
        return "Planet " + planetName + " has a mass of " + planetMass + " Earths, is "+ planetDistance + "AU from its star, and orbits in " + df.format(orbitPeriodDouble) + " years: could be habitable? " + habitable + "\n";
    }

}

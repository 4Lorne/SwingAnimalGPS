package Model;

import java.util.ArrayList;

public class Penguin extends Species{
    //Variables
    private double bloodPressure;

    //Constructor
    public Penguin(){

    }
    public Penguin(String name, String gender, int weight, Coordinates coordinates, double bloodPressure){
        super(name,gender,coordinates,weight);
        this.bloodPressure = bloodPressure;
    }

    //Getter
    public double getBloodPressure() {
        return bloodPressure;
    }

    //Setter
    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + String.format("""
                Blood Pressure: %.1f
                GPS Positions:
                %s
                -------------------
                """,getBloodPressure(),super.getCoordinates());
    }
}

package test;

import java.util.*;


public class Vehicles {

    
    public static void main(String[] args) {
        HashMap<String,Car> DMV = new HashMap<String,Car>();
        Car subaru = new Car(2010, "Subaru", "Impreza WRX");
        DMV.put(subaru.getVIN(), subaru);
        System.out.println(DMV.get(subaru.getVIN()).getVIN());
    }

}

class Car{

    /**
     * static factory method to replace the current constructor.
     * @return a new instance of Car
     */
    public static Car registerCar(){
        return null;
    }

    public Car(int year, String make, String model) {
        this.VIN = setVIN();
        this.year = year;
        this.make = make;
        this.model = model;
    }
    private final String VIN;
    private int year;
    private String make;
    private String model;

    /**
     * @return the VIN
     */
    public String getVIN() {
        return VIN;
    }

    /**
     * generates a random VIN number for the vehicle
     */
    private String setVIN() {
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(rand.nextInt(11));
        }
        String choice = "ABCDEFGHIGKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < 3; i++){
            char a = choice.charAt(rand.nextInt(choice.length()+1));
            sb.append(a);
        }
        return sb.toString();
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else throw new IllegalArgumentException();
    }

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof Car && o != null){
            if (((Car)o).getVIN().equals(this.getVIN())){
                return true;
            }
            else return false;
        } else return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + (this.VIN != null ? this.VIN.hashCode() : 0);
        return hash;
    }

}
public class Plant {

    private final String name;
    private final double heightMeter;

    // Konstruktor
    public Plant (String name, double heightMeter){
        this.name = name;
        this.heightMeter = heightMeter;
    }

    // Getters
    public String getName(){
        return name;
    }

    public double getHeightMeter(){
        return heightMeter;
    }
}



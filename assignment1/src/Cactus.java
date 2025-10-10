// Ärver från superklassen Plant
// Implementerar interfacet Waterable

public class Cactus extends Plant implements Waterable{

    public Cactus(String name, double heightMeter){
        super(name, heightMeter);
    }

    // Växten beräknar sitt vätskebehov genom att overridea metoden från interfacet
    @Override
    public double getFluidAmount(){
        return 0.02;
    }

    // Växten anger vilken vätsketyp den behöver genom att overridea metoden från interfacet
    @Override
    public String getFluidType(){
        return "Mineralvatten";
    }

}

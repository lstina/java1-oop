// Ärver från superklassen Plant
// Implementerar interfacet Waterable

public class Carnivorous extends Plant implements Waterable {

    public Carnivorous(String name, double heightMeter){
        super(name, heightMeter);
    }

    // Växten beräknar sitt vätskebehov genom att overridea metoden från interfacet
    @Override
    public double getFluidAmount(){
        return 0.1 + (0.2 * getHeightMeter());
    }

    // Växten anger vilken vätsketyp den behöver genom att overridea metoden från interfacet
    @Override
    public String getFluidType(){
        return "Proteindryck";
    }

}

// Ärver från superklassen Plant
// Implementerar interfacet Waterable

public class Palm extends Plant implements Waterable{

    public Palm(String name, double heightMeter){
        super(name, heightMeter);
    }

    // Växten beräknar sitt vätskebehov genom att overridea metoden från interfacet
    @Override
    public double getFluidAmount(){
        return 0.5 * getHeightMeter();
    }

    // Växten anger vilken vätsketyp den behöver genom att overridea metoden från interfacet
    @Override
    public String getFluidType(){
        return "Kranvatten";
    }
}
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Waterable> plantList = new ArrayList<>();
                plantList.add(new Palm("Laura", 5.0));
                plantList.add(new Palm("Olof", 1.0));
                plantList.add(new Cactus("Igge", 0.2));
                plantList.add(new Carnivorous("Meatloaf", 0.7));

        String userInputName = JOptionPane.showInputDialog(null, "Vilken växt ska få vätska?");
        Waterable selectedPlant = null;

        for (Waterable plantObject : plantList){
            Plant currentPlant = (Plant) plantObject;
            if (currentPlant.getName().equalsIgnoreCase(userInputName)){
                selectedPlant = plantObject;
                break;
            }
        }

        if (selectedPlant != null){
            Plant plantDetails  = (Plant) selectedPlant;
            JOptionPane.showMessageDialog(null, "Växten " + plantDetails.getName() + " behöver " + selectedPlant.getFluidAmount() + " liter " + selectedPlant.getFluidType() + ".");
        } else {
            JOptionPane.showMessageDialog(null, "Ingen växt hittades");
        }
    }
}




import java.io.File;

/**
Class for individual minerals and SuperTrumps
 */
public class Mineral {
    String name;
    int hardness;
    int specificGravity;
    String cleavage;
    String crustalAbundance;
    String economicValue;
    Boolean superTrump;
    public void Info(){
        System.out.println("Mineral Information\nName:"+name+"\nHardness: "+hardness+
                "\nCleavage: " + cleavage + "\nCrustal Abundance: "+crustalAbundance+"\nEconomic Value: "+economicValue);
    }

    public Mineral(int i, Boolean superTrump) {

    }
}

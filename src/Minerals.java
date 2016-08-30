/**
 * Created by Rich on 29-08-16.
 */
public class Minerals {
    String name;
    int hardness;
    int specificGravity;
    String cleavage;
    String crustalAbundance;
    String economicValue;
    public void Info(){
        System.out.println("Mineral Information\nName:"+name+"\nHardness: "+hardness+
                "\nCleavage: " + cleavage + "\nCrustal Abundance: "+crustalAbundance+"\nEconomic Value: "+economicValue);
    }
}

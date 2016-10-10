/**
 * Created by Rich on 04-10-16.
 */
public class STCard {
    private int id;
    private String cardType;
    private String title;
    private String chemistry;
    private String classification;
    private String occurrence;
    private int hardness;
    private int specificGravity;
    private int cleavage;
    private int crustalAbudance;
    private int economicValue;

    public STCard(int id,String fileName, String imageName,
                  String cardType, String title, String chemistry,
                  String classification, String occurrence,
                  int hardness, int specificGravity,
                  int cleavage, int crustalAbundance, int economicValue){
        this.id = id;
        this.cardType = cardType;
        this.title = title;
        this.chemistry = chemistry;
        this.classification = classification;
        this.occurrence = occurrence;
        this.hardness = hardness;
        this.specificGravity = specificGravity;
        this.cleavage = cleavage;
        this. crustalAbudance = crustalAbundance;
        this.economicValue = economicValue;



    }
    public String toString(){
        return "id="+id;
    }
}

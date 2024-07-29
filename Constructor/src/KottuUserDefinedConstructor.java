public class KottuUserDefinedConstructor {

    public String type;
    public String spicy_level;
    public String portion_size;

    public String generatedKottu(){
        return this.type + this.spicy_level+ this.portion_size;
    }
    KottuUserDefinedConstructor(String kottuType, String spicy,String size){
        this.type=kottuType;
        this.spicy_level=spicy;
        this.portion_size=size;
    }

    public static void main(String[]args){
        KottuUserDefinedConstructor kottu=new KottuUserDefinedConstructor("egg","high","large");
        System.out.println(kottu.generatedKottu());

    }
}

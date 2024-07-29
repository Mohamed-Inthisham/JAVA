public class KottuDefaultConstructor {

    public String type ="Chicken Kottu";
    public String spicy_level= "Too Spicy";
    public String portion_size="Large";

    public String generatedKottu(){
        return this.type+ this.spicy_level+this.portion_size;
    }

    KottuDefaultConstructor(){
        System.out.println("default constructor");
    }

    public static void main(String[] args){
        KottuDefaultConstructor kottu= new KottuDefaultConstructor();
            System.out.println(kottu.generatedKottu());
    }


}

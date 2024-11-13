package inheritanceCat;

public class CatFamily {
    private String animalName;
    private int ears;
    private int legs;
    private boolean bigClaws;
    private String consumedFood;


    public CatFamily(String animalName, int ears, int legs, boolean bigClaws,String consumedFood) {
        this.animalName = animalName;
        this.ears = ears;
        this.legs = legs;
        this.bigClaws = bigClaws;
        this.consumedFood = consumedFood;
    }

    public void showInfo(){
        if (bigClaws){
            System.out.println(animalName+"\nkolichestvo ushey:"+ ears+"\nkolichestvo lap:"+ legs+"\nnalichie bolshix kogtey:"+"имеется"+"\nkushayu "+consumedFood);
        }else {
            System.out.println(animalName+"\nkolichestvo ushey:"+ ears+"\nkolichestvo lap:"+ legs+"\nnalichie bolshix kogtey:"+"нету"+"\nkushayu "+consumedFood);
        }
    }
    public void setBigClaws(boolean bigClaws){
        this.bigClaws = bigClaws;
    }
    public void setAnimalName(String animalName){
        this.animalName = animalName;
    }
    public void eat(){
        System.out.println("Kushayu");
    }
}

package inheritanceCat;

public class Cat extends CatFamily{
    public Cat(){
        super("Koshkaa",2,4,false,"Viskas");
    }
    @Override
    public void eat(){
        super.eat(); System.out.println("viskas");
    }
}

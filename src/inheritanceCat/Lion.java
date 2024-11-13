package inheritanceCat;

public class Lion extends CatFamily {
    public Lion(){

        super("Lev",2,4,true,"Oleney");
    }

    @Override
    public void eat() {
        super.eat(); System.out.println("oleney");
    }
}

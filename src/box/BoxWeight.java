package box;

public class BoxWeight extends Box{
    private int weight;

    public BoxWeight(){
        super(2,3,5);
    }

    public BoxWeight(int height, int width, int length, int weight) {
        super(height, width, length);
        this.weight = weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("ves:"+weight);
    }
}

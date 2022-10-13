package AbstractClasses;

public abstract class Bird extends Animal{
    public final int flightHeight;

    public Bird(int height, int weight, String colorEyes, int flightHeight) {
        super(height, weight, colorEyes);
        this.flightHeight = flightHeight;
    }

    public void flight(){
        System.out.printf("Я лечу на %d метрах", this.flightHeight);
    }

    @Override
    public void voice() {
        super.voice();
    }

    @Override
    public void showInfo() {
        }

}

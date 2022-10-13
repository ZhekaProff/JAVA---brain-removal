package Animals;

import AbstractClasses.Bird;

public class Hen extends Bird {
    public Hen(int height, int weight, String colorEyes, int flightHeight) {
        super(height, weight, colorEyes, flightHeight);
    }

    @Override
    public void voice() {
        System.out.println("Co co co co");
    }

    @Override
    public void showInfo() {
        System.out.println("\nHen");
        System.out.printf("Eyes color: %s\n", this.colorEyes);
        System.out.printf("Height: %s\n", this.height);
        System.out.printf("Weight: %.3d\n", this.weight);
        System.out.printf("Flight's height: %s\n", this.flightHeight);
    }
}

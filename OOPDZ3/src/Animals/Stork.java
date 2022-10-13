package Animals;

import AbstractClasses.Bird;

public class Stork extends Bird {
    public Stork(int height, int weight, String colorEyes, int flightHeight) {
        super(height, weight, colorEyes, flightHeight);
    }

    @Override
    public void voice() {
        System.out.println("Glack glack");
    }

    @Override
    public void showInfo() {
        System.out.println("\nStork");
        System.out.printf("Eyes color: %s\n", this.colorEyes);
        System.out.printf("Height: %s\n", this.height);
        System.out.printf("Weight: %.3d\n", this.weight);
        System.out.printf("Flight's height: %s\n", this.flightHeight);
    }
}

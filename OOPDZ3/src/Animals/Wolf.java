package Animals;

import AbstractClasses.WildAnimal;

public class Wolf extends WildAnimal {
    boolean lieder;

    public Wolf(int height, double weight, String colorEyes, String habitat, String dateOfLocation, boolean lider) {
        super(height, weight, colorEyes, habitat, dateOfLocation);
        this.lieder = lider;
    }

    public boolean getLieder() {
        return lieder;
    }
}

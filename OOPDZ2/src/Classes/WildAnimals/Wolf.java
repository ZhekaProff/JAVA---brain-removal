package Classes.WildAnimals;

public class Wolf extends WildAnimal{
    String lieder;

    public Wolf(int height, int weight, String colorEyes, String habitat, String dateOfLocation, String lider) {
        super(height, weight, colorEyes, habitat, dateOfLocation);
        this.lieder = lider;
    }

    public String getLieder() {
        return lieder;
    }
}

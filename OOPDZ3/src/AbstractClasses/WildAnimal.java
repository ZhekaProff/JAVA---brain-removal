package AbstractClasses;

public class WildAnimal extends Animal {
    String habitat; // Место обитания
    String dateOfLocation; // Дата находждения

    public WildAnimal(int height, double weight, String colorEyes, String habitat, String dateOfLocation) {
        super(height, weight, colorEyes);
        this.habitat = habitat;
        this.dateOfLocation = dateOfLocation;
    }
}

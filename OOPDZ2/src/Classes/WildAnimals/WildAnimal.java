package Classes.WildAnimals;

import Classes.Animal;

public abstract class WildAnimal extends Animal {
    String habitat; // Место обитания
    String dateOfLocation; // Дата находждения

    public WildAnimal(int height, int weight, String colorEyes, String habitat, String dateOfLocation) {
        super(height, weight, colorEyes);
        this.habitat = habitat;
        this.dateOfLocation = dateOfLocation;
    }
}

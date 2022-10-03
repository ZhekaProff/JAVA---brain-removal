package Classes.HomeAnimals;

import Classes.Animal;

public abstract class HomeAnimals extends Animal {
    String name;
    String breed; // порода
    public String vaccinations; // наличие прививок
    String dateOfBirth; // дата рождения

    public HomeAnimals(int height, int weight, String colorEyes, String name, String breed, String vaccinations, String dateOfBirth) {
        super(height, weight, colorEyes);
        this.name = name;
        this.breed = breed;
        this.vaccinations = vaccinations;
        this.dateOfBirth = dateOfBirth;
    }
    public void laska(){
        System.out.println("Проявляет ласку");
    }
}

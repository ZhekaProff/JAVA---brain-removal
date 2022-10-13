package AbstractClasses;

public abstract class HomeAnimals extends Animal{
    public String name;
    public String breed; // порода
    public boolean vaccinations; // наличие прививок
    public String dateOfBirth; // дата рождения

    public HomeAnimals(int height, double weight, String colorEyes, String name, String breed, boolean vaccinations, String dateOfBirth) {
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

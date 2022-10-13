package Animals;

import AbstractClasses.HomeAnimals;

public class Cat extends HomeAnimals {
    boolean presenceOfWool; // наличие шерсти

    public Cat(int height, double weight, String colorEyes, String name, String breed, boolean vaccinations, String dateOfBirth, String cat, boolean presenceOfWool) {
        super(height, weight, colorEyes, name, breed, vaccinations, dateOfBirth);
        this.presenceOfWool = presenceOfWool;
    }

    @Override
    public void voice() {
        System.out.println("Мяу, мяу");
    }

    @Override
    public void showInfo() {
        System.out.printf("Рост: %d\nВес: %f\nЦвет глаз: %s\nКличка: %s\nПорода: %s\nПривит: %b\nДата рождения: %s\nШерсть: %s\n\n"
                , height, weight, colorEyes, name, breed, vaccinations, dateOfBirth, presenceOfWool);
    }


    @Override
    public String toString() {
        return String.format("В этой клетеке сидит кошка %s", name);
    }

}

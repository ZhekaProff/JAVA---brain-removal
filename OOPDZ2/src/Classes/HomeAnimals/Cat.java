package Classes.HomeAnimals;

import Classes.Animal;
import Classes.Interfeses.IAnimals;

public class Cat extends HomeAnimals implements IAnimals {
    String presenceOfWool; // наличие шерсти

    public Cat(int height, int weight, String colorEyes, String name, String breed, String vaccinations, String dateOfBirth, String presenceOfWool) {
        super(height, weight, colorEyes, name, breed, vaccinations, dateOfBirth);
        this.presenceOfWool = presenceOfWool;
    }

    @Override
    public void voice() {
        System.out.println("Мяу, мяу");
    }

    @Override
    public void showInfo() {
        System.out.printf("Рост: %d\nВес: %d\nЦвет глаз: %s\nКличка: %s\nПорода: %s\nПривит: %s\nДата рождения: %s\nШерсть: %s\n\n"
                , height, weight, colorEyes, name, breed, vaccinations, dateOfBirth,presenceOfWool);
    }

    @Override
    public String toString() {
        return String.format("В этой клетеке сидит кошка %s", name);
    }
}

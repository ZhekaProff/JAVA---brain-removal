package Animals;

import AbstractClasses.HomeAnimals;

public class Dog extends HomeAnimals {
    private boolean training; // Наличие дресировки

    public Dog(int height, double weight, String colorEyes, String name, String breed, boolean vaccinations, String dateOfBirth, String dog, boolean training) {
        super(height, weight, colorEyes, name, breed, vaccinations, dateOfBirth);
        this.training = training;
    }

    public boolean getTraining(){return this.training;}

    public final void toTrain(boolean toTrain){
        if(this.training){
            System.out.printf(" Dog with name %s already trained!!!", this.name);
        }else
            this.training = toTrain;
    }

    @Override
    public void showInfo() {
        System.out.printf("Рост: %d\nВес: %f\nЦвет глаз: %s\nКличка: %s\nПорода: %b\nПривит: %s\nДата рождения: %s\nДресирован: %b\n\n"
                , height, weight, colorEyes, name, breed, vaccinations, dateOfBirth, training);
    }

    @Override
    public void voice() {
        System.out.println("Гав гав!");
    }

    @Override
    public String toString() {
        return String.format("В этой клетеке сидит собока %s", name);
    }
}

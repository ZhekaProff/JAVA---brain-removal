package Classes.HomeAnimals;

public class Dog extends HomeAnimals {
    private String training; // Наличие дресировки

    public Dog(int height, int weight, String colorEyes, String name, String breed, String vaccinations, String dateOfBirth, String training) {
        super(height, weight, colorEyes, name, breed, vaccinations, dateOfBirth);
        this.training = training;
    }

    public String getTraining() {
        return training;
    }
    public void setTraining(String qwe){
        training = qwe;
    }

    @Override
    public void showInfo() {
        System.out.printf("Рост: %d\nВес: %d\nЦвет глаз: %s\nКличка: %s\nПорода: %s\nПривит: %s\nДата рождения: %s\nДресирован: %s\n\n"
                , height, weight, colorEyes, name, breed, vaccinations, dateOfBirth,training);
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

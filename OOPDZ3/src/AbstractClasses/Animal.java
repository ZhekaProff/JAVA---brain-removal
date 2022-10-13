package AbstractClasses;

public abstract class Animal implements IAnimals {
    public int height; // рост
    public double weight; // вес
    public String colorEyes; // цвет глаз

    public Animal(int height, double weight, String colorEyes) {
        this.height = height;
        this.weight = weight;
        this.colorEyes = colorEyes;
    }

    public void showInfo(){
        System.out.printf("Рост: %d\nВес: %f\nЦвет глаз: %s", height, weight, colorEyes);
    }
    public void voice(){
        System.out.println("Издать звук");
    }
}

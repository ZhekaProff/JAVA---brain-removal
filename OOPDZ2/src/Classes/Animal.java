package Classes;

import Classes.Interfeses.IAnimals;

public abstract class Animal implements IAnimals {
    public int height; // рост
    public int weight; // вес
    public String colorEyes; // цвет глаз

    public Animal(int height, int weight, String colorEyes) {
        this.height = height;
        this.weight = weight;
        this.colorEyes = colorEyes;
    }
    public void showInfo(){
        System.out.printf("Рост: %d\nВес: %d\nЦвет глаз: %s", height, weight, colorEyes);
    }
    public void voice(){
        System.out.println("Издать звук");
    }
}

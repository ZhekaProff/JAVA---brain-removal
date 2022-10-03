import Classes.Animal;
import Classes.HomeAnimals.Cat;
import Classes.HomeAnimals.Dog;
import Classes.Zoo;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        Cat cat1 = new Cat(10,3, "Белый", "Мурка", "Перс","да","01.01.1996","Есть");
        Dog dog1 = new Dog(9, 3,"Grin","Bob","Kali","no","01.02.2020","No");
        Dog dog2 = new Dog(3,3,"red","Spike", "Murillo", "Da","05/01/2022","Da");
        dog2.showInfo();
        cat1.voice();
        dog1.voice();
        Zoo zoo = new Zoo();
        zoo.addZoo(dog1);
        zoo.addZoo(cat1);
        System.out.println(zoo.getZoo().get(1));


    }
}

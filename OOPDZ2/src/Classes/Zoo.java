package Classes;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> zoo;

    public Zoo() {
        zoo = new ArrayList<>();
    }
    public void addZoo(Animal animal){
        zoo.add(animal);
    }

    public List<Animal> getZoo() {
        return zoo;
    }
}

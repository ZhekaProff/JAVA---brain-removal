package Classes;

public abstract class Drink extends Products{
    Integer volume;

    public Drink(String name, Integer price, Integer quantity, String unitOfMeasure, Integer volume) {
        super(name, price, quantity, unitOfMeasure);
        this.volume = volume;
    }

}

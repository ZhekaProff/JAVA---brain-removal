package Classes;

public class Lemonade extends Drink{

    public Lemonade(String name, Integer price, Integer quantity, String unitOfMeasure, Integer volume) {
        super(name, price, quantity, unitOfMeasure, volume);
    }

    @Override
    public String toString() {
        return String.format("Товар: %s\nЦена:%d\nКол-во:%d\nЕд. измирения: %s\nОбъем: %d\n",
                name, price, quantity, unitOfMeasure, volume);
    }
}

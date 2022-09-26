package Classes;

public class Mask extends HygieneItems{
    public Mask(String name, Integer price, Integer quantity, String unitOfMeasure, Integer quantityInThePackage) {
        super(name, price, quantity, unitOfMeasure, quantityInThePackage);
    }

    @Override
    public String toString() {
        return String.format("Товар: %s\nЦена:%d\nКол-во:%d\nЕд. измирения: %s\nКол-во в упаковке: %d\n",
                name, price, quantity, unitOfMeasure, quantityInThePackage);
    }
}

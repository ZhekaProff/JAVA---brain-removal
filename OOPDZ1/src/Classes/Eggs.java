package Classes;

public class Eggs extends FoodProducts{
    Integer quantityInThePackage;

    public Eggs(String name, Integer price, Integer quantity, String unitOfMeasure, String expirationDate, Integer quantityInThePackage) {
        super(name, price, quantity, unitOfMeasure, expirationDate);
        this.quantityInThePackage = quantityInThePackage;
    }

    @Override
    public String toString() {
        return String.format("Товар: %s\nЦена:%d\nКол-во:%d\nЕд. измирения: %s\nГоден до: %s\nШт в упаковке: %d\n",
                name,price,quantity, unitOfMeasure,expirationDate,quantityInThePackage);
    }
}

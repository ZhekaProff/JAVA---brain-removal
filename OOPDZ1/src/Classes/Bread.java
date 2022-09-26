package Classes;

public class Bread extends FoodProducts {
    String typeOfFlour;

    public Bread(String name, Integer price, Integer quantity, String unitOfMeasure, String expirationDate, String typeOfFlour) {
        super(name, price, quantity, unitOfMeasure, expirationDate);
        this.typeOfFlour = typeOfFlour;
    }

    @Override
    public String toString() {
        return String.format("Товар: %s\nЦена:%d\nКол-во:%d\nЕд. измирения: %s\nГоден до: %s\nТип муки: %s\n",
                name,price,quantity, unitOfMeasure,expirationDate, typeOfFlour);
    }
}

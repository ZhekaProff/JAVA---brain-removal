package Classes;

public class Milk extends FoodProducts {
    Integer percentageOfFatContent;

    public Milk(String name, Integer price,
                Integer quantity, String unitOfMeasure,
                String expirationDate, Integer percentageOfFatContent) {
        super(name,price, quantity,unitOfMeasure, expirationDate);
        this.percentageOfFatContent = percentageOfFatContent;
    }

    @Override
    public String toString() {
        return String.format("Товар: %s\nЦена:%d\nКол-во:%d\nЕд. измирения: %s\nГоден до: %s\nПроцент жирности: %d\n", name,price,quantity, unitOfMeasure,expirationDate,percentageOfFatContent);
    }
}

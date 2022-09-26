package Classes;

public abstract class FoodProducts extends Products{
    String expirationDate;

    public FoodProducts(String name, Integer price,
                        Integer quantity, String unitOfMeasure, String expirationDate) {
        super(name, price,quantity, unitOfMeasure);
        this.expirationDate = expirationDate;
    }
}

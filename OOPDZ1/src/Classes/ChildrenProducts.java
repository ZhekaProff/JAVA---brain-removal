package Classes;

public abstract class ChildrenProducts extends Products{
    Integer minAges;
    String hypoallergenic;

    public ChildrenProducts(String name, Integer price, Integer quantity, String unitOfMeasure, Integer minAges, String hypoallergenic) {
        super(name, price, quantity, unitOfMeasure);
        this.minAges = minAges;
        this.hypoallergenic = hypoallergenic;
    }
}

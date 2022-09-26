package Classes;

public class Diapers extends ChildrenProducts {
    Integer size;
    Integer minWeight;
    Integer maxWeight;
    String type;

    public Diapers(String name, Integer price, Integer quantity, String unitOfMeasure, Integer minAges, String hypoallergenic,
                   Integer size, Integer minWeight, Integer maxWeight, String type) {
        super(name, price, quantity, unitOfMeasure, minAges, hypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("Товар: %s\nЦена:%d\nКол-во:%d\nЕд. измирения: %s\nМин. Возвраст: %d\nГипераллергенный: %s\n" +
                "Размер: %d\nМин.Вес: %d\nМакс.Вес: %d\nТип: %s\n", name, price, quantity, unitOfMeasure, minAges, hypoallergenic, size,minWeight,maxWeight,type);
    }
}



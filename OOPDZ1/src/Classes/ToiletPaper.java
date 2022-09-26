package Classes;

public class ToiletPaper extends HygieneItems{
    Integer numberOfLayers;
    public ToiletPaper(String name, Integer price, Integer quantity, String unitOfMeasure, Integer quantityInThePackage, Integer numberOfLayers) {
        super(name, price, quantity, unitOfMeasure, quantityInThePackage);
        this.numberOfLayers = numberOfLayers;
    }

    @Override
    public String toString() {
        return String.format("Товар: %s\nЦена:%d\nКол-во:%d\nЕд. измирения: %s\nКол-во в упаковке: %d\nКол-во слоев:%d\n",
                name, price, quantity, unitOfMeasure, quantityInThePackage, numberOfLayers);
    }
}

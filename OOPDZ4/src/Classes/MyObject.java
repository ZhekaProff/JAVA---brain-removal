package Classes;

public class MyObject {
    private final String name;
    private final int height;
    private final int weight;

    public MyObject(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}

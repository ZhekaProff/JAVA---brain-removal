package Classes;

public class Pole {
    int size;
    private int [][]array;

    public Pole(int size) {
        this.size = size;
        this.array = new int[size][size];
    }

    public void fillPole(){
        for (int i = 0; i< this.array.length;i++){
            for (int j = 0; j < this.array.length; j++){
                this.array[0][j] = -1;
                this.array[size-1][j] = -1;
                this.array[i][0] = -1;
                this.array[i][size-1] = -1;
            }
        }
    }
    public void print(){
        for (int[] ints : this.array) {
            for (int anInt : ints) {
                System.out.printf("%3d", anInt);
            }
            System.out.println();
        }
        System.out.println();
    }

    public int[][] getArray() {
        return array;
    }

    public void set(int x, int y, int k) {
        this.array[x][y] = k;
    }
}

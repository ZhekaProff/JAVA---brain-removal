import Classes.Pole;
import Classes.Pole2D;
import Classes.WaveAlgo;


public class Task11 {
    public static void main(String[] args) {
        Pole arr = new Pole(10);
        arr.fillPole();
        arr.set(8,5,-3);
        arr.set(7,4,-1);
        arr.set(7,5,-1);
        arr.set(7,6,-1);
        arr.print();

        var lee = new WaveAlgo(arr.getArray());
        lee.way(new Pole2D(3,4));
        arr.print();







    }
}

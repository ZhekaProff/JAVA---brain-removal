package Classes;

import java.util.LinkedList;
import java.util.Queue;

public class WaveAlgo {
    int[][] map;

    public WaveAlgo(int[][] map) {
        this.map = map;
    }

    public void way(Pole2D start) {
        Queue<Pole2D> queue = new LinkedList<>();
        queue.add(start);
        map[start.x][start.y] = 1;

        while (queue.size() != 0) {
            Pole2D p = queue.remove();

            if (map[p.x - 1][p.y] == -3) break;
            if (map[p.x - 1][p.y] == 0) {
                queue.add(new Pole2D(p.x - 1, p.y));
                map[p.x - 1][p.y] = map[p.x][p.y] + 1;
            }
            if (map[p.x][p.y - 1] == -3) break;
            if (map[p.x][p.y - 1] == 0) {
                queue.add(new Pole2D(p.x, p.y - 1));
                map[p.x][p.y - 1] = map[p.x][p.y] + 1;
            }
            if (map[p.x + 1][p.y] == -3) break;
            if (map[p.x + 1][p.y] == 0) {
                queue.add(new Pole2D(p.x + 1, p.y));
                map[p.x + 1][p.y] = map[p.x][p.y] + 1;
            }
            if (map[p.x][p.y + 1] == -3) break;
            if (map[p.x][p.y + 1] == 0) {
                queue.add(new Pole2D(p.x, p.y + 1));
                map[p.x][p.y + 1] = map[p.x][p.y] + 1;
            }


        }

    }

}

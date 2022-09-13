/*
* Написать программу, показывающую последовательность действий для игры “Ханойская башня”
*/
public class Task04 {
    public static String[][] arr = {{"1","2","3"},{"|","|","|"},{"|","|","|"}};

    public static void moveField(String[][] arr, int from, int to) {


        System.out.println();

        for (int i = 0; i < 3; i++) {
            if (arr[from-1][i] != "|") {
                for (int j = 2; j >= 0; j--) {
                    if (arr[to-1][j] == "|") {
                        String swap = arr[from-1][i];
                        arr[from-1][i] = arr[to-1][j];
                        arr[to-1][j] = swap;
                        break;
                    }
                }
                break;
            }
        }

        for (int j = 0; j<3;j++) {

            for (int i = 0;i<3;i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }

    public static void hanoi(String from, String to, String buf, int count) {

        if (count > 1)
            hanoi(from, buf, to, count - 1);
        //System.out.printf("%s >> %s%n", from, to);
        moveField(arr, Integer.parseInt(from), Integer.parseInt(to));
        if (count > 1)
            hanoi(buf, to, from, count - 1);

    }

    public static void main(String[] args) {

        for (int j = 0; j<3;j++) {

            for (int i = 0;i<3;i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

        hanoi("1", "3", "2", 3);

    }



}

// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

public class Exs0102 {
    public static int sum2d(String[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 3; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String [][] array = {{"3","2","3"},
                            {"4","5","3"}};


        System.out.println(sum2d(array));
    }
}
//==============Возможные ошибки===============
// 1. Выход за границы массива java.lang.ArrayIndexOutOfBoundsException
// 2. Ошибка формата           java.lang.NumberFormatException
// 3.
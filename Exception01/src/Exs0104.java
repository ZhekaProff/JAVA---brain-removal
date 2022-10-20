import java.util.Arrays;

public class Exs0104 {

    public static int [] divisionArray(int[]array, int[] array2){
        int [] array3 = new int[array.length];
        if (array.length != array2.length)
            throw new RuntimeException("Длины массивов не равны");
        for (int i = 0; i < array.length; i++) {
            if(array2[i] == 0)
                throw new RuntimeException("На ноль делить нельзя!!!");
            array3[i] = array[i]/array2[i];
        }
        return array3;
    }

    public static void main(String[] args) {
        int [] array = {1,2,3};
        int [] array2 = {1,2,0};
        System.out.println(Arrays.toString(divisionArray(array,array2)));
    }
}

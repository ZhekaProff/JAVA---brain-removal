/**
 * Если необходимо, исправьте данный код
 */

public class Ext02 {

    public static void qwerty(int [] intArray) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        qwerty(array);
    }

}

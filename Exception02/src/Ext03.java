import java.io.FileNotFoundException;

/**
 *  Дан следующий код, исправьте его там, где требуется
 */

public class Ext03 {
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 1; // деление на ноль
            System.out.println(a / b);

            printSum(23, 12); // null
            int[] abc = { 1, 2 };
            abc[1] = 9; // выход за массив
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
}

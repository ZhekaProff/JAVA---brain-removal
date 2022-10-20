import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.*
 */


public class Ext01 {
    public static float interNumber(){
        boolean check = true;
        float count = 0.0f;
        System.out.println("ВВедите дробное число");
        while (check){
            try {
                count = new Scanner(System.in).nextFloat();
                check = false;
            } catch (Exception e){
                System.out.println(e.getMessage() + " Попробуйте снова");
            }
        }
        return count;
    }

    public static void main(String[] args) {
        float number = interNumber();
        System.out.println(number);
    }
}

import java.util.Scanner;

/**
 *  Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 *  Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */


public class Ext04 {
    public static String interString() {
        String str = "";
        Scanner scanner = new Scanner(System.in);
        String str2 = scanner.nextLine();
        if (str2.equals(str)) {
            throw new RuntimeException("Пустые строки вводить нельзя");
        }
        return str2;
    }

    public static void main(String[] args) {
        String str = interString();
        System.out.println(str);
    }


}

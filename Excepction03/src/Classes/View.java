package Classes;

import java.util.Scanner;

public class View {
    static Scanner scanner = new Scanner(System.in);
    public static int inputInt(String text){
        System.out.print(text);
        return scanner.nextInt();
    }
    public static void mainMenu() {
        System.out.println();
        System.out.println("Главное меню");
        System.out.println("1: Добавить контакт");
        System.out.println("0: Выход");
    }

    public static void textMain(){
        System.out.println("Введите: Фамилия Имя Отчество дата Рожения(dd.MM.yyyy) телефон пол(m/f)");
    }


}

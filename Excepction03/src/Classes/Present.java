package Classes;

import Classes.CheckData;
import Classes.MyFileWriter;

import java.io.IOException;
import java.util.InputMismatchException;

public class Present {
    public static void caseOne() throws IOException {
        View.textMain();
        String[] array = new String[6];
        MyFileWriter.fileChecked(CheckData.checkData(array));
    }

    public static void start() throws IOException {
        boolean menu = true;
        while (menu) {
            View.mainMenu();
            try {
                int choice = View.inputInt("Выберите пункт: ");
                switch (choice) {
                    case 1 -> caseOne();
                    case 0 -> menu = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Введите 1 или 2");
            }
        }
    }
}

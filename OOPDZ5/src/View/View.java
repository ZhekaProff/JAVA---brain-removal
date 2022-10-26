package View;

import Model.Company;
import Model.People;
import Model.Worker;

import java.util.Scanner;

public class View {
    static Scanner scanner = new Scanner(System.in);

    public static int inputInt(String text) {
        System.out.print(text);
        int srt = scanner.nextInt();
        return srt;
    }

    public static String inputString(String text) {
        System.out.print(text);
        String str = scanner.next();
        return str;
    }

    public static void companyInfo(Company company) {
        System.out.println("Название организации: " + company.getName());
        System.out.println("Адрес: " + company.getAddress());
        System.out.println("Владелец: " + company.getOwner().getName());
        System.out.println("Штат сотрудников: " + company.getWorkers().size() + " человек");
    }


    public static void showWorkers(Company company) {
        System.out.println("Сотрудники компании: ");
        for (Worker worker : company.getWorkers()) {
            System.out.println(worker);
        }
    }

    public static void showCandidates(Company company) {
        int count = 0;
        for (People candid : company.hrd.getCandidates()) {
            System.out.println(++count + " " + candid);
        }
    }

    public static void showTotalSalary(Company company) {
        int sum = 0;
        for (Worker worker : company.getWorkers()) {
            sum += worker.getSalary();
        }
        System.out.println("Общая ЗП сотрудников: " + sum);
    }

    public static void mainMenu() {
        System.out.println();
        System.out.println("Главное меню");
        System.out.println("1: Информация о компании");
        System.out.println("2: Сотрудники компании");
        System.out.println("3: Общая зарплата");
        System.out.println("4: Добавить сотрудника");
        System.out.println("5: Уволить сотрудника");
        System.out.println("0: Выход");
    }
}

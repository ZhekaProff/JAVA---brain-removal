import Model.Company;
import Model.People;

public class Main {
    public static void main(String[] args) {
        People kadeykin = new People("Кадейкин", 34);
        Company codeFathers = new Company("CF", "Discord", kadeykin);
        People kadeykin1 = new People("Кадейкин1", 34);
        People stone = new People("Кирилл", 38);
        codeFathers.hiring(kadeykin1, "Завхоз", 200);
        codeFathers.showWorkers();
        codeFathers.hiring(stone, "Блогер", 50);
        System.out.println(codeFathers);
    }
}

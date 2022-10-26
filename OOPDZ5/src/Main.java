import Model.Company;
import Model.People;
import Present.*;
import View.*;


public class Main {
    public static void main(String[] args) {
        People kadeykin = new People("Кадейкин", 34);
        Company kadfather = new Company("Кадейкин и Ко", "Discord", kadeykin);
        People kadeykin1 = new People("Кадейкин1", 34);
        People stone = new People("Кирилл", 38);
        kadfather.hiring(kadeykin1, "Завхоз", 200);
        kadfather.hiring(stone, "Блогер", 50);

        Present.start(kadfather);
    }
}

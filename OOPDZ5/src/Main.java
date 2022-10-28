import Model.Company;
import Model.People;
import Model.Worker;
import Present.*;
import View.*;


public class Main {
    public static void main(String[] args) {
        People kadeykin = new People("Кадейкин", 34);
        Company kadfather = new Company("Кадейкин и Ко", "Discord", kadeykin);
        Present.start(kadfather);
    }
}

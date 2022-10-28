package Present;


import Model.Company;
import View.View;

public class Present {
    public static void start(Company company) {
        boolean menu = true;
        while (menu) {
            View.mainMenu();
            int choice = View.inputInt("Выберете пункт меню: ");
            switch (choice) {
                case 1:
                    View.companyInfo(company);
                    break;
                case 2:
                    View.showWorkers(company);
                    break;
                case 3:
                    View.showTotalSalary(company);
                    break;
                case 4:
                    Company.addWorker(company);
                    break;
                case 5:
                    Company.removeWorker(company);
                    break;
                case 0:
                    menu = false;

            }

        }
    }
}



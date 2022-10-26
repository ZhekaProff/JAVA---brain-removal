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
                    addWorker(company);
                    break;
                case 5:
                    removeWorker(company);
                    break;
                case 0:
                    menu = false;

            }

        }
    }
    public static void addWorker(Company company){
        if (company.hrd.getCandidates().size() < 1){
            System.out.println("Кандидатов на работу нет");
        }
        else {
            View.showCandidates(company);
            int id = View.inputInt("Введите ID кандидата: ");
            String post = View.inputString("Введите желаемую должность: ");
            Integer sallary = View.inputInt("Введите желаемую зарплату: ");
            company.hiring(company.hrd.getCandidates().get(id-1) ,post,sallary);
        }
    }

    public static void removeWorker(Company company){
        String name = View.inputString("Введите имя работника: ");
        company.fire(name);
    }


}



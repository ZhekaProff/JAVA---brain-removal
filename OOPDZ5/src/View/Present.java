package View;


import Model.Company;

public class Present {
    public void start(){
        while (true){
           View.mainMenu();
           int cheice =  View.inputInt("Выбирете пункт меню: ");
           switch (cheice){
               case 1: View.showTotalSalary();
               case 2:
               case 3:
               case 4:
               case 5:
               default:


           }

        }

    }
}

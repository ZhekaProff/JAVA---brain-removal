public class Present {
    public static void start(){
        boolean menu = true;
        while (menu){
            View.mainMenu();
            int choice = View.inputInt("Выбирите пункт меню: ");
            switch (choice) {
                case 1 -> System.out.println("123");
                case 0 -> menu = false;
            }


        }
    }
}

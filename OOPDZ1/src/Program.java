import Classes.*;

public class Program {
    public static void allPrint(Products object){
        System.out.println(object);
    }

    public static void main(String[] args) {
        Milk milk1 = new Milk("Milk", 5,1,"Литр","2023",3);
        Bread bread1 = new Bread("Мука", 6,1,"Кг","2023","Ржаная");
        Drink lemonade1 = new Lemonade("Лемонад", 10,2,"Литр", 1);
        Eggs eggs1 = new Eggs("Яйца", 5,2,"Штук", "2024",20);
        Mask mask1 = new Mask("Маска", 15,1, "ШТ",20);
        ToiletPaper toiletPaper = new ToiletPaper("Зева", 15,1, "ШТ",20,3);
        Diapers diapers = new Diapers("Хагис",1200,1,"Штук", 1,"Нет",15, 5,7,"Трусики");
        Nipple nipple = new Nipple("Соска",1200,1,"Штук", 1,"Нет");
        System.out.println(milk1);
//        System.out.println(bread1);
//        System.out.println(lemonade1);
//        System.out.println(eggs1);
//        System.out.println(mask1);
//        System.out.println(toiletPaper);
//        System.out.println(diapers);
//        System.out.println(nipple);
        allPrint(bread1);



    }
}

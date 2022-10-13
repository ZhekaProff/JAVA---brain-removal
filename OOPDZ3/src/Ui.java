import Animals.*;
import Zoo.AnimalParamCreator;
import Zoo.Zoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ui {
    private static final Zoo zoo = new Zoo();
    private static final AnimalParamCreator apc = new AnimalParamCreator();
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static boolean isWork = true;



    private static int getOperation() throws IOException{
        System.out.println("Choose operation:");
        System.out.println("Add an animal to the zoo, press 1");
        System.out.println("Delete the animal from the zoo, press 2");
        System.out.println("Get info from the zoo, press 3");
        System.out.println("Exit from the zoo, press 0");

        return Integer.parseInt(reader.readLine());
    }
    public static void getInfo() throws IOException{
        System.out.println("For show info about an animal press 1");
        System.out.println("For show info about all animals press 2");
        System.out.println("For play animal's cry press 3");
        System.out.println("For play all animals' cries press 4");

        switch (Integer.parseInt(reader.readLine())){
            case (1) -> showInfo();
            case (2) -> showAllInfo();
            case (3) -> playCry();
            case (4) -> playAllCry();
        }
    }
    private static void addAnimal() throws IOException{
        System.out.println("For adding a cat press 1");
        System.out.println("For adding a dog press 2");
        System.out.println("For adding a hen press 3");
        System.out.println("For adding a stork press 4");
        System.out.println("For adding a tiger press 5");
        System.out.println("For adding a wolf press 6");

        switch (Integer.parseInt(reader.readLine())){
            case (1) -> addCat();
            case (2) -> addDog();
            case (3) -> addHen();
            case (4) -> addStork();
            case (5) -> addTiger();
            case (6) -> addWolf();
        }
    }
    private static void addCat() throws IOException{
        zoo.addAnimal(apc.getIndex("cat"),
                new Cat(apc.getHeight("cat"),
                        apc.getWeight("cat"),
                        apc.getEyesColor("cat"),
                        apc.getName("cat"),
                        apc.getBreed("cat"),
                        apc.getVaccinations("cat"),
                        apc.getWoolColor("cat"),
                        apc.getBirthday("cat"),
                        apc.getWoolPresence("cat")));
    }

    private static void addDog() throws IOException{
        zoo.addAnimal(apc.getIndex("dog"),
                new Dog(apc.getHeight("dog"),
                        apc.getWeight("dog"),
                        apc.getEyesColor("dog"),
                        apc.getName("dog"),
                        apc.getBreed("dog"),
                        apc.getVaccinations("dog"),
                        apc.getWoolColor("dog"),
                        apc.getBirthday("dog"),
                        apc.getTraining("dog")));
    }
    private static void addHen() throws IOException{
        zoo.addAnimal(apc.getIndex("hen"),
                new Hen(apc.getHeight("hen"),
                        (int) apc.getWeight("hen"),
                        apc.getEyesColor("hen"),
                        0));
    }

    private static void addStork() throws IOException{
        zoo.addAnimal(apc.getIndex("stork"),
                new Stork(apc.getHeight("stork"),
                        (int) apc.getWeight("stork"),
                        apc.getEyesColor("stork"),
                        apc.getFlightHeight("stork")));
    }
    private static void addTiger() throws IOException{
        zoo.addAnimal(apc.getIndex("tiger"),
                new Tiger(apc.getHeight("tiger"),
                        apc.getWeight("tiger"),
                        apc.getEyesColor("tiger"),
                        apc.getHabitat("tiger"),
                        apc.getDateFinding("tiger")));
    }

    private static void addWolf() throws IOException{
        zoo.addAnimal(apc.getIndex("wolf"),
                new Wolf(apc.getHeight("wolf"),
                        apc.getWeight("wolf"),
                        apc.getEyesColor("wolf"),
                        apc.getHabitat("wolf"),
                        apc.getDateFinding("wolf"),
                        apc.getLeader("wolf")));
    }


    public static void delAnimal() throws IOException{
        System.out.println("Enter the animal's index to delete");
        zoo.delAnimal(Integer.parseInt(reader.readLine()));
    }
    public static void showInfo() throws IOException{
        System.out.println("Enter animal index to get info");
        zoo.printInfo(Integer.parseInt(reader.readLine()));
    }
    public static void showAllInfo() throws IOException{
        System.out.println("Show info about all animals in the zoo");
        zoo.printAllInfo();
    }
    public static void playCry() throws IOException{
        System.out.println("Enter animal index to play cry");
        zoo.playCry(Integer.parseInt(reader.readLine()));
    }
    public static void playAllCry() throws IOException{
        System.out.println("Play cry all animals in the zoo");
        zoo.playAllVoice();
    }




    public static void main() throws IOException {
        System.out.println("Welcome to our zoo!!!\n");
        while (isWork){
            int operation = getOperation();
            switch (operation){
                case (1) -> addAnimal();
                case (2) -> delAnimal();
                case (3) -> getInfo();
                case (0) -> isWork = false;
            }
        }
    }
}
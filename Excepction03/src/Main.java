import Exceptions.ExceptionSex;
import Exceptions.NameException;
import Exceptions.TelephoneException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    final static String DATE_FORMAT = "dd.MM.yyyy";
    final static String PATH_FORMAT = "src/Data/";


    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
    }

    public static boolean checkLange(String[] array) {
        if (array.length < 6)
            throw new RuntimeException();
        else if (array.length > 6) {
            throw new RuntimeException();
        }
        return true;
    }

    public static boolean checkSurname(String[] array) throws NameException {
        char[] strToArray = array[0].toCharArray();
        for (char c : strToArray) {
            if (Character.isDigit(c)) {
                throw new NameException();
            }
        }
        return true;
    }

    public static boolean checkName(String[] array) throws NameException {
        char[] strToArray = array[1].toCharArray();
        for (char c : strToArray) {
            if (Character.isDigit(c)) {
                throw new NameException();
            }
        }
        return true;
    }
    public static boolean checkMiddleName(String[] array) throws NameException {
        char[] chars = array[2].toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                throw new NameException();
            }
        }
        return true;
    }
    public static boolean isDateValid(String[] array) throws ParseException {
        DateFormat df = new SimpleDateFormat(DATE_FORMAT);
        df.setLenient(false);
        df.parse(array[3]);
        return true;
    }



    public static boolean checkTelephone(String[] array) throws TelephoneException {
        if (array[4].length() != 10){
            throw new TelephoneException();
        }
        char[] chars = array[4].toCharArray();
        for (char c : chars) {
            if(Character.isLetter(c)) {
                throw new TelephoneException();
            }
        }
        return true;
    }
    public static boolean checkSex(String[] array) throws ExceptionSex {
        if((!Objects.equals(array[5], "m")) && (!Objects.equals(array[5], "f"))){
            throw new ExceptionSex();
        }
        return true;
    }


    public static void fileChecked(String[] array) throws IOException {
        String path = PATH_FORMAT + array[0] + ".txt";
        if(Files.isRegularFile(Path.of(path))){
            System.out.println("да");
            fileWrite(array);

        }else{
            System.out.println("нет");
            String path1 = PATH_FORMAT + array[0] + ".txt";
            Files.createFile(Path.of(path1));
            fileWrite(array);
        }


    }

    public static void fileWrite(String[] array)  {
        String filePath = PATH_FORMAT + array[0] + ".txt";
        String text = String.join(" ", array);

        try (FileWriter fw = new FileWriter(filePath, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)){
            out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        boolean check = true;
        String[] array = new String[6];
        while (check) {
            try {
                array = new Scanner(System.in).nextLine().split(" ");
                check = checkLange(array);
                check = checkSurname(array);
                check = checkName(array);
                check = checkMiddleName(array);
                check = isDateValid(array);
                check = checkTelephone(array);
                check = checkSex(array);
                check = false;
            } catch (RuntimeException e) {
                System.out.println("Проверьте введеные данные");
            } catch (TelephoneException e) {
                System.out.println("Телефон: " + " " + array[4] + "> " + "Указан не коректно"  );
            } catch (NameException e) {
                System.out.println("Фамилия Имя Отчество: "
                                        + "<" + array[0] + "> "
                                        + "<" + array[1] + "> "
                                        + "<" + array[2] + "> "
                                        + "Указаны не коректно");
            }catch (ParseException e){
                System.out.println("Дата: " + "<" + array[3] + "> " + "Указана не коректно");

            }catch (ExceptionSex e){
                System.out.println("Пол указан не верно");
            }
        }
        fileChecked(array);
    }
}



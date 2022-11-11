package Classes;

import Exceptions.ExceptionGender;
import Exceptions.NameException;
import Exceptions.TelephoneException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Objects;
import java.util.Scanner;

public class CheckData {
    final static String DATE_FORMAT = "dd.MM.yyyy";
    private static boolean checkLange(String[] array) {
        if (array.length < 6)
            throw new RuntimeException();
        else if (array.length > 6) {
            throw new RuntimeException();
        }
        return true;
    }

    private static boolean checkSurname(String[] array) throws NameException {
        char[] strToArray = array[0].toCharArray();
        for (char c : strToArray) {
            if (Character.isDigit(c)) {
                throw new NameException();
            }
        }
        return true;
    }

    private static boolean checkName(String[] array) throws NameException {
        char[] strToArray = array[1].toCharArray();
        for (char c : strToArray) {
            if (Character.isDigit(c)) {
                throw new NameException();
            }
        }
        return true;
    }
    private static boolean checkMiddleName(String[] array) throws NameException {
        char[] chars = array[2].toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                throw new NameException();
            }
        }
        return true;
    }
    private static boolean isDateValid(String[] array) throws ParseException {
        DateFormat df = new SimpleDateFormat(DATE_FORMAT);
        df.setLenient(false);
        df.parse(array[3]);
        return true;
    }



    private static boolean checkTelephone(String[] array) throws TelephoneException {
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
    private static boolean checkGender(String[] array) throws ExceptionGender {
        if((!Objects.equals(array[5], "m")) && (!Objects.equals(array[5], "f"))){
            throw new ExceptionGender();
        }
        return true;
    }

    public static String[] checkData(String[] array){
        boolean check = true;
        while (check) {
            try {
                array = new Scanner(System.in).nextLine().split(" ");
                check = checkLange(array);
                check = checkSurname(array);
                check = checkName(array);
                check = checkMiddleName(array);
                check = isDateValid(array);
                check = checkTelephone(array);
                check = checkGender(array);
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

            }catch (ExceptionGender e){
                System.out.println("Пол указан не верно");
            }
        }
        for (String element : array) {
            System.out.print(element + " ");
        }
        return array;
    }





}

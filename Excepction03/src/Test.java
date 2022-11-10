import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test {
    final static String DATE_FORMAT = "dd.MM.yyyy";

    public static boolean isDateValid(String date) throws ParseException {
        DateFormat df = new SimpleDateFormat(DATE_FORMAT);
        df.setLenient(false);
        df.parse(date);
        return true;
    }


    public static void main(String[] args) throws ParseException {
//        String s = "30.10.2022";
//        System.out.println(isDateValid(s));

//        System.out.println(Files.isRegularFile(Path.of(path)));
//

    }
}

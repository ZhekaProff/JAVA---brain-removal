package Classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class MyFileWriter {
    final static String PATH_FORMAT = "src/Data/";

    public static void fileChecked(String[] array) throws IOException {
        String path = PATH_FORMAT + array[0] + ".txt";
        if(Files.isRegularFile(Path.of(path))){
            fileWrite(array);

        }else{
            String path1 = PATH_FORMAT + array[0] + ".txt";
            Files.createFile(Path.of(path1));
            fileWrite(array);
        }
    }

    private static void fileWrite(String[] array)  {
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

}

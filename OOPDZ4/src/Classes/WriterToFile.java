package Classes;

import java.io.FileWriter;
import java.io.IOException;

public class WriterToFile {
    public <E> void  writeToFile(E object) throws IOException, NoSuchFieldException, IllegalAccessException {
        FileWriter writer = new FileWriter("src/data/data.txt", true);
        if(object.getClass().getSimpleName().equals(Integer.class.getSimpleName())){
            writer.write((Integer) object + "\n");
        } else if (object.getClass().getSimpleName().equals(String.class.getSimpleName())) {
            writer.write("\"" + (String) object + "\"\n");
        } else if (object.getClass().getSimpleName().equals(MyObject.class.getSimpleName())) {
            String toWrite = new ClassToJson<E>(object).create();
            writer.write(toWrite + "\n");
        }
        writer.close();
    }
}

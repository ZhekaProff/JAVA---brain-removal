import Classes.FReader;
import Classes.MyObject;
import Classes.WriterToFile;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, IOException, ClassNotFoundException {
        WriterToFile wtf = new WriterToFile();
        FReader reader = new FReader();

        MyObject object = new MyObject("Vasia", 180, 80);
        String str = "Hello";
        int num = 456;

        wtf.writeToFile(object);
        wtf.writeToFile(str);
        wtf.writeToFile(num);
        reader.printFile();

        MyObject myObject = reader.getElementFromFile(MyObject.class.getSimpleName());
        System.out.println("Recovered file myObject contains next fields");
        System.out.printf("name = %s\nheight = %d\nweight = %d\n", myObject.getName(),
                myObject.getHeight(),
                myObject.getWeight());

        String s = reader.getElementFromFile(String.class.getSimpleName());
        System.out.printf("\nRecovered string contains %s\n",s);

        int number = reader.getElementFromFile(int.class.getSimpleName());
        System.out.printf("\nRecovered number contains %d\n",number);
    }
}

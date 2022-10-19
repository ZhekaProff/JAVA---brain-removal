package Interfaces;

import java.io.IOException;

public interface ReadFromFile {
    void printFile() throws IOException;
    <E> E getElementFromFile(String type) throws IOException, ClassNotFoundException;

}

package Interfaces;

public interface CreateJson {
    String create() throws NoSuchFieldException, IllegalAccessException;

    String getValue(String fieldName) throws NoSuchFieldException, IllegalAccessException;
}

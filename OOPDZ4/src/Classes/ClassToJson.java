package Classes;

import Interfaces.CreateJson;

import java.lang.reflect.Field;

public class ClassToJson<E> implements CreateJson {
    private final E object;

    public ClassToJson(E object) {
        this.object = object;
    }
    @Override
    public String create() throws NoSuchFieldException, IllegalAccessException {
        String result = "";
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        Field[] field = this.object.getClass().getDeclaredFields();
        for(int i=0;i<field.length;i++){
            sb.append("\"").
                    append(field[i].getName()).
                    append("\"").
                    append(":").
                    append(getValue(field[i].getName()));
            if(i< field.length-1)
                sb.append(",");
        }
        sb.append("}");
        result = sb.toString();
        return result;
    }
    @Override
    public String getValue(String fieldName) throws NoSuchFieldException, IllegalAccessException {
        String result ="";
        Field field = this.object.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);

        if(field.getType().getSimpleName().equals(String.class.getSimpleName())){
            result = (String)field.get(this.object);
        } else if (field.getType().getSimpleName().equals(int.class.getSimpleName())) {
            int i = field.getInt(this.object);
            result = Integer.toString(i);
        }
        return result;
    }

}
